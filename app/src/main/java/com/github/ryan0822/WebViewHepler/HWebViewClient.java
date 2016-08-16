package com.github.ryan0822.WebViewHepler;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.github.ryan0822.WebViewHepler.parser.IntentModel;
import com.github.ryan0822.WebViewHepler.parser.IntentParser;
import com.github.ryan0822.WebViewHepler.parser.IntentParserImpl;

/**
 * Created by ryan on 16. 8. 16..
 */
public class HWebViewClient extends WebViewClient {

    private IntentParser parser = new IntentParserImpl();

    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        if (url != null && url.startsWith("mailto:")) {
            view.getContext().startActivity(new Intent(Intent.ACTION_SENDTO, Uri.parse(url)));
            return true;

        } else if (url != null && url.startsWith("market://")) {
            view.getContext().startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url)));
            return true;
            
        } else if (url.startsWith("intent://")) {
            IntentModel intentModel = parser.parseUrl(url);
            Intent intent = new Intent(Intent.ACTION_VIEW);

            String action = intentModel.getAction();
            if (action != null && !action.equals("")) {
                intent.setAction(action);
            }

            String component = intentModel.getComponent();
            if (component != null && !component.equals("")) {
                intent.setComponent(new ComponentName(intentModel.getPackageName(), intentModel.getComponent()));
            }

            intent.setPackage(intentModel.getPackageName());
            intent.addCategory(intentModel.getCategory());
            intent.setData(Uri.parse(intentModel.getUriString()));

            try {
                view.getContext().startActivity(intent);
            } catch (ActivityNotFoundException e) {
                view.getContext().startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + intentModel.getPackageName())));
            }

            return true;

        } else {
            return super.shouldOverrideUrlLoading(view, url);
        }
    }
}

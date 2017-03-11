package com.github.ryan0822.WebViewHepler.parser;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ryan on 16. 8. 16..
 */
public class IntentModel {

    static final String KEY_SCHEME = "scheme";
    static final String KEY_CATEGORY = "category";
    static final String KEY_PACKAGE_NAME = "package";
    static final String KEY_INTENT_STRING = "intentString";
    static final String KEY_ACTION = "action";
    static final String KEY_FALLBACK = "S.browser_fallback_url";
    static final String KEY_COMPONENT = "component";
    static final String KEY_URI = "uri";

    Map<String, String> map = new HashMap<String, String>();
    private String uriString;

    public String getScheme() {
        return map.get(KEY_SCHEME);
    }

    public String getCategory() {
        return map.get(KEY_CATEGORY);
    }
    
    public String getComponent() {
        return map.get(KEY_COMPONENT);
    }

    public String getPackageName() {
        return map.get(KEY_PACKAGE_NAME);
    }

    public String getAction() {
        return map.get(KEY_ACTION);
    }

    public String getFallback() {
        return map.get(KEY_FALLBACK);
    }

    public String getIntentString() {
        return map.get(KEY_INTENT_STRING);
    }

    public String getUriString() {
        String uri = map.get(KEY_URI);
        String scheme = getScheme();

        if(scheme != null && scheme.length() > 0) {
            return uri.replace("intent", scheme);
        } else {
            return uri;
        }
    }
}

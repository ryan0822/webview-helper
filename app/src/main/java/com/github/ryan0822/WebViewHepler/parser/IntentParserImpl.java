package com.github.ryan0822.WebViewHepler.parser;

/**
 * Created by ryan on 16. 8. 16..
 */
public class IntentParserImpl implements IntentParser {

    private static final String INTENT_PREFIX = "#Intent;";
    private static final String INTENT_SUFFIX = "end";

    @Override
    public IntentModel parseUrl(String url) {
        IntentModel intentModel = new IntentModel();

        String tmp = url.substring(url.indexOf(INTENT_PREFIX));
        String intentString = tmp.substring(0, tmp.indexOf(INTENT_SUFFIX) + INTENT_SUFFIX.length());
        setIntentModelByIntentString(intentModel, intentString);
        return intentModel;
    }

    private void setIntentModelByIntentString(IntentModel intentModel, String intentString) {
        String[] tmp = intentString.replace(INTENT_PREFIX, "")
                .replace(INTENT_SUFFIX, "")
                .split(";");

        for (String keyValue : tmp) {
            String[] tmp2 = keyValue.split("=");

            if (tmp2.length == 2) {
                intentModel.map.put(tmp2[0], tmp2[1]);
            }
        }
    }
}

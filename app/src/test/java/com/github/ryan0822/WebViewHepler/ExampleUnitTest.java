package com.github.ryan0822.WebViewHepler;

import com.github.ryan0822.WebViewHepler.parser.IntentParserImpl;

import org.junit.Test;

import java.util.regex.Pattern;

import static org.junit.Assert.assertEquals;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void testParser() throws Exception {
        String naverPlayer = "intent://vod_play?serviceID=2002&advertiseInfo=%5B%7B%22adSystem%22%3A%22AMS%22%7D%5D&advertiseUrl=http%3A%2F%2Fams.rmcnmv.naver.com%2Fitem%2Fcreate%2F2002%2FNAVER%3Fams_ctgr%3DNSPORTS%26ams_chnl%3Dkleague%26ams_videoId%3D8E515B49A254A0CE949D4D08BCD2F78BB15E%26ams_cp%3D332%26unit%3D1104A%26cl%3D1047396%26svc%3Dsportvod%26st%3D354%26ams_rule%3D%255B%257B%2522type%2522%253A%2522pre%2522%252C%2522exposure%2522%253Atrue%252C%2522replayExposure%2522%253Atrue%257D%252C%257B%2522type%2522%253A%2522post%2522%252C%2522exposure%2522%253Atrue%252C%2522replayExposure%2522%253Atrue%257D%255D%26cc%3DN&host=http%3A%2F%2Fserviceapi.rmcnmv.naver.com&masterVideoId=8E515B49A254A0CE949D4D08BCD2F78BB15E&curVideoID=8E515B49A254A0CE949D4D08BCD2F78BB15E&curVideoEncodingOptionId=720P_1280_2048_192&playTime=433.019&isAdult=N&title=%EC%A0%9C%EC%A3%BC%20%EC%9C%A0%EB%82%98%EC%9D%B4%ED%8B%B0%EB%93%9C%20%3A%20%EA%B4%91%EC%A3%BC%20FC%20%EA%B2%BD%EA%B8%B0%20%ED%95%98%EC%9D%B4%EB%9D%BC%EC%9D%B4%ED%8A%B8&videoQualityList=(%EC%9D%BC%EB%B0%98%ED%99%94%EC%A7%88%2C3208DA9EEAD3A89D1743928155487839090E)%2C(%EA%B3%A0%ED%99%94%EC%A7%88%2CE86976E8CFAFE31A315CDCE3DCF38D98BC09)%2C(HD%ED%99%94%EC%A7%88%2C8E515B49A254A0CE949D4D08BCD2F78BB15E)&playableEncodingOption=270P%2C450P%2C480P%2C540P%2C640P%2C720P&curVideoPlayUrl=http%3A%2F%2Fsports.video.p.rmcnmv.naver.com%2Fowfs_rmc%2Fread%2Fsports_2016_08_14_4%2F531C05F36308F38C7F334E0C93395E13F82_muploader_k_720P_1280_2048_192.mp4%3F_lsu_sa_%3D6bf577f911dc68a6e7d985466385b3b7ce163928d1089f293a7771ca07173c85c323caaf6395f40af0713b528b3f2bd9c955b6fa42a4e367cb361b2d3bd8ee2ce7fc29716610c3bd0cde4be890e9ecbd&useP2P=N&trackings=%5B%7B%22event%22%3A%22progress%22%2C%22offset%22%3A%221%22%2C%22url%22%3A%22http%3A%2F%2Fvts.rmcnmv.naver.com%2Fvts%2Ftrace%2Frun%2Fv1.0%2FeyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJkdXJhdGlvbiI6NDMzLjAxOSwicGxheWVyVHlwZSI6Im5tcF9hIiwicGxheWVySWQiOiJybWNQbGF5ZXJfMTQ3MTMxMjQ3Njk1NTE5MDIiLCJleHRlcm5hbFRyYWNraW5nRGF0YUpTT04iOiIiLCJldmVudCI6InByb2dyZXNzIiwidmlkZW9JZCI6IjhFNTE1QjQ5QTI1NEEwQ0U5NDlENEQwOEJDRDJGNzhCQjE1RSIsIm9mZnNldCI6MH0.y1dU4L3MEETqRObCz7YpZ_3qJqPQQo6SbRZV6kWT_68%22%7D%2C%7B%22event%22%3A%22progress%22%2C%22offset%22%3A%2210%22%2C%22url%22%3A%22http%3A%2F%2Fvts.rmcnmv.naver.com%2Fvts%2Ftrace%2Frun%2Fv1.0%2FeyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJkdXJhdGlvbiI6NDMzLjAxOSwicGxheWVyVHlwZSI6Im5tcF9hIiwicGxheWVySWQiOiJybWNQbGF5ZXJfMTQ3MTMxMjQ3Njk1NTE5MDIiLCJleHRlcm5hbFRyYWNraW5nRGF0YUpTT04iOiIiLCJldmVudCI6InByb2dyZXNzIiwidmlkZW9JZCI6IjhFNTE1QjQ5QTI1NEEwQ0U5NDlENEQwOEJDRDJGNzhCQjE1RSIsIm9mZnNldCI6MTB9.O_QnlllWzGX2tKbOZ_dKeT2061raGYCtvkKMaGyw4DI%22%7D%2C%7B%22event%22%3A%22progress%22%2C%22offset%22%3A%2220%22%2C%22url%22%3A%22http%3A%2F%2Fvts.rmcnmv.naver.com%2Fvts%2Ftrace%2Frun%2Fv1.0%2FeyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJkdXJhdGlvbiI6NDMzLjAxOSwicGxheWVyVHlwZSI6Im5tcF9hIiwicGxheWVySWQiOiJybWNQbGF5ZXJfMTQ3MTMxMjQ3Njk1NTE5MDIiLCJleHRlcm5hbFRyYWNraW5nRGF0YUpTT04iOiIiLCJldmVudCI6InByb2dyZXNzIiwidmlkZW9JZCI6IjhFNTE1QjQ5QTI1NEEwQ0U5NDlENEQwOEJDRDJGNzhCQjE1RSIsIm9mZnNldCI6MjB9.kiDyNb9ln04Z7PGAoDZnjFwxaWCe1f56c8KsFfldexE%22%7D%2C%7B%22event%22%3A%22progress%22%2C%22offset%22%3A%2230%22%2C%22url%22%3A%22http%3A%2F%2Fvts.rmcnmv.naver.com%2Fvts%2Ftrace%2Frun%2Fv1.0%2FeyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJkdXJhdGlvbiI6NDMzLjAxOSwicGxheWVyVHlwZSI6Im5tcF9hIiwicGxheWVySWQiOiJybWNQbGF5ZXJfMTQ3MTMxMjQ3Njk1NTE5MDIiLCJleHRlcm5hbFRyYWNraW5nRGF0YUpTT04iOiIiLCJldmVudCI6InByb2dyZXNzIiwidmlkZW9JZCI6IjhFNTE1QjQ5QTI1NEEwQ0U5NDlENEQwOEJDRDJGNzhCQjE1RSIsIm9mZnNldCI6MzB9.yLiyhyH5Ju9eE7jQ7oW2FbAtXpK5-j9_5maHBpSFQZo%22%7D%2C%7B%22event%22%3A%22repetition%22%2C%22offset%22%3A%2240%22%2C%22url%22%3A%22http%3A%2F%2Fvts.rmcnmv.naver.com%2Fvts%2Ftrace%2Frun%2Fv1.0%2FeyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJkdXJhdGlvbiI6NDMzLjAxOSwicGxheWVyVHlwZSI6Im5tcF9hIiwicGxheWVySWQiOiJybWNQbGF5ZXJfMTQ3MTMxMjQ3Njk1NTE5MDIiLCJleHRlcm5hbFRyYWNraW5nRGF0YUpTT04iOiIiLCJldmVudCI6InJlcGV0aXRpb24iLCJ2aWRlb0lkIjoiOEU1MTVCNDlBMjU0QTBDRTk0OUQ0RDA4QkNEMkY3OEJCMTVFIiwib2Zmc2V0Ijo0MH0.-i4qa0kWoDHn1ItNwg5Ik84eDiBbsSZ3m5PVjsi_rOc%22%7D%5D&minAppVersion=1430#Intent;scheme=naverplayer;action=android.intent.action.VIEW;category=android.intent.category.BROWSABLE;package=com.nhn.android.naverplayer;end;";
        String example = "intent://scan/#Intent;scheme=zxing;package=com.google.zxing.client.android;S.browser_fallback_url=http%3A%2F%2Fwww.whatismyreferer.com%2F;end";
        new IntentParserImpl().parseUrl(naverPlayer);
        new IntentParserImpl().parseUrl(example);
    }
}
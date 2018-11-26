package com.tws.refactoring.extract_variable;

public class BannerRender {
    void renderBanner(String platform, String browser) {
        boolean matchPlatform = platform.toUpperCase().contains("MAC");
        boolean matchBrowser = (browser.toUpperCase().indexOf("IE") > -1);
        if (matchPlatform && matchBrowser) {
            // do something
            System.out.print("pass the if condition");
        }
    }
}

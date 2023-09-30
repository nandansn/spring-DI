package com.nanda.spring.di.demo;

public class ChromeContext extends BrowserContext {


    private String chromeVersion;

    public ChromeContext() {
        this.setBrowserName("chrome");
    }

    public String getChromeVersion() {
        return chromeVersion;
    }

    public void setChromeVersion(String chromeVersion) {
        this.chromeVersion = chromeVersion;
    }

    @Override
    public String toString() {
        return super.toString() + this.chromeVersion;
    }
}

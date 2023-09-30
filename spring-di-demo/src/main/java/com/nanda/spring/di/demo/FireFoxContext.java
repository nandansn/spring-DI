package com.nanda.spring.di.demo;

public class FireFoxContext extends BrowserContext {

    private String firefoxVersion;

    public FireFoxContext() {
        this.setBrowserName("firefox");
    }

    public String getFirefoxVersion() {
        return firefoxVersion;
    }

    public void setFirefoxVersion(String firefoxVersion) {
        this.firefoxVersion = firefoxVersion;
    }

    @Override
    public String toString() {
        return super.toString() + this.firefoxVersion;
    }
}

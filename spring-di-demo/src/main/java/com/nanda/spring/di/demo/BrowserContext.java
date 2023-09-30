package com.nanda.spring.di.demo;

public class BrowserContext {

    private String browserName;

    public String getBrowserName() {
        return browserName;
    }

    public void setBrowserName(String browserName) {
        this.browserName = browserName;
    }

    @Override
    public String toString() {
        return this.getBrowserName();
    }
}

package com.nanda.spring.di.demo;

public class TestContext {

     String testName;

     BrowserContext browserContext;



     public TestContext(String testName) {
         this.testName = testName;
         System.out.println("hello");
     }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public BrowserContext getBrowserContext() {
        return browserContext;
    }

    public void setBrowserContext(BrowserContext browserContext) {
        this.browserContext = browserContext;
    }
}

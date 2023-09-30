package com.nanda.spring.di.demo;

public class TestService {

    private TestContext testContext;

    public TestService(TestContext testContext) {
        this.testContext = testContext;
    }

    public void displayTestDetails() {
        System.out.println(testContext.getTestName());
    }
}

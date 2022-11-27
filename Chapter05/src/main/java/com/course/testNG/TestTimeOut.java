package com.course.testNG;

import org.testng.annotations.Test;


public class TestTimeOut {

    @Test(timeOut = 3000)
    public void testsucceed() throws InterruptedException {
        Thread.sleep(2000);
    }

    @Test(timeOut = 2000)
    public void testfailed() throws InterruptedException {
        Thread.sleep(3000);
    }
}

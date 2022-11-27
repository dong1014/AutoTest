package com.course.testNG.multThread;

import org.testng.annotations.Test;

public class TestThread {
    //invocationCount 用10个线程执行;threadPoolSize 线程池
    //如果不设线程池Size，则还是只会用1个线程挨着执行
    @Test(invocationCount = 10,threadPoolSize = 3)
    public void test01(){
        System.out.printf("Thread id is%d%n",Thread.currentThread().getId());
    }
}

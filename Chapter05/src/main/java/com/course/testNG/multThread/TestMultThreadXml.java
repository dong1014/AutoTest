package com.course.testNG.multThread;

import org.testng.annotations.Test;

public class TestMultThreadXml {

    @Test
    public void testo1(){
        System.out.printf("Thread Id is %d%n",Thread.currentThread().getId());
    }

    @Test
    public void test02(){
        System.out.printf("Thread Id is %d%n",Thread.currentThread().getId());
    }

    @Test
    public void test03(){
        System.out.printf("Thread Id is %d%n",Thread.currentThread().getId());
    }
}

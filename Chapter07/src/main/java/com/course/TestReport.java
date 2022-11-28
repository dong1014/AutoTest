package com.course;



import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestReport {

    @Test
    public void test01(){
        Assert.assertEquals(1,2);
    }
    @Test
    public void test02(){
        Assert.assertNotSame("aaa","bbb");
    }
    @Test
    public void test03(){
        Assert.assertEquals(1,1);
    }
    @Test
    public void logDemo(){
        Reporter.log("这是我自己的日志");
        throw new RuntimeException("这是我的");
    }
}

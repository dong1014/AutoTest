package com.course.testNG;

import org.testng.annotations.Test;

public class TestExceptions {
    @Test(expectedExceptions = RuntimeException.class)
    public void RuntimeExceptionFailed(){
        System.out.println("这是一个失败的异常测试");
    }

    @Test(expectedExceptions = RuntimeException.class)
    public void RuntimeExceptionSucceed(){
        System.out.println("这是一个成功的异常测试");
        throw new RuntimeException();
    }


}

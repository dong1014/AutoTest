package com.course.testNG.paramter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParam {

    @Test
    @Parameters({"name","age"})
    public void paramTest01(String name,int age){
        System.out.println("name="+name+"age="+age);
    }
}

package com.course.testNG.groups;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupOnClass1 {
    public void testStu1(){
        System.out.println("class 01 的 11");
    }
    public void testStu2(){
        System.out.println("class 01 的 22");
    }
}

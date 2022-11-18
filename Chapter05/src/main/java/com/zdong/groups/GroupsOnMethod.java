package com.zdong.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethod {
    @BeforeGroups("server")
    public void groupBeforeServe(){
        System.out.println("groupBeforeServer");
    }
    @AfterGroups("server")
    public void groupAfterServer(){
        System.out.println("groupAfterServer");
    }
    @BeforeGroups("client")
    public void groupBeforeClient(){
        System.out.println("groupBeforeClient");
    }
    @AfterGroups("client")
    public void groupAfterClient(){
        System.out.println("groupAfterClient");
    }
    @Test(groups = "server")
    public void testCase01(){
        System.out.println("server01 执行");
    }
    @Test(groups = "server",enabled = false)
    public void testCase02(){
        System.out.println("server02 执行");
    }
    @Test(groups = "client")
    public void testCase03(){
        System.out.println("server03 执行");
    }
}

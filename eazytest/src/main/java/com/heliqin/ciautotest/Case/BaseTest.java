package com.heliqin.ciautotest.Case;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

    @BeforeSuite
    public void setUp(){
        System.out.println("setUp!!");
        Assert.assertEquals(1,1);
    }


}

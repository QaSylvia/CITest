package com.heliqin.ciautotest.Case;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestCase {

    @BeforeClass
    public void beforeClass(){
        System.out.println("beforeClass!!");
    }

    @Test
    public void isOK() {
        Assert.assertTrue(true);
    }

    @Parameters({"testEnv"})
    @Test
    public void isParanmeter(String testEnv){
        Assert.assertEquals(testEnv,"testEnv");
    }
}

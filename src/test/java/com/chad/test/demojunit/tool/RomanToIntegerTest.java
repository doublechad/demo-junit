package com.chad.test.demojunit.tool;

import com.chad.test.demojunit.DemoJunitApplication;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@SpringBootTest(classes = DemoJunitApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class RomanToIntegerTest {

    @Autowired
    RomanToInteger romanToInteger;

    @Test
    public void testRomanToInt(){
        int result = romanToInteger.romanToInt("I");
        Assert.assertEquals(result,1);
    }
}
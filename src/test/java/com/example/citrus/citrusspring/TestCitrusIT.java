package com.example.citrus.citrusspring;

import org.testng.annotations.Test;

import com.consol.citrus.annotations.CitrusTest;
import com.consol.citrus.dsl.testng.TestNGCitrusTestDesigner;

@Test
public class TestCitrusIT extends TestNGCitrusTestDesigner{

    @CitrusTest
    public void echoToday() {
        variable("now", "citrus:currentDate()");

        echo("Today is: ${now}");
    }

    @CitrusTest(name = "Test.sayHi")
    public void sayHi() {
        echo("#################################################################");
        echo("###                             Hi Citrus!                   ####");
        echo("#################################################################");
    }
}

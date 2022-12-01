package com.qa.testclass;

import com.qa.pageclass.Register;
import com.qa.testbase.TestBase;
import org.testng.annotations.Test;

public class testcase1 extends TestBase {
    @Test
    public void test1()
    {
        Register reg = new Register();
        reg.clickOnregisterBtn();
        reg.writeUser("dipkanoje");
        reg.writeFirst("dip");
        reg.writelast("kanoje");
        reg.writeEmail("dipanshukanoje18@gmail.com");
        reg.select_country("India");
        reg.writePass("Dipk@noje1997");

    }
}

package com.sauce.testcases;

import org.testng.annotations.Test;

import com.sauce.base.BaseClass;
import com.sauce.base.MainClass;

public class TestCases extends BaseClass {

	MainClass  mainclass;
@Test (invocationCount=2)
public void login() throws Exception {
	mainclass = new MainClass();
     mainclass.Login();
}


}
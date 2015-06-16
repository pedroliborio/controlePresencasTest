package com.unicamp.br.mo409.test;

import com.robotium.solo.Solo;
import com.unicamp.br.mo409.controller.LoginActivity;

import android.test.ActivityInstrumentationTestCase2;

public class LoginTest2 extends ActivityInstrumentationTestCase2<LoginActivity> {

	private Solo solo;
	
	public LoginTest2() {
		super("com.unicamp.br.mo409.controller", LoginActivity.class);
		// TODO Auto-generated constructor stub
	}

	protected void setUp() throws Exception {
		super.setUp();
		solo = new Solo(getInstrumentation(), getActivity());
	}
	
	public void testLogin2(){
		solo.assertCurrentActivity("Activity de Login",LoginActivity.class);
	
	}

}

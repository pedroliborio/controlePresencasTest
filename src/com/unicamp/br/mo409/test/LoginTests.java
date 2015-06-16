package com.unicamp.br.mo409.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.robotium.solo.Solo;
import com.unicamp.br.mo409.controller.LoginActivity;

import android.test.ActivityInstrumentationTestCase2;

public class LoginTests extends ActivityInstrumentationTestCase2<LoginActivity> {

	private Solo solo;
	
	@SuppressWarnings("deprecation")
	public LoginTests() {
		super("com.unicamp.br.mo409.controller",LoginActivity.class);
		// TODO Auto-generated constructor stub
	}

	@Before
	protected void setUp() throws Exception {
		super.setUp();
		solo = new Solo(getInstrumentation(), getActivity());
		
	}

	@Test
	public void testLogin() {
		solo.assertCurrentActivity("Tela de Login", LoginActivity.class);
	}

}

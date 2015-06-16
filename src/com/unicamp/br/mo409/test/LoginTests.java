package com.unicamp.br.mo409.test;

import org.junit.Before;
import org.junit.Test;

import android.R;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.EditText;

import com.robotium.solo.Solo;
import com.unicamp.br.mo409.controller.LoginActivity;
import com.unicamp.br.mo409.controller.MainActivity;

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
	public void testLogin() throws InterruptedException {
		//primeira tela de Login quando o sistema inicia
		solo.assertCurrentActivity("Tela de Login", LoginActivity.class);
		solo.clickOnEditText(0);
		solo.enterText(0, "Eliane");
		solo.clickOnEditText(1);
		solo.enterText(1, "12345");
		solo.clickOnButton(0);
		solo.waitForActivity("Disciplinas");
	}

}

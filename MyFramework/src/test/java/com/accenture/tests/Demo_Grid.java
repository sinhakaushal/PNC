package com.accenture.tests;

import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;

public class Demo_Grid {
	WebDriver d;

	@Test
	public void f() {
		d.get("https://www.accenture.com");
	}

	@BeforeTest
	public void beforeTest() throws MalformedURLException {
		DesiredCapabilities ds = new DesiredCapabilities();
		ds.setBrowserName("chrome");
		d = new RemoteWebDriver(new URL("http://10.231.143.217:4343/wd/hub"), ds);
	}

}

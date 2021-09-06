package com.kaif.module;

import com.google.inject.servlet.ServletModule;
import com.kaif.servlet.GuiceServlet;

public class GuiceModule extends ServletModule {
	@Override
	protected void configureServlets() {
		serve("/test.jsp").with(GuiceServlet.class);
	}
}

// is responsible for mapping
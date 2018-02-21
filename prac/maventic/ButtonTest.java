package com.prac.maventic;

import java.applet.Applet;
import java.awt.Button;

public class ButtonTest extends Applet {
	
	Button b=new Button("ok");
	@Override
	public void init() {
		add(b);
		add(b);
		add(new Button("Cancel"));
		add(new Button("Canc"));
		return 11;
	}
}

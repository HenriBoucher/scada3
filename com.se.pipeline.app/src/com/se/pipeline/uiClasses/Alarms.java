package com.se.pipeline.uiClasses;

import javax.annotation.PostConstruct;

import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;

public class Alarms {
	
	@PostConstruct
	void initUI(BorderPane pane) {
		Button b = new Button("in Alarms");
		pane.setCenter(b);
	}

}

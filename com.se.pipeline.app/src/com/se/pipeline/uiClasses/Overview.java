package com.se.pipeline.uiClasses;

import javax.annotation.PostConstruct;

import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;

public class Overview {
	
	@PostConstruct
	void initUI(BorderPane pane) {
		Button b = new Button("in Overview");
		pane.setCenter(b);
	}

}

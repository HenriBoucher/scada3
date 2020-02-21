package com.se.pipeline.uiClasses;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;

public class Overview {

	@Inject
	com.se.pipeline.scadasystem.ScadaSystem scadaSystem;

	@PostConstruct
	void initUI(BorderPane pane) {
		Button b = new Button("in Overview");
		pane.setCenter(b);
	}

}

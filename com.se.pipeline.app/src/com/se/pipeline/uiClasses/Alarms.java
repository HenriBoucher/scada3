package com.se.pipeline.uiClasses;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;

public class Alarms {
	
	@Inject
	com.se.pipeline.scadasystem.ScadaSystem scadaSystem;
	
	@PostConstruct
	void initUI(BorderPane pane) {
		System.err.println("In Alarms.java");
		System.err.println("scadaAlarm = " + scadaSystem.getScadaAlarm());
		Button b = new Button("in Alarms");
		pane.setCenter(b);
	}

}

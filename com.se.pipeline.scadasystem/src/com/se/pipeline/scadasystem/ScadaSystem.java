package com.se.pipeline.scadasystem;

import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Creatable;
import org.osgi.service.component.ComponentContext;

@Creatable
public class ScadaSystem {
	
	@Inject
	com.se.pipeline.scadaalarm.ScadaAlarm scadaAlarm;
	@Inject
	com.se.pipeline.scadaevent.ScadaEvent scadaEvent;
	@Inject
	com.se.pipeline.scadahistory.ScadaHistory scadaHistory;

	
    protected void activate(ComponentContext componentContext) {}

    protected void deactivate(ComponentContext componentContext) {}

}

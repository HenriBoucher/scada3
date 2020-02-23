package com.se.pipeline.scadasystem;

import java.util.Dictionary;

import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Creatable;
import org.osgi.framework.BundleContext;
import org.osgi.framework.Constants;
import org.osgi.service.component.ComponentContext;

@Creatable
public class ScadaSystem {
	
	@Inject
	private com.se.pipeline.scadaalarm.ScadaAlarm scadaAlarm;
	@Inject
	private com.se.pipeline.scadaevent.ScadaEvent scadaEvent;
	@Inject
	private com.se.pipeline.scadahistory.ScadaHistory scadaHistory;

// tried start but it's not executed
//    protected void start(BundleContext bundleContext) throws Exception {
//    	Dictionary<String, String> headers = bundleContext.getBundle().getHeaders();
//    	String requireBundle = headers.get(Constants.REQUIRE_BUNDLE);
//    	int i = 23/0;  // test if code is executed
//    	String[] bundles = requireBundle.split("\\s*,\\s*");
//    	for (String bundle : bundles) {
//    		if (bundle.contains(".station.")) {
//    			
//    		}
//    	}
//    }
	
	protected void activate(ComponentContext componentContext) {
		Dictionary<String, String> headers = componentContext.getBundleContext().getBundle().getHeaders();  // then as above
		int i = 2/0;
	}

    protected void deactivate(ComponentContext componentContext) {}
    
    public com.se.pipeline.scadaalarm.ScadaAlarm getScadaAlarm() { 
    	return scadaAlarm;
    }
    
    public com.se.pipeline.scadaevent.ScadaEvent getScadaEvent() {
    	return scadaEvent;
    }

    public com.se.pipeline.scadahistory.ScadaHistory getScadaHistory() {
    	return scadaHistory;
    }
}

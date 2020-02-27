package com.se.pipeline.scadasystem;

import java.util.Dictionary;

import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Creatable;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.Constants;

@Creatable
public class ScadaSystem implements BundleActivator {
	
	private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}

	
	@Inject
	private com.se.pipeline.scadaalarm.ScadaAlarm scadaAlarm;
	@Inject
	private com.se.pipeline.scadaevent.ScadaEvent scadaEvent;
	@Inject
	private com.se.pipeline.scadahistory.ScadaHistory scadaHistory;

    public void start(BundleContext bundleContext) throws Exception {
    	ScadaSystem.context = bundleContext;
    	Dictionary<String, String> headers = bundleContext.getBundle().getHeaders();
    	String requireBundle = headers.get(Constants.REQUIRE_BUNDLE);
    	String[] bundles = requireBundle.split("\\s*,\\s*");
    	for (String bundle : bundles) {
    		if (bundle.contains(".station.edmonton")) {
    			System.out.println(bundle);
    		}
    	}
    	Bundle[] allBundles = bundleContext.getBundles();
    	for (Bundle bundle : allBundles) {
    		if (bundle.getSymbolicName().contains(".station.edmonton")) {
    			Dictionary<String, String> headers2 = bundle.getHeaders();
    			String thisClass = headers2.get(Constants.BUNDLE_ACTIVATOR);
    			System.err.println("About to loadClass with bundle = " + bundle + " and class = " + thisClass);
    			bundle.loadClass(thisClass);
    		};
//    		System.out.println ("-" + bundle.getSymbolicName() + "-");
    	}
    }
    
	public void stop(BundleContext bundleContext) throws Exception {
		ScadaSystem.context = null;
		System.err.println("in scadasystem.stop");
	}
     
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

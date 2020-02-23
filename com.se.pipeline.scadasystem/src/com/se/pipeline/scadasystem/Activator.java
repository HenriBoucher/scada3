package com.se.pipeline.scadasystem;

import java.util.Dictionary;

import javax.inject.Inject;

import org.eclipse.e4.core.services.events.IEventBroker;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.Constants;

public class Activator implements BundleActivator {

	private static BundleContext context;
	
	@Inject
	private static IEventBroker eventBroker;

	static BundleContext getContext() {
		return context;
	}

	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;
		Bundle[] allbundles = bundleContext.getBundles();
		for (Bundle thisbundle : allbundles) {
			System.out.println(thisbundle + thisbundle.getSymbolicName() + thisbundle.getBundleId());
		}
		Dictionary<String, String> headers = bundleContext.getBundle().getHeaders();
    	String requireBundle = headers.get(Constants.REQUIRE_BUNDLE);

    	String[] bundles = requireBundle.split("\\s*,\\s*");

    	for (String bundle : bundles) {
    		if (bundle.contains(".station.")) {
    			System.out.println(bundle);
    		}
    	}
	}

	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
		System.err.println("in scadasystem.stop");
	}

}

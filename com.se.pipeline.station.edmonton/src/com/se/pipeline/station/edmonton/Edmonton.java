package com.se.pipeline.station.edmonton;

import javax.inject.Inject;

import org.eclipse.e4.core.services.events.IEventBroker;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Edmonton extends com.se.pipeline.scadastation.ScadaStation implements BundleActivator, com.se.pipeline.scadastation.IRequiredSetters {

	private static BundleContext context;
	@Inject
	private static IEventBroker eventBroker;


	static BundleContext getContext() {
		return context;
	}

	public void start(BundleContext bundleContext) throws Exception {
//		super.stationName = "Edmonton";
//		System.out.println(super.stationName);
		Edmonton.context = bundleContext;
	}

	public void stop(BundleContext bundleContext) throws Exception {
		Edmonton.context = null;
	}

}

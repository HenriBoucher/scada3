package com.se.pipeline.station.station4;

import javax.inject.Inject;

import org.eclipse.e4.core.services.events.IEventBroker;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Station4 implements BundleActivator {

	private static BundleContext context;
	@Inject
	private static IEventBroker eventBroker;

	static BundleContext getContext() {
		return context;
	}

	public void start(BundleContext bundleContext) throws Exception {
		Station4.context = bundleContext;
	}

	public void stop(BundleContext bundleContext) throws Exception {
		Station4.context = null;
	}

}

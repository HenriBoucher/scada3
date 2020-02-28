package com.se.pipeline.stattion.hardisty;

import javax.inject.Inject;

import org.eclipse.e4.core.services.events.IEventBroker;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Hardisty implements BundleActivator {

	private static BundleContext context;
	@Inject
	private static IEventBroker eventBroker;


	static BundleContext getContext() {
		return context;
	}

	public void start(BundleContext bundleContext) throws Exception {
		Hardisty.context = bundleContext;
	}

	public void stop(BundleContext bundleContext) throws Exception {
		Hardisty.context = null;
	}

}

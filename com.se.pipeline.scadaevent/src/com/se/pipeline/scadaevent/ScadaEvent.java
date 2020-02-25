package com.se.pipeline.scadaevent;

import org.eclipse.e4.core.di.annotations.Creatable;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

@Creatable
public class ScadaEvent implements BundleActivator {
	private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}

	public void start(BundleContext bundleContext) throws Exception {
		ScadaEvent.context = bundleContext;
	}

	public void stop(BundleContext bundleContext) throws Exception {
		ScadaEvent.context = null;
	}


}

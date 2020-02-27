package com.se.pipeline.scadastation;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class ScadaStation implements IRequiredSetters {
	
	private String stationName = new String();
	
	public void SetStationName(String stationName) {
		this.stationName = stationName;
	}
	
//	public InetAddress ipOutbound;
//	
//	try {
//	    ipOutbound = InetAddress.getByName("129.26.70.95");
//	} catch (UnknownHostException e) {
//	    // print exception, throw error,
//	    // try something else etc.
//	}
}

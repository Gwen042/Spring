package org.example.demo.ticket.webapp.rest.resource;

import org.example.ticket.business.impl.ManagerFactory;

public abstract class AbstractRessource {

	private static ManagerFactory managerFactory;

	protected static ManagerFactory getManagerFactory() {
		return managerFactory;
	}

	public static void setManagerFactory(ManagerFactory managerFactory) {
		AbstractRessource.managerFactory = managerFactory;
	}
	
	

}

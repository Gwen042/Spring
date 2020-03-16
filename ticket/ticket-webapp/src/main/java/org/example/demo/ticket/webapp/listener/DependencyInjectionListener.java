package org.example.demo.ticket.webapp.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.example.ticket.business.impl.TicketManagerImpl;
import org.example.demo.ticket.webapp.rest.resource.AbstractRessource;
import org.example.ticket.business.impl.ManagerFactory;
import org.example.ticket.business.impl.ProjetManagerImpl;

public class DependencyInjectionListener implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent pServletContextEvent) {
		
		ManagerFactory vManagerFactory = new ManagerFactory();
	
		vManagerFactory.setProjetManager(new ProjetManagerImpl());
		vManagerFactory.setTicketManager(new TicketManagerImpl());
		
		AbstractRessource.setManagerFactory(vManagerFactory);
	}

	@Override
	public void contextDestroyed(ServletContextEvent pServletContextEvent) {
		
	}
}

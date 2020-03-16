package org.example.ticket.business.impl;

import org.example.ticket.business.contract.manager.ManagerFactory;
import org.example.ticket.business.contract.manager.ProjetManager;
import org.example.ticket.business.contract.manager.TicketManager;

public class ManagerFactoryImpl implements ManagerFactory{

	@Override
	public ProjetManager getProjetManager() {
		return this.projetManager;
	}
	
	@Override
	public void setProjetManager(ProjetManager pProjetManager) {
		projetManager = pProjetManager;
	}
	
	
	@Override
	public TicketManager getTicketManager() {
		return this.ticketManager;
	}
	
	@Override
	public void setTicketManager (TicketManager pTicketManager) {
		ticketManager = pTicketManager;
	}

}

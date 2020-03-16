package org.example.ticket.business.contract.manager;

public interface ManagerFactory {
	
	

	void setTicketManager(TicketManager pTicketManager);

	TicketManager getTicketManager();

	void setProjetManager(ProjetManager pProjetManager);

	ProjetManager getProjetManager();


}

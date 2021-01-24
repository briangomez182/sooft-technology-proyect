package com.example.demo.helper;

import com.example.demo.models.ComentarioModel;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TicketHelper {
	
	// primera cascada
	private ComentarioModel ticket;
	private AuditHelper audit;
	
	public TicketHelper(ComentarioModel ticket) {
		super();
		this.ticket = ticket;
	}
	
	public TicketHelper() {
		super();
	}

	public Object getTicket() {
		return ticket;
	}

	public void setTicket(ComentarioModel ticket) {
		this.ticket = ticket;
	}

	public AuditHelper getAudit() {
		return audit;
	}

	public void setAudit(AuditHelper audit) {
		this.audit = audit;
	}
	
	
	
}

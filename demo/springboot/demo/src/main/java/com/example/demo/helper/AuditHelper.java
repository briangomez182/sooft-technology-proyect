package com.example.demo.helper;

import com.example.demo.models.ComentarioModel;

public class AuditHelper {
	
	private Long id;
	private Long ticket_id;
	private ComentarioModel[] events;
	
	public AuditHelper() {
		super();
	}


	public AuditHelper(Long id, Long ticket_id, ComentarioModel[] events) {
		super();
		this.id = id;
		this.ticket_id = ticket_id;
		this.events = events;
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getTicket_id() {
		return ticket_id;
	}
	public void setTicket_id(Long ticket_id) {
		this.ticket_id = ticket_id;
	}
	public ComentarioModel[] getEvents() {
		return events;
	}
	public void setEvents(ComentarioModel[] events) {
		this.events = events;
	}
	
	

}

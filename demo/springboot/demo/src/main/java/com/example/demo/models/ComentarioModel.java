package com.example.demo.models;

import com.example.demo.helper.BodyHelper;
import com.example.demo.helper.TicketHelper;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ComentarioModel extends TicketHelper{
	
	
	private Long id;
	private String type;
	private Long author_id;
	private String body;
	private String html_body;
	private String plain_body;
	private Long  audit_id;
	
	// Segund cascada
	public BodyHelper comment;
	
	public ComentarioModel(Long id, String type, Long author_id, String body, String html_body, String plain_body,
		Long audit_id, BodyHelper comment) {
		super();
		this.id = id;
		this.type = type;
		this.author_id = author_id;
		this.body = body;
		this.html_body = html_body;
		this.plain_body = plain_body;
		this.audit_id = audit_id;
		this.comment = comment;
	}
	
	
	public ComentarioModel() {
		super();
	}
	

	public ComentarioModel(BodyHelper comment) {
		super();
		this.comment = comment;
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Long getAuthor_id() {
		return author_id;
	}
	public void setAuthor_id(Long author_id) {
		this.author_id = author_id;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getHtml_body() {
		return html_body;
	}
	public void setHtml_body(String html_body) {
		this.html_body = html_body;
	}
	public String getPlain_body() {
		return plain_body;
	}
	public void setPlain_body(String plain_body) {
		this.plain_body = plain_body;
	}
	public Long getAudit_id() {
		return audit_id;
	}
	public void setAudit_id(Long audit_id) {
		this.audit_id = audit_id;
	}

	public BodyHelper getComment() {
		return comment;
	}
	public void setComment(BodyHelper comment) {
		this.comment = comment;
	}
	
	

}

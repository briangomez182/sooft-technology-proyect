package com.example.demo.helper;

import java.util.List;

import com.example.demo.models.ComentarioModel;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;

public class ComentariosHelper {
	
	private List<ComentarioModel> comments;
	private Long next_page;
	private Long previous_page;
	private Long count;
	
	
	
	public List<ComentarioModel> getComments() {
		return comments;
	}
	public void setComments(List<ComentarioModel> comments) {
		this.comments = comments;
	}
	public Long getNext_page() {
		return next_page;
	}
	public void setNext_page(Long next_page) {
		this.next_page = next_page;
	}
	public Long getPrevious_page() {
		return previous_page;
	}
	public void setPrevious_page(Long previous_page) {
		this.previous_page = previous_page;
	}
	public Long getCount() {
		return count;
	}
	public void setCount(Long count) {
		this.count = count;
	}
	
	

}

package com.example.demo.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.helper.*;
import com.example.demo.models.ComentarioModel;

@Service
public class ComentarioService {
	
	@Autowired
	private Environment application;
	
	public List<ComentarioModel> obtenerPorId(Long idTicket) {
		
		final String USER_KEY 	= application.getProperty("app.USER");
		final String PASS_KEY 	= application.getProperty("app.PASS");
		final String URL_BASE 	= application.getProperty("app.URL_BASE");
		final String COMPLEMENT = application.getProperty("app.COMPLEMENT"); 
		
		HttpHeaders headers = new HttpHeaders();
		headers.setBasicAuth(USER_KEY, PASS_KEY);
		HttpEntity<String> request = new HttpEntity<String>(headers);
		String urlCompleta = URL_BASE + idTicket + COMPLEMENT;
		
		ResponseEntity<ComentariosHelper> response = new RestTemplate().
				exchange(urlCompleta, HttpMethod.GET, request, ComentariosHelper.class);
		
		
		List<ComentarioModel> comentarioRest = response.getBody().getComments();
		
		return comentarioRest;
		
	}
	
	

	public TicketHelper actualizarComentario(Long idTicket, String comentario) {
		// actualiza comentarios comentarios con el ID
		
		final String USER_KEY 	= application.getProperty("app.USER");
		final String PASS_KEY 	= application.getProperty("app.PASS");
		final String URL_BASE 	= application.getProperty("app.URL_BASE");
		
		HttpHeaders headers = new HttpHeaders();
		headers.setBasicAuth(USER_KEY, PASS_KEY);
		headers.setContentType(MediaType.APPLICATION_JSON);
		
		String urlCompleta = URL_BASE + idTicket;
		
		TicketHelper ticketHelper = new TicketHelper(new ComentarioModel(new BodyHelper(comentario)));
		
		HttpEntity<TicketHelper> request = new HttpEntity<TicketHelper>(ticketHelper , headers);
		
		
		ResponseEntity<TicketHelper> response = new RestTemplate().
				exchange(urlCompleta, HttpMethod.PUT, request, TicketHelper.class);
		
		TicketHelper comentarioRest = response.getBody();
		
		return comentarioRest;
	}

}

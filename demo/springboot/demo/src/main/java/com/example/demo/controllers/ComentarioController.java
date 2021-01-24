package com.example.demo.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.ComentarioModel;
import com.example.demo.services.ComentarioService;
import com.example.demo.helper.TicketHelper;
import com.google.gson.Gson;


@RestController
@RequestMapping(path = "/comentarios", produces = {MediaType.APPLICATION_JSON_VALUE})
public class ComentarioController {
	
	@Autowired
    ComentarioService comentarioService;
	
	 @GetMapping( path = "/buscar/{id}")
	 public List<ComentarioModel> obtenerComentarioPorId(@PathVariable("id") Long id) {
	        return this.comentarioService.obtenerPorId(id);
	 }
	 
	 @GetMapping( path = "/crear/{id}/{comentario}")
	 public TicketHelper actualizarComentario(@PathVariable("id") Long idTicket, @PathVariable("comentario") String comentario ){
	        return this.comentarioService.actualizarComentario(idTicket, comentario);
	 }

}

package com.example.demo.controllers;

import java.util.ArrayList;
import com.example.demo.models.CarreraModel;
import com.example.demo.services.CarreraService;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/carreras")
public class CarreraControles {

	 @Autowired
	 CarreraService carreraService;
	 
	 
	@GetMapping()
    public ArrayList<CarreraModel> obtenerCarreras(){
        return carreraService.obtenerCarreras();
    }
	 
	@PostMapping()
    public CarreraModel guardarCarrera(@RequestBody CarreraModel carrera){
        return this.carreraService.guardarCarrera(carrera);
    }

    @GetMapping( path = "/{id}")
    public Optional<CarreraModel> obtenerCarreraPorId(@PathVariable("id") Long id) {
        return this.carreraService.obtenerPorId(id);
    }

    @GetMapping("/query")
    public ArrayList<CarreraModel> obtenerCarreraPorPrioridad(@RequestParam("prioridad") Integer prioridad){
        return this.carreraService.obtenerPorPrioridad(prioridad);
    }

    @DeleteMapping( path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.carreraService.eliminarCarrera(id);
        if (ok){
            return "Se eliminó el carrera con id " + id;
        }else{
            return "No pudo eliminar el carrera con id" + id;
        }
    }
}

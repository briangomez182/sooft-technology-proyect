package com.example.demo.services;


import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.CarreraModel;
import com.example.demo.repocitories.CarreraRepository;

@Service
public class CarreraService {
	
	 	@Autowired
	    CarreraRepository usuarioRepository;
	    
	    public ArrayList<CarreraModel> obtenerCarreras(){
	        return (ArrayList<CarreraModel>) usuarioRepository.findAll();
	    }

	    public CarreraModel guardarCarrera(CarreraModel usuario){
	        return usuarioRepository.save(usuario);
	    }

	    public Optional<CarreraModel> obtenerPorId(Long id){
	        return usuarioRepository.findById(id);
	    }


	    public ArrayList<CarreraModel>  obtenerPorPrioridad(Integer prioridad) {
	        return usuarioRepository.findByPrioridad(prioridad);
	    }

	    public boolean eliminarCarrera(Long id) {
	        try{
	            usuarioRepository.deleteById(id);
	            return true;
	        }catch(Exception err){
	            return false;
	        }
	    }

}

package com.example.demo.repocitories;


import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.CarreraModel;

@Repository
public interface CarreraRepository extends CrudRepository<CarreraModel, Long>{
	
	public abstract ArrayList<CarreraModel> findByPrioridad(Integer prioridad);

}

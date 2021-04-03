package io.kebblar.petstore.api.service;

import java.util.List;

import org.springframework.stereotype.Service;

import io.kebblar.petstore.api.exceptions.BusinessException;
import io.kebblar.petstore.api.model.Criterio;
import io.kebblar.petstore.api.model.Factura;


public interface FacturaService {
	
	int insert(Factura factura) throws BusinessException;
	
	List<Factura> getAll() throws BusinessException;
	
	List<Integer> getPetsByCriteria(List<Criterio> criterios) throws BusinessException;
	

		
}

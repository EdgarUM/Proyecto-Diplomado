package io.kebblar.petstore.api.model;

import org.springframework.beans.factory.annotation.Autowired;

import io.kebblar.petstore.api.exceptions.BusinessException;
import io.kebblar.petstore.api.service.FacturaServiceImpl;

public class FacturaTest {
 
	@Autowired
	private FacturaServiceImpl fs;
	
	
	public void prueba() {
		try {
			System.out.print(this.fs.getAll());
		} catch (BusinessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

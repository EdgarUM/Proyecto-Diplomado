package io.kebblar.petstore.api.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import io.kebblar.petstore.api.exceptions.BusinessException;
import io.kebblar.petstore.api.exceptions.ProductoInexistenteException;
import io.kebblar.petstore.api.mapper.FacturaMapper;
import io.kebblar.petstore.api.model.Factura;
@Service
public class FacturaServiceImpl implements FacturaService{
private FacturaMapper fm;
	
	public FacturaServiceImpl(FacturaMapper fm) {
		// TODO Auto-generated constructor stub
		this.fm = fm;
	}
	
	@Override
	public int insert(Factura factura) throws BusinessException {
		// TODO Auto-generated method stub
		try {
			return this.fm.insert(factura);
		} catch (SQLException e) {
			throw new ProductoInexistenteException("Lo lamentamos pero ocurriio un error en base de deatos"+e.getErrorCode());
		}
		
	}

	@Override
	public List<Factura> getAll() throws BusinessException {
		List<Factura> fact = new ArrayList<>();
		
		try {
			fact = fm.getAll();
			System.out.print(fact);
			return fact;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new BusinessException(e.getMessage());
		}
	}

}

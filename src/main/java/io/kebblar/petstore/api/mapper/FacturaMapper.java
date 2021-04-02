package io.kebblar.petstore.api.mapper;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Result;

import io.kebblar.petstore.api.model.Factura;
@Repository
public interface FacturaMapper {

	//Persistencia
//	@ResultMap("FacturaResultMap")
	@Results({
			@Result(property = "id", column="id"),
			@Result(property = "fecha", column="fecha"),
			@Result(property = "clienteRfc", column="cliente_RFC"),
			@Result(property = "idProducto", column="id_producto"),
			@Result(property = "precio", column="precio"),
			@Result(property = "iva", column="iva"),
			
	})
	@Select("SELECT id, fecha, cliente_RFC, id_producto, precio, iva FROM Factura")
	List<Factura> getAll() throws SQLException;

	@Insert("INSERT INTO Factura (fecha, clienteRfc, idProducto, precio) VALUES (#{fecha}, #{clienteRfc}, #{idProducto}, #{precio})")
	int insert(Factura factura) throws SQLException;
	
	@Update("UPDATE Factura SET #{idProducto} WHERE id= #{id}")
	int update(Factura factura) throws SQLException;
	
	@Delete("DELETE FROM Factura WHERE id=#{id}")
	int delete(int id) throws SQLException;
	
	@Select("Select id, fecha, clienteRfc, idProducto, precio, iva FROM Factura WHERE idProducto = #{idProd}")
	List<Factura> findByIdProd(int idProd) throws SQLException;
	
	
}

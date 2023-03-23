

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
class RepositorioTest {

	Produto produto;
	Date data;
	Lote lote;
	Repositorio repositorio;
	
	@BeforeEach
	void makeThis() {
		repositorio = new Repositorio();
		data = new Date();
	}
	
	@Test
	void testRepositorio() {
		produto = new Produto("Leite em pó", "Itambé", 3.50);
		lote = new Lote(produto, data, 100);
		repositorio.addProduto(produto);
		repositorio.addLote(lote);
		
		assertEquals(repositorio.addLote(lote), true);
	}

}

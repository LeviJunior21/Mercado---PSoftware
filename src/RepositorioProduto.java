import java.util.HashMap;

public class RepositorioProduto {
	HashMap<Integer, Produto> mapProdutos = new HashMap<>();
	
	public void add(int id, Produto produto) {
		this.mapProdutos.put(id, produto);
		
	}
	
}

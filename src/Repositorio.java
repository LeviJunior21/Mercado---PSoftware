import java.util.HashMap;

public class Repositorio {
	private HashMap<String, Produto> mapProdutos = new HashMap<>();
	private HashMap<String, Lote> mapLote = new HashMap<>();
	
	public void addProduto(String id, Produto produto) {
		this.mapProdutos.put(id, produto);	
	}

	public Produto getProduto(String nome) {
		return this.mapProdutos.get(nome);
	}

	public void addLote(String nome, Lote lote) {
		this.mapLote.put(nome, lote);
	}
	
}

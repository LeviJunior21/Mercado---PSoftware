import java.util.HashMap;

public class Repositorio {
	private HashMap<Integer, Produto> mapProdutos = new HashMap<>();
	private HashMap<Integer, Lote> mapLote = new HashMap<>();
	
	public boolean addProduto(Produto produto) {
		if (!this.mapProdutos.containsKey(produto.hashCode())) {
			this.mapProdutos.put(produto.hashCode(), produto);
			return true;
		}
		return false;
	}

	public boolean addLote(Lote lote) {
		if (!this.mapLote.containsKey(lote.hashCode())) {
			this.mapLote.put(lote.hashCode(), lote);
			return true;
		}
			return false;
	}
	
	public Produto getProduto(int codigo) {
		return this.mapProdutos.get(codigo);
	}

	public boolean existeProduto(int codigo) {
		if (this.mapProdutos.containsKey(codigo)) {
			return false;
		}
		return false;
	}
	
}

import java.util.Date;

public class MercadoServices {
	private Repositorio repositorio;
	
	public MercadoServices() {
		this.repositorio = new Repositorio();
	}
	
	public void criaProduto(String nome, String fabricante, double preco) {
		Produto produto = new Produto(nome, fabricante, preco);
		this.repositorio.addProduto(nome, produto);
	}

	public void criaLote(String nome, Date data, int quantidade) {
		Lote lote = new Lote(this.repositorio.getProduto(nome), data, quantidade);
		this.repositorio.addLote(nome, lote);
	}

}

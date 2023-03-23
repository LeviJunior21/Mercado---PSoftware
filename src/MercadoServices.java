import java.util.Date;

public class MercadoServices {
	private Repositorio repositorio;
	
	public MercadoServices() {
		this.repositorio = new Repositorio();
	}
	
	public void criaProduto(String nome, String fabricante, double preco) {
		Produto produto = new Produto(nome, fabricante, preco);
		this.repositorio.addProduto(produto);
	}

	public void criaLote(int codigoProduto, Date data, int quantidade) {
		if (this.repositorio.existeProduto(codigoProduto)) {
			Lote lote = new Lote(this.repositorio.getProduto(codigoProduto), data, quantidade);
			this.repositorio.addLote(lote);
		}
	}

}

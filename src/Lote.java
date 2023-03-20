import java.util.Date;

public class Lote {
	private Produto produto;
	private Date data;
	private int quantidade;
	
	public Lote(Produto produto, Date data, int quantidade) {
		this.produto = produto;
		this.data = data;
		this.quantidade = quantidade;
	}
	
	public int getQuantidade() {
		return this.quantidade;
	}
	
	public int setQuantidade() {
		return this.quantidade;
	}
	
	public boolean venderProduto() {
		if (this.quantidade > 0) {
			this.quantidade -= 1;
			return true;
		}
		return false;
	}

}

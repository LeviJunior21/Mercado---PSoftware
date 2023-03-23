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

	@Override
	public int hashCode() {
		return this.produto.hashCode() + this.data.hashCode() + this.quantidade;
	}
}

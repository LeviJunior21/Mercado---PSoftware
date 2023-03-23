import java.util.Date;

public class MercadoFachada {
	private MercadoServices services;
	
	public MercadoFachada() {
		this.services = new MercadoServices();
	}
	
	public void criaProduto(String nomeProduto, String fabricante, double preco) {
		this.services.criaProduto(nomeProduto, fabricante, preco);
	}
	
	public void criaLote(int codigoProduto, Date data, int quantidade) {
		this.services.criaLote(codigoProduto, data, quantidade);
	}
	
}

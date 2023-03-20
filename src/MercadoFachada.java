import java.util.Date;

public class MercadoFachada {
	private MercadoServices services;
	
	public MercadoFachada() {
		this.services = new MercadoServices();
	}
	
	public void criaProduto(String nome, String fabricante, double preco) {
		this.services.criaProduto(nome, fabricante, preco);
	}
	
	public void criaLote(String nome, Date data, int quantidade) {
		this.services.criaLote(nome, data, quantidade);
	}
	
}

import java.util.Objects;

public class Produto {
	private String nome;
	private String fabricante;
	private double preco;
	
	public Produto(String nome, String fabricante, double preco) {
		this.nome = nome;
		this.fabricante = fabricante;
		this.preco = preco;
	}
	
	public double getPreco() {
		return this.preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(fabricante, nome);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return Objects.equals(fabricante, other.fabricante) && Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return this.nome + " " + this.fabricante + " por apenas R$" + this.preco;
	}
}


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
			MercadoFachada fachada = new MercadoFachada();
			Scanner sc = new Scanner(System.in);
			
			for(;;) {
				System.out.println(
					"\nc: Cria um produto.\n"
				  + "l: Cria um lote.\n");
				
				System.out.print("\nDigite a sua escolha: ");

				String resposta = sc.next();
				if (resposta.equals("c")) {
					criaProduto(fachada, sc);
				} else
				if (resposta.equals("l")) {
					criaLote(fachada, sc);
				}
			}
	}
	
	private static void criaLote(MercadoFachada fachada, Scanner sc) {
		System.out.println("\nNome do produto: ");
		int codigoProduto = sc.nextInt();
		System.out.println("\nData de vencimento: ");
		String vencimento = sc.next();
		System.out.println("\nQuantidade: ");
		int quantidade = sc.nextInt();
		
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		Date data;
		try {
			data = format.parse(vencimento);
			fachada.criaLote(codigoProduto, data, quantidade);
		} catch (ParseException e) {
			System.out.println("Ocorreu um erro na data: " + e.getMessage());
		}
	}

	public static void criaProduto(MercadoFachada fachada, Scanner sc) {
		System.out.println("\nNome do produto: ");
		String nome = sc.next();
		System.out.println("\nFabricante do produto: ");
		String fabricante = sc.next();
		System.out.println("\nPreço do produto: ");
		double preco = sc.nextDouble();
		
		fachada.criaProduto(nome, fabricante, preco);
	}
}

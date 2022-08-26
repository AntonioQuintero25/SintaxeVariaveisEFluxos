
public class TestaCondicionais2 {
	public static void main(String[] args) {
		System.out.println("Testando Condicionais");

		int idade = 18;
		int quantidadeDePessoas = 2;
		boolean acompanhado = quantidadeDePessoas >= 2;

		if (idade >= 18 && acompanhado) {
			System.out.println("Seja bem vindo");
		} else {
				System.out.println("Você não pode entrar");
		}
		
	}
}


public class TestaCondicional {
	public static void main(String[] args) {
		System.out.println("Testando Condicionais");

		int idade = 17;
		int quantidadePessoas = 1;

		if (idade >= 18) {
			System.out.println("A idade � maior de 18 anos");
		} else {
			if(quantidadePessoas >= 2) {
				System.out.println("Voc� n�o e maior de 18 por�m esta acompanhado");
			}else {
				System.out.println("Voc� n�o pode entrar");
			}
		}
	}
}

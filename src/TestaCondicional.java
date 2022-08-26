
public class TestaCondicional {
	public static void main(String[] args) {
		System.out.println("Testando Condicionais");

		int idade = 17;
		int quantidadePessoas = 1;

		if (idade >= 18) {
			System.out.println("A idade é maior de 18 anos");
		} else {
			if(quantidadePessoas >= 2) {
				System.out.println("Você não e maior de 18 porém esta acompanhado");
			}else {
				System.out.println("Você não pode entrar");
			}
		}
	}
}

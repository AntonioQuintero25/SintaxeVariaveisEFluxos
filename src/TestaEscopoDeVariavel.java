
public class TestaEscopoDeVariavel {
	public static void main(String[] args) {
		System.out.println("Testando Escopo de Vari�vel");

		int idade = 18;
		int quantidadeDePessoas = 2;
		//boolean acompanhado = quantidadeDePessoas >= 2;
		
		boolean acompanhado;
		
		if(quantidadeDePessoas >= 2) {
			acompanhado = true;
		}else {
			acompanhado = false;
		}
		
		System.out.println("Valor de acompanhado: "+ acompanhado);

		if (idade >= 18 && acompanhado) {
			System.out.println("Seja bem vindo");
		} else {
			System.out.println("Voc� n�o pode entrar");
		}
	}
}

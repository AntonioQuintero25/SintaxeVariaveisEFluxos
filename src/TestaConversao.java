
public class TestaConversao {
	public static void main(String [] args) {
		
		double salario = 1270.50;
		System.out.println(salario);
		//Vamos fazer um casting forçando um double a virar um inteiro perdendo assim alguns valores
			
		int valor = (int) salario;
		System.out.println(valor);
		
		//outros tipos de dados
		//long numeroGrande = 3223242424L; Precisar ter o L no final do número
		//short valorPequeno = 2131.
		//byte b = 127;
		//float pontoFlutuante = 3.14f;
	}
}

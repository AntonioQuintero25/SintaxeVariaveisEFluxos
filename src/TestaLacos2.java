
public class TestaLacos2 {
	public static void main(String[] args) {
		for(int multiplicador = 0; multiplicador < 10; multiplicador++) {
			for(int contador = 0; contador < 10 ; contador ++) {
				if(contador > multiplicador) {
					break;
				}
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

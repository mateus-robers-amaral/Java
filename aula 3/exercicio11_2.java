
public class exercicio11_2 {

	public static void main(String[] args) {
		for (int i = 1000; i < 10000; i++) {
			int div = i / 100;
			int sobra = i % 100;
			int elev = div + sobra;
			if (elev * elev == i) {
				System.out.println(i);
			}
			
		}

	}

}

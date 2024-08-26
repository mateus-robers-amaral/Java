import java.util.Random;
public class exercicio7_2 {

	public static void main(String[] args) {
		Random random = new Random();
		int maior_num = 0;
		int randnum;
		int menor_num = 50;
		for (int i = 0; i < 20; i++) {
			randnum = random.nextInt(50)+1;
			if (randnum > maior_num) {
				maior_num = randnum;
			}
			if (randnum < menor_num) {
				menor_num = randnum;
			}
	}
		System.out.println("O maior número gerado foi "+maior_num);
		System.out.println("O menor número gerado foi "+menor_num);
}
}
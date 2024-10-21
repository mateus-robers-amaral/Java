public class p1_4 {
    public static void main(String[] args) {
        int n = 10, primeiro = 0, segundo = 1;
        System.out.println("Série Fibonacci até " + n + ":");
        while (n > 0) {
            System.out.print(primeiro + " ");
            int proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
            n--;
        }
    }
}

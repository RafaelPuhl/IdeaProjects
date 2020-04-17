package POO;

public class Gera5000Inteiros {
    public static void main(String[] args) {
        int num;
        for (int i = 0; i < 5000 ; i++) {
            num = (int) (1 + Math.random() * 100);
            System.out.print(num + " ");
        }
    }
}

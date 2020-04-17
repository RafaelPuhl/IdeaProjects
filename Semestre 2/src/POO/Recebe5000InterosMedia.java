package POO;
import java.util.Scanner;
public class Recebe5000InterosMedia {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int contador = 0;
        for (int i = 0; i < 5000; i++) {
            int num = in.nextInt();
            contador += num;
        }
        System.out.println(contador/5000);
    }
}

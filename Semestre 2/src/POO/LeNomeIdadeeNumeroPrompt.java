package POO;
import java.util.Scanner;
public class LeNomeIdadeeNumeroPrompt {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
       String nome = args[0];
       String idade = args[1];
       String telefone = args[2];
        if (telefone.length() != 8){
            do {
                System.out.println("Numero invalido, entre novamente com o numero: ");
                telefone = in.nextLine();
            }while (telefone.length() != 8);
            System.out.println("Nome: "+nome+" Idade: "+idade+" Telefone: "+telefone);
        }else {
            System.out.println("Nome: "+nome+" Idade: "+idade+" Telefone: "+telefone);
        }
    }
}

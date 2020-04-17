package com.company;
import java.util.Scanner;
public class MoveRover {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Rover R1 = new Rover();
        String player = "";
        String operacao = "";
        int x,y;
        System.out.println("Entre com o nome do Player: ");
        player = in.nextLine();
        do {
            System.out.println(player + " use WASD para movimentar o rover, X para obter aposicao, Y para setar uma posicao e Z para sair: ");
            operacao = in.nextLine();
            if (operacao.equals("w")){
                R1.moverNorte();
            }else if (operacao.equals("s")){
                R1.moverSul();
            }else if (operacao.equals("d")){
                R1.moverLeste();
            }else if (operacao.equals("a")){
                R1.moverOeste();
            }else if (operacao.equals("x")){
                System.out.println(R1.getPosicao());
            }else if (operacao.equals("y")){
                System.out.println("Entre com X e Y para setar a posicao: ");
                x = in.nextInt();
                y = in.nextInt();
                R1.setPosicao(x,y);
            }
        }while (!operacao.equals("z"));
    }
}

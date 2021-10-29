package Menu;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Menu menu = new Menu(in);
        boolean status = true;
        while (status){
            MenuLists.startMenu();
            status = menu.run();
        }
    }
}

package POO.JavaFX;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ExemploTelaLogin_GRID extends Application {
    private TextField tfUser;
    private PasswordField tfSenha;

    public static void main(String[] args) {
        launch(args);
    }

    public void trataBotaoLogar(ActionEvent e) {
        System.out.println("Tentou logar: " + e);
        System.out.println("Usuario: " + tfUser.getText());
        System.out.println("Senha: " + tfSenha.getText());
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Scene cena = new Scene(grid, 920, 600);
        primaryStage.setTitle("Minha aplicação");
        primaryStage.setScene(cena);

        Text titulo = new Text("Tela de login");
        grid.add(titulo, 0, 0);

        Label lbUser = new Label("Usuário:");
        grid.add(lbUser, 0, 1);
        tfUser = new TextField();
        grid.add(tfUser, 1, 1);

        Label lbSenha = new Label("Senha:");
        grid.add(lbSenha, 0, 2);
        tfSenha = new PasswordField();
        grid.add(tfSenha, 1, 2);

        Button btLogar = new Button("Logar");
        grid.add(btLogar, 1, 3);
        btLogar.setOnAction(e -> trataBotaoLogar(e));

        primaryStage.show();
    }
}
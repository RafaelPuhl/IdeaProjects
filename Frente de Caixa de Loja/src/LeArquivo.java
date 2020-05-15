import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class LeArquivo {
    public void imprime(){
        String currDir = Paths.get("").toAbsolutePath().toString();
        String nameComplete = currDir+"\\"+"Produtos.txt";
        Path path = Paths.get(nameComplete);

        String prod = "";
        String linha = "";
        // Usa a classe scanner para fazer a leitura do arquivo
        try (Scanner sc = new Scanner(Files.newBufferedReader(path, StandardCharsets.UTF_8))){
            linha = sc.nextLine();
        }catch (IOException x){
            System.err.format("Erro de E/S: %s%n", x);
        }
        String[] produtos = linha.split(",");
        for (String product : produtos ) {
            System.out.println(product);
        }
    }
}
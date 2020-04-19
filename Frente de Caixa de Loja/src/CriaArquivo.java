import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class CriaArquivo{


    public void arquivo(Estoque e){
        String currDir = Paths.get("").toAbsolutePath().toString(); // Obtem o caminho para o diretório corrente
        String nameComplete = currDir+"\\"+"Produtos.txt"; // Monta o nome do arquivo
        Path path = Paths.get(nameComplete);
        try (PrintWriter writer = new PrintWriter(Files.newBufferedWriter(path, StandardCharsets.UTF_8))){
            for (int i = 0; i < e.getQuantidadeProdutos(); i++) {
                String produto = "";
                produto = e.getProdutos(i).getDescricao();
                writer.print(produto + ",");
            }

        }catch (IOException x){
            System.err.format("Erro de E/S: %s%n", x);
        }
    }
}
package SweetMari;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ArquivoCaixa {

    public static String[] leia() {
        String currDir = Paths.get("").toAbsolutePath().toString();
        String nameComplete = currDir + "\\" + "Dinheiro.txt";
        Path path = Paths.get(nameComplete);
        String linha = "";
        // Usa a classe scanner para fazer a leitura do arquivo
        try (Scanner sc = new Scanner(Files.newBufferedReader(path, StandardCharsets.UTF_8))) {
            linha = sc.nextLine();
        } catch (IOException x) {
            System.err.format("Erro de E/S: %s%n", x);
        }
        String[] valores = linha.split(",");
        return valores;
    }

    public static void escrevaSaldo(double saldo, String s) {
        String str = Double.toString(saldo);
        String currDir = Paths.get("").toAbsolutePath().toString(); // Obtem o caminho para o diretório corrente
        String nameComplete = currDir + "\\" + "Dinheiro.txt"; // Monta o nome do arquivo
        Path path = Paths.get(nameComplete);
        try (PrintWriter writer = new PrintWriter(Files.newBufferedWriter(path, StandardCharsets.UTF_8))) {
            writer.print( str + "," + s);
        } catch (IOException x) {
            System.err.format("Erro de E/S: %s%n", x);
        }
    }
    public static void escrevaSaldoPendente(double saldo, String s) {
        String str = Double.toString(saldo);
        String currDir = Paths.get("").toAbsolutePath().toString(); // Obtem o caminho para o diretório corrente
        String nameComplete = currDir + "\\" + "Dinheiro.txt"; // Monta o nome do arquivo
        Path path = Paths.get(nameComplete);
        try (PrintWriter writer = new PrintWriter(Files.newBufferedWriter(path, StandardCharsets.UTF_8))) {
            writer.print( s + "," + str);
        } catch (IOException x) {
            System.err.format("Erro de E/S: %s%n", x);
        }
    }
}
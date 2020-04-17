package BancoDeDados;

import java.sql.SQLException;

public class Cars {
    public static void main(String[] args) throws SQLException {
        System.out.println(Conexao.getConexao());


    }
    private String name;
    private String cor;
    private int ano;

    public Cars(String name, String cor, int ano) {
        this.name = name;
        this.cor = cor;
        this.ano = ano;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}

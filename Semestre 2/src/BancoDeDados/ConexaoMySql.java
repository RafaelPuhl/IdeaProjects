package BancoDeDados;

import java.awt.Component;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class ConexaoMySql {
    private boolean status = false;
    private String mensagem = "";
    private Connection con = null;
    private Statement statement;
    private ResultSet resultSet;
    private String servidor = "localhost";
    private String nomeDoBanco = "Banco1";
    private String usuario = "root";
    private String senha = "Millefire2011";

    public ConexaoMySql() {
    }

    public ConexaoMySql(String pServidor, String pNomeDoBanco, String pUsuario, String pSenha) {
        this.servidor = pServidor;
        this.nomeDoBanco = pNomeDoBanco;
        this.usuario = pUsuario;
        this.senha = pSenha;
    }

    public Connection conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            String url = "jdbc:mysql://" + this.servidor + "/" + this.nomeDoBanco;
            this.setCon(DriverManager.getConnection(url, this.usuario, this.senha));
            this.status = true;
        } catch (InstantiationException | IllegalAccessException | SQLException | ClassNotFoundException var2) {
            JOptionPane.showMessageDialog((Component)null, var2.getMessage());
        }

        return this.getCon();
    }

    public boolean executarSQL(String pSQL) {
        try {
            this.setStatement(this.getCon().createStatement());
            this.setResultSet(this.getStatement().executeQuery(pSQL));
            return true;
        } catch (SQLException var3) {
            var3.printStackTrace();
            return false;
        }
    }

    public boolean executarUpdateDeleteSQL(String pSQL) {
        try {
            this.setStatement(this.getCon().createStatement());
            this.getStatement().executeUpdate(pSQL);
            return true;
        } catch (SQLException var3) {
            var3.printStackTrace();
            return false;
        }
    }

    public int insertSQL(String pSQL) {
        int status = 0;

        try {
            this.setStatement(this.getCon().createStatement());
            this.getStatement().executeUpdate(pSQL);
            this.setResultSet(this.getStatement().executeQuery("SELECT last_insert_id();"));

            while(this.resultSet.next()) {
                status = this.resultSet.getInt(1);
            }

            return status;
        } catch (SQLException var4) {
            var4.printStackTrace();
            return status;
        }
    }

    public boolean fecharConexao() {
        try {
            if (this.getResultSet() != null && this.statement != null) {
                this.getResultSet().close();
                this.statement.close();
            }

            this.getCon().close();
            return true;
        } catch (SQLException var2) {
            JOptionPane.showMessageDialog((Component)null, var2.getMessage());
            return false;
        }
    }

    public boolean isStatus() {
        return this.status;
    }

    public String getMensagem() {
        return this.mensagem;
    }

    public Statement getStatement() {
        return this.statement;
    }

    public ResultSet getResultSet() {
        return this.resultSet;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public Connection getCon() {
        return this.con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }

    public void setResultSet(ResultSet resultSet) {
        this.resultSet = resultSet;
    }

    public String getServidor() {
        return this.servidor;
    }

    public void setServidor(String servidor) {
        this.servidor = servidor;
    }

    public String getNomeDoBanco() {
        return this.nomeDoBanco;
    }

    public void setNomeDoBanco(String nomeDoBanco) {
        this.nomeDoBanco = nomeDoBanco;
    }

    public String getUsuario() {
        return this.usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}

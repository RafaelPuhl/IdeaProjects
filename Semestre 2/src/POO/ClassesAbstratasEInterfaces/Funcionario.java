package POO.ClassesAbstratasEInterfaces;

public class Funcionario implements Atleta {
    private int matricula;
    private String nome;
    private float salario;
    private Modalidade modAtleta;
    private String dados = "";
   
	public Funcionario(int matricula, String nome, float salario, Modalidade modAtleta) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.salario = salario;
		this.modAtleta = modAtleta;
		this.dados = this.nome + "," + this.matricula + "," + this.salario + "," + this.modAtleta;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public int getMatricula() {
		return matricula;
	}

	public String getNome() {
		return nome;
	}

	@Override
	public Modalidade getModalidade() {
		return modAtleta;
	}

	public String getDados(){
		return this.dados;
	}
}

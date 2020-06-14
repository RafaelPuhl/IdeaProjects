package POO.ClassesAbstratasEInterfaces;

import java.util.HashMap;
import java.util.Map;

public class AlunoAtleta implements Aluno, Atleta {
	private String nome;
	private int matricula;
	private Modalidade modAtleta;
	private Map<Integer, Float> notas;

	public AlunoAtleta(int matricula, String nome, Modalidade modAtleta) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.modAtleta = modAtleta;
		notas = new HashMap<>();
	}

	@Override
	public int getMatricula() {
		return matricula;
	}

	@Override
	public String getNome() {
		return nome;
	}

	@Override
	public Modalidade getModalidade() {
		return modAtleta;
	}

	@Override
	public boolean setNota(int nro, float nota) {
		notas.put(nro, nota);
		return true;
	}

	@Override
	public float getNota(int nro) {
		return notas.get(nro);
	}

	@Override
	public float mediaFinal() {
		return ((float) notas.values().stream().mapToDouble(v -> v.doubleValue()).average().getAsDouble());
	}

	@Override
	public boolean aprovado() {
		return mediaFinal() >= 7.0;
	}

}

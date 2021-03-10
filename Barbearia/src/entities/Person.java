package entities;

public abstract class Person {
    private String name;
    private long cpf;

    public Person(long cpf, String name) {
        this.cpf = cpf;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }
}

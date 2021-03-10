package entities;

public class Client extends Person {
    private int point;

    public Client(long cpf, String name) {
        super(cpf, name);
        this.point = 0;
    }
}

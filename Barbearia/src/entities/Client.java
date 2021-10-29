package entities;

public class Client extends Person {
    private int point;

    public Client(long cpf, String name) {
        super(cpf, name);
        this.point = 0;
    }

    public int getPoint() {
        return point;
    }

    public void addPoint(int point) {
        this.point += point;
    }
}

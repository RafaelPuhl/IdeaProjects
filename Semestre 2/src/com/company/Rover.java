package com.company;

public class Rover {
    private int x;
    private int y;

    public Rover() {
        x = 0;
        y = 0;
    }

    public Rover(int xInicial, int yInicial) {
        x = xInicial;
        y = yInicial;
    }

    public void moverNorte() {
        y++;
    }

    public void moverSul() {
        y--;
    }

    public void moverLeste() {
        x++;
    }

    public void moverOeste() {
        x--;
    }

    public String getPosicao() {
        return ("(" + x + "/" + y + ")");
    }

    public void setPosicao(int xSet, int ySet) {
        x = xSet;
        y = ySet;
    }
}

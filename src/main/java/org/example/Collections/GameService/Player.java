package org.example.Collections.GameService;

public class Player {

    protected int id;
    protected String name;
    protected int Strength;

    public String getName() {
        return name;
    }

    public int getStrength() {
        return Strength;
    }

    public Player(int id, String name, int strength) {
        this.id = id;
        this.name = name;
        Strength = strength;
    }
}

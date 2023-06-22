package package1;

import java.util.Random;

public abstract class Hero {
    public  String name;
    public int health;
    public int strength;
    protected static Random rand = new Random();

    public Hero(String name, int health, int strength) {
        this.name = name;
        this.health = health;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }



    public abstract void attack(Hero another);

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", strength=" + strength +
                '}';
    }
}
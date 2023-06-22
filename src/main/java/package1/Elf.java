package package1;

public class Elf extends Hero {
    private static String[] imiona = {"Erro", "Legolas", "Alfsol", "Kaldia", "Albrun", "Aubrie"};
    public Elf(String name, int health, int strength) {
        super(name, health, strength);
    }
    public static Elf getInstance(){
        String imie = imiona[rand.nextInt(imiona.length)];
        int zdrowie = rand.nextInt(50,100);
        int sila = rand.nextInt(20,40);
        return new Elf(imie, zdrowie, sila);
    }

    @Override
    public void attack(Hero another) {
        int damage = (int)(this.strength * rand.nextDouble(0.5,1));
        another.health -= damage;
        System.out.println(this.name + " attacks " + another.name +
                " and deals " +damage+ " points of damage.");
    }
}
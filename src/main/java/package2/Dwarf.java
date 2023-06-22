package package2;
import package1.Hero;

/**
 * this class describes Dwarf and extends Hero class
 */
public class Dwarf extends Hero {
    private static String[] imiona = {"Dwalin", "Gimli", "Bofur", "Thorin", "Shaper", "Gut"};

    public Dwarf(String name, int health, int strength) {
        super(name, health, strength);
    }

    /**
     * Constructs parameters for the Dwarf
     * @return
     */

    public static Dwarf getInstance(){
        String imie = imiona[rand.nextInt(imiona.length)];
        int zdrowie = rand.nextInt(50,100);
        int sila = rand.nextInt(33,55);
        return new Dwarf(imie, zdrowie, sila);
    }
    /**
     * Randomizes the name/health/strength of the Dwarf
     * return Dwarf
     */

    @Override
    public void attack(Hero another) {
        int damage = (int)(this.strength * rand.nextDouble(0.5,1));
        another.health -= damage;
        System.out.println(this.name + " attacks " + another.name +
                " and deals " + damage + " points of damage.");
    }
}
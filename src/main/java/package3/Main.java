package package3;

import package1.Elf;
import package1.Hero;
import package2.Dwarf;

/**
 * This class tests and prints out the programme
 */

public class Main {
    public static void main(String[] args) {
        Hero elf = Elf.getInstance();
        Hero dwarf = Dwarf.getInstance();

        while (elf.getHealth() > 0 && dwarf.getHealth() > 0) {
            elf.attack(dwarf);
            System.out.println(dwarf);

            if (dwarf.getHealth() <= 0) {
                System.out.println("Dwarf has been defeated!");
                break;
            }

            dwarf.attack(elf);
            System.out.println(elf);

            if (elf.getHealth() <= 0) {
                System.out.println("Elf has been defeated!");
                break;
            }
            /**
             * Loop which causes and Elf to fight with Dwarf unless someone has less or 0 health points
             */
        }
    }
}
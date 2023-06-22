package package3;

import package1.Elf;
import package1.Hero;
import package2.Dwarf;

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
        }
    }
}
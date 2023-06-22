package package3;

import package1.Elf;
import package1.Hero;
import package2.Dwarf;

public class Main {
    public static void main(String[] args) {
        Hero elf = Elf.getInstance();
        Hero dwarf = Dwarf.getInstance();

        elf.attack(dwarf);
        System.out.println(dwarf);
    }
}
package ru.skypro;

import java.util.Objects;

public class RavenclawStudent extends HogwartsStudent {
    private int intelligence;
    private int wisdom;
    private int wit;
    private int creativity;

    public RavenclawStudent(String name, int magicPower, int transgressionDistance, int intelligence, int wisdom, int wit, int creativity) {
        super(name, magicPower, transgressionDistance);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    public int ability() {
        return intelligence + wisdom + wit + creativity;
    }

    public void compareRavenclaw(RavenclawStudent ravenclawStudent) {
        int ability1 = ability();
        int ability2 = ravenclawStudent.ability();
        if (ability1 > ability2) {
            System.out.println(getName() + " лучший Когтевранец, чем " + ravenclawStudent.getName());
        } else if (ability2 > ability1) {
            System.out.println(ravenclawStudent.getName() + " лучший Когтевранец, чем " + getName());
        } else {
            System.out.println(ravenclawStudent.getName() + " такой же Когтевранец, как " + getName());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        RavenclawStudent that = (RavenclawStudent) o;
        return intelligence == that.intelligence && wisdom == that.wisdom && wit == that.wit && creativity == that.creativity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), intelligence, wisdom, wit, creativity);
    }

    @Override
    public String toString() {
        return super.toString() + ", ум: " + intelligence + ", мудрость: " + wisdom + ", остроумность: " + wit + ", креативность: " + creativity;
    }
}


package ru.skypro;

import java.util.Objects;

public class HogwartsStudent {
    private String name;
    private int magicPower;
    private int transgressionDistance;


    public HogwartsStudent(String name, int magicPower, int transgressionDistance) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public int getRansgressionDistance() {
        return transgressionDistance;
    }

    public void setRansgressionDistance(int ransgressionDistance) {
        this.transgressionDistance = ransgressionDistance;
    }

    public int abilityBased() {
        return magicPower + transgressionDistance;
    }

    public void print() {
        System.out.println(this);
    }

    public void compareTo(HogwartsStudent hogwartsStudent){
        int ability1 = abilityBased();
        int ability2 = hogwartsStudent.abilityBased();
        if (ability1 > ability2) {
            System.out.println(getName() + " лучший студент, чем " + hogwartsStudent.getName());
        } else if (ability2 > ability1) {
            System.out.println(hogwartsStudent.getName() + " лучший студент, чем " + getName());
        } else {
            System.out.println(hogwartsStudent.getName() + " такой же студент, как " + getName());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HogwartsStudent that = (HogwartsStudent) o;
        return magicPower == that.magicPower && transgressionDistance == that.transgressionDistance && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, magicPower, transgressionDistance);
    }

    @Override
    public String toString() {
        return "Студент " + name + ", сила магии: " + magicPower + ", дистанция трансгрессии: " + transgressionDistance;
    }
}

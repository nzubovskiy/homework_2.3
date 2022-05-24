package ru.skypro;

import java.util.Objects;

public class GriffindorStudent extends HogwartsStudent {
    private int nobility;
    private int honor;
    private int bravery;

    public GriffindorStudent(String name, int magicPower, int transgressionDistance, int nobility, int honor, int bravery) {
        super(name, magicPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public int ability() {
        return nobility + honor + bravery;
    }

    public void compareGriffindor(GriffindorStudent griffindorStudent) {
        int ability1 = ability();
        int ability2 = griffindorStudent.ability();
        if (ability1 > ability2) {
            System.out.println(getName() + " лучший Гриффиндорец, чем " + griffindorStudent.getName());
        } else if (ability2 > ability1) {
            System.out.println(griffindorStudent.getName() + " лучший Гриффиндорец, чем " + getName());
        } else {
            System.out.println(griffindorStudent.getName() + " такой же Гриффиндорец, как " + getName());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        GriffindorStudent that = (GriffindorStudent) o;
        return nobility == that.nobility && honor == that.honor && bravery == that.bravery;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nobility, honor, bravery);
    }

    @Override
    public String toString() {
        return super.toString() + ", благородство: " + nobility + ", честь: " + honor + ", храбрость:" + bravery;
    }
}

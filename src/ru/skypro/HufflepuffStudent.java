package ru.skypro;

import java.util.Objects;

public class HufflepuffStudent extends HogwartsStudent {
    private int diligence;
    private int loyalty;
    private int honesty;

    public HufflepuffStudent(String name, int magicPower, int transgressionDistance, int diligence, int loyalty, int honesty) {
        super(name, magicPower, transgressionDistance);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }



    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public int ability() {
        return diligence + loyalty + honesty;
    }

    public void compareHufflepuff(HufflepuffStudent hufflepuffStudent) {
        int ability1 = ability();
        int ability2 = hufflepuffStudent.ability();
        if (ability1 > ability2) {
            System.out.println(getName() + " лучший Пуффендуец, чем " + hufflepuffStudent.getName());
        } else if (ability2 > ability1) {
            System.out.println(hufflepuffStudent.getName() + " лучший Пуффендуец, чем " + getName());
        } else {
            System.out.println(hufflepuffStudent.getName() + " такой же Пуффендуец, как " + getName());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        HufflepuffStudent that = (HufflepuffStudent) o;
        return diligence == that.diligence && loyalty == that.loyalty && honesty == that.honesty;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), diligence, loyalty, honesty);
    }

    @Override
    public String toString() {
        return super.toString() + ", трудолюбие: " + diligence + ", верность: " + loyalty + ", честность" + honesty;
    }
}

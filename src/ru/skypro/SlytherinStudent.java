package ru.skypro;

import java.util.Objects;

public class SlytherinStudent extends HogwartsStudent {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustPower;

    public SlytherinStudent(String name, int magicPower, int transgressionDistance, int cunning, int determination, int ambition, int resourcefulness, int lustPower) {
        super(name, magicPower, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustPower = lustPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustPower() {
        return lustPower;
    }

    public void setLustPower(int lustPower) {
        this.lustPower = lustPower;
    }

    public int ability() {
        return cunning + determination + ambition + resourcefulness + lustPower;
    }

    public void compareSlytherin(SlytherinStudent slytherinStudent) {
        int ability1 = ability();
        int ability2 = slytherinStudent.ability();
        if (ability1 > ability2) {
            System.out.println(getName() + " лучший Слизеринец, чем " + slytherinStudent.getName());
        } else if (ability2 > ability1) {
            System.out.println(slytherinStudent.getName() + " лучший Слизеринец, чем " + getName());
        } else {
            System.out.println(slytherinStudent.getName() + " такой же Слизеринец, как " + getName());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SlytherinStudent that = (SlytherinStudent) o;
        return cunning == that.cunning && determination == that.determination && ambition == that.ambition && resourcefulness == that.resourcefulness && lustPower == that.lustPower;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cunning, determination, ambition, resourcefulness, lustPower);
    }

    @Override
    public String toString() {
        return super.toString() + ", хитрость: " + cunning + ", решительность: " + determination + ", амбициозность: " + ambition + ", находчивость: " + resourcefulness + ", жажда власти: " + lustPower;
    }
}

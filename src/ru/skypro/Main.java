package ru.skypro;

public class Main {

    public static void main(String[] args) {
        GriffindorStudent harry = new GriffindorStudent("Гарри Поттер", 57, 91, 97, 97, 86);
        GriffindorStudent hermiona = new GriffindorStudent("Гермиона Грейнджер", 52, 94, 97, 66, 68);
        GriffindorStudent ron = new GriffindorStudent("Рон Уизли", 81, 62, 67, 59, 52);
        HufflepuffStudent zakharia = new HufflepuffStudent("Захария Смит", 66, 77, 84, 96, 94);
        HufflepuffStudent sedrik = new HufflepuffStudent("Седрик Диггори", 61, 62, 62, 66,83);
        HufflepuffStudent justin = new HufflepuffStudent("Джастин Финч-Флетчли", 59, 55, 96, 69, 57);
        RavenclawStudent czhou = new RavenclawStudent("Чжоу Чанг", 100, 55, 74, 73, 97, 79);
        RavenclawStudent padma = new RavenclawStudent("Падма Патил", 69, 73, 93, 80, 91, 98);
        RavenclawStudent marcus = new RavenclawStudent("Маркус Белби", 78, 62, 68, 72, 59, 64);
        SlytherinStudent graham = new SlytherinStudent("Грэхэм Монтегю", 54, 78, 61, 90, 70, 94, 86);
        SlytherinStudent draco = new SlytherinStudent("Драко Малфой", 71, 86, 100, 76, 98, 56, 59);
        SlytherinStudent gregory = new SlytherinStudent("Грегори Гойл", 89, 70, 70, 57, 63, 69, 84);

        System.out.println(harry);
        System.out.println(hermiona);
        System.out.println(ron);
        System.out.println(zakharia);
        System.out.println(sedrik);
        System.out.println(justin);
        System.out.println(czhou);
        System.out.println(padma);
        System.out.println(marcus);
        System.out.println(graham);
        System.out.println(draco);
        System.out.println(gregory);

        System.out.println();

        harry.compareTo(draco);

        System.out.println();

        harry.compareGriffindor(ron);

        zakharia.compareHufflepuff(sedrik);

        czhou.compareRavenclaw(marcus);

        draco.compareSlytherin(gregory);





    }


}

package Programmiergrundlagen_Java_1.modul_6;

public class Telefonbuch {
    public static void main(String[] args) {
        Person mami = new Person("Mami", 19600522, 795162154);
        Person babi = new Person("Babi", 19600501, 765241569);
        Person bruder1 = new Person("Bruder1", 19870205, 765246825);
        Person bruder2 = new Person("Bruder2", 19861105, 764528957);
        Person person = new Person();
        Person mamiNatel = mami.clone();

        mamiNatel.setNummer(123456789);

        System.out.println(mami);
        System.out.println(mamiNatel);
        System.out.println(babi);
        System.out.println(bruder1);
        System.out.println(person);
        Person test = mami.clone();
        System.out.println(mami.equals(test));

        bruder2.printCounter();

    }
}

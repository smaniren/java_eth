package Programmiergrundlagen_Java_1.modul_6;

public class Person {
    private String name;
    private int datum;
    private int nummer;
    private String adresse;
    private static int counter = 0;

    public Person() {
        name = "Anonym";
        datum = 19700101;
        nummer = 1818;
        adresse = "";
        counter++;
    }

    public Person(String name, int datum, int nummer) {
        this.name = name;
        this.datum = datum;
        this.nummer = nummer;
        counter++;
    }

    public Person clone() {
        Person p = new Person();
        p.name = this.name;
        p.nummer = this.nummer;
        p.datum = this.datum;
        return p;
    }

    public void print() {
        System.out.println(name + " ist am " + datum + " geboren und hat die Nummer " + nummer);
    }

    public void printCounter() {
        System.out.println(counter);
    }

    public void setName(String name_value) {
        name = name_value;
    }

    public void setDatum(int datum_value) {
        if (datum_value > 0) {
            datum = datum_value;
        }
    }

    public void setNummer(int nummer_value) {
        if (nummer_value > 0) {
            nummer = nummer_value;
        }
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getName() {
        return name;
    }

    public int getDatum() {
        return datum;
    }

    public int getNummer() {
        return nummer;
    }

    public String getAdresse() {
        return adresse;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", datum=" + getDateString(datum) + ", nummer=" + nummer + ", adresse="
                + adresse + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + datum;
        result = prime * result + nummer;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (datum != other.datum)
            return false;
        if (nummer != other.nummer)
            return false;
        return true;
    }

    public static String getDateString(int date) {
        String inputDate = date + "";
        if (inputDate.length() != 8) {
            System.out.println("Invalid input date format. It should be in 'YYYYMMDD' format.");
            return "";
        }

        // Extract year, month, and day components from the input string
        int year = Integer.parseInt(inputDate.substring(0, 4));
        int month = Integer.parseInt(inputDate.substring(4, 6));
        int day = Integer.parseInt(inputDate.substring(6, 8));

        // Check if the month and day are within valid ranges
        if (month < 1 || month > 12 || day < 1 || day > 31) {
            System.out.println("Invalid date components.");
            return "";
        }

        // Format the date in "DD.MM.YYYY" format
        String formattedDate = String.format("%02d.%02d.%04d", day, month, year);
        return formattedDate;
    }
}
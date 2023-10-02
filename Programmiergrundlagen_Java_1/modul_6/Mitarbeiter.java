package Programmiergrundlagen_Java_1.modul_6;

public class Mitarbeiter {
    private int salary;
    private int position;

    public Mitarbeiter(int position) {
        this.position = position;
        if (position == 1) {
            this.salary = (int) (Math.random() * 90000 + 150000);
        } else if (position == 2) {
            this.salary = (int) (Math.random() * 60000 + 90000);
        } else if (position == 3) {
            this.salary = (int) (Math.random() * 30000 + 60000);
        }
        System.out.println(this.getSalary());
        System.out.println(this.getSpace());

    }

    public Mitarbeiter(Mitarbeiter m) {
        this.position = m.position;
        this.salary = m.salary;
    }

    public double getSpace() {
        return 10 + (this.salary / 10000);
    }

    public boolean equals(Mitarbeiter m) {
        if (m.salary == this.salary && m.position == this.position) {
            return true;
        }
        return false;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

}

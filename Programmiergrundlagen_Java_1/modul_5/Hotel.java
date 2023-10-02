package Programmiergrundlagen_Java_1.modul_5;

public class Hotel {
    private int stockwerke;
    private int zimmerProStockwerk;
    private int belegung;

    public Hotel(int stockwerke, int zimmerProStockwerk, int belegung) {
        this.stockwerke = stockwerke;
        this.zimmerProStockwerk = zimmerProStockwerk;
        this.belegung = belegung;
    }

    public int getFreieZimmer() {
        return (stockwerke * zimmerProStockwerk) - belegung;
    }

    public void einchecken(int anzahl) {
        belegung += anzahl;
    }

    public void auschecken(int anzahl) {
        belegung -= anzahl;
    }

    public void printInfo() {
        System.out.println("Anzahl Zimmer: " + stockwerke * zimmerProStockwerk + " | belegt: " + belegung
                + " Zimmer | frei: " + getFreieZimmer());
    }

    public int getStockwerke() {
        return stockwerke;
    }

    public void setStockwerke(int stockwerke) {
        this.stockwerke = stockwerke;
    }

    public int getZimmerProStockwerk() {
        return zimmerProStockwerk;
    }

    public void setZimmerProStockwerk(int zimmerProStockwerk) {
        this.zimmerProStockwerk = zimmerProStockwerk;
    }

    public int getBelegung() {
        return belegung;
    }

    public void setBelegung(int belegung) {
        this.belegung = belegung;
    }

    @Override
    public String toString() {
        return "Hotel [stockwerke=" + stockwerke + ", zimmerProStockwerk=" + zimmerProStockwerk + ", belegung="
                + belegung + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + stockwerke;
        result = prime * result + zimmerProStockwerk;
        result = prime * result + belegung;
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
        Hotel other = (Hotel) obj;
        if (stockwerke != other.stockwerke)
            return false;
        if (zimmerProStockwerk != other.zimmerProStockwerk)
            return false;
        if (belegung != other.belegung)
            return false;
        return true;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }
}

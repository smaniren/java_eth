package Programmiergrundlagen_Java_1.modul_5;

public class Hotel {
    int stockwerke;
    int zimmerProStockwerk;
    int belegung;

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
}

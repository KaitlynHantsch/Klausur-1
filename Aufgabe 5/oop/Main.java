package oop;

public class Main {
    public static void main(String[] args){
        SystemZeit systemZeit = new SystemZeit();
        KonsolenAnzeige konsolenAnzeige = new KonsolenAnzeige();
        Uhr uhr = new Uhr(systemZeit, konsolenAnzeige);
        uhr.aktivieren();
        uhr.beenden();
    }
}

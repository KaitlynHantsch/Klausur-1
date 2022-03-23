package oop;

import java.text.SimpleDateFormat;

public class KonsolenAnzeige implements Anzeige{

    private final SimpleDateFormat FORMAT = new SimpleDateFormat(("'Es ist gerade' HH:mm 'Uhr und' ss 'Sekunden.'"));
    Uhrwerk systemZeit;

    @Override
    public void setUhrwerk(Uhrwerk u) {
        systemZeit = u;
    }

    @Override
    public void zeigeZeit() {
        System.out.println(FORMAT.format(systemZeit.getZeit()));
    }
    
}

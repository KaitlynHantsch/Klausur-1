package oop;

import java.util.Date;

public class SystemZeit implements Uhrwerk{

    @Override
    public Date getZeit() {
        Date d = new Date();
        return d;
    }

    @Override
    public void setZeit(Date z) {
        throw new UnsupportedOperationException();
    }

}
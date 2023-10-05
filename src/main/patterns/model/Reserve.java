package main.patterns.model;

import java.util.Date;

public class Reserve {
    private static int  reserveNo = 100;
    private final int id;

    private Date date;

    private String name;

    {
        id=++reserveNo;
    }
    public static int getReserveNo() {
        return reserveNo;
    }

    public int getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public String getName() {
        return name;
    }

    public Reserve(Date date, String name) {
        this.date = date;
        this.name = name;
    }

}

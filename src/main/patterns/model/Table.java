package main.patterns.model;

import java.util.ArrayList;
import java.util.Collection;

public class Table {
    private final int no;

    public int getNo() {
        return no;
    }

    private final Collection<Reserve> reservations = new ArrayList<>();

    private static int count;

    {
        no=++count;
    }

    public Collection<Reserve> getReservations() {
        return reservations;
    }

    @Override
    public String toString(){
        return String.format("Table #%d", no);
    }

}

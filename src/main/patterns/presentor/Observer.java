package main.patterns.presentor;

import java.util.Date;

public interface Observer {
    void onReservationTable(Date reservation, int tableNo, String name);
}

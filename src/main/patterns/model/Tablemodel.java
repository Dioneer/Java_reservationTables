package main.patterns.model;

import main.patterns.presentor.Modules;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class Tablemodel implements Modules {
    private Collection<Table> tables;

    public Collection<Table> loadTables(){
        if(tables == null){
            tables = new ArrayList<>();
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
        }
        return tables;
    }
    public int reservationTable(Date reservDate, int tableNo, String name) {
        for (Table table : tables) {
            if (table.getNo() == tableNo) {
                Reserve reserve = new Reserve(reservDate, name);
                table.getReservations().add(reserve);
                return reserve.getId();
            }
        }
        return -1;
    }
}

package main.patterns.presentor;

import main.patterns.model.Table;

import java.util.Collection;
import java.util.Date;

public interface Modules {
    Collection<Table> loadTables();
    int reservationTable(Date reservDate, int tableNo, String name);
}

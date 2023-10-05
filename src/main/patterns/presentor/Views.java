package main.patterns.presentor;

import main.patterns.model.Table;

import java.util.Collection;

public interface Views {
    void showTables(Collection<Table> tables);
    void setObserver(Observer observer);

    void showReservationResult(int resultNo);
}

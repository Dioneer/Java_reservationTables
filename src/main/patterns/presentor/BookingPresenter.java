package main.patterns.presentor;

import main.patterns.model.Table;

import java.util.Collection;
import java.util.Date;

public class BookingPresenter implements Observer{
    private final Modules tablemodel;
    private final Views bookingView;
    public BookingPresenter(Modules tablemodel, Views bookingView) {
        this.tablemodel = tablemodel;
        this.bookingView = bookingView;
        this.bookingView.setObserver(this);
    }

    public Collection<Table> loadTables(){
       return tablemodel.loadTables();
    }
    public void updateTables(){
        bookingView.showTables(loadTables());
    }

    @Override
    public void onReservationTable(Date reservation, int tableNo, String name) {
       int resultNo =  tablemodel.reservationTable(reservation, tableNo, name);
        updateReservationResult(resultNo);
    }
    public void updateReservationResult(int resultNo){
        bookingView.showReservationResult(resultNo);
    }
}

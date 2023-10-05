package main.patterns;

import main.patterns.model.Tablemodel;
import main.patterns.presentor.BookingPresenter;
import main.patterns.views.BookingView;

import java.util.Date;

public class Program {
    public static void main(String[] args) {
        Date date = new Date();
        Tablemodel tablemodel = new Tablemodel();
        BookingView bookingView = new BookingView();
        BookingPresenter bookingPresenter = new BookingPresenter(tablemodel, bookingView);
        bookingPresenter.updateTables();
        bookingView.reservationTable(date, 2, "Kira");
    }
}

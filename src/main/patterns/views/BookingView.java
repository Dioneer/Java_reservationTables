package main.patterns.views;

import main.patterns.model.Table;
import main.patterns.presentor.Observer;
import main.patterns.presentor.Views;

import java.util.Date;
import java.util.Collection;

public class BookingView implements Views {

    private Observer observer;

    public void setObserver(Observer observer) {
        this.observer = observer;
    }

    @Override
    public void showReservationResult(int resultNo) {
        if(resultNo>0) {
            System.out.println("Your reservation number is " + resultNo);
        } else{
            System.out.println("Your reservation was failed");
        }
    }

    public void showTables(Collection<Table> tables){
        for(Table t: tables){
         System.out.println(t);
        }
    }
    public void reservationTable(Date reservation, int tableNo, String name){
        if(observer != null){
            observer.onReservationTable(reservation, tableNo, name);
        }
    }
}

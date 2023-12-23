package org.example.task1;

public class ATM {
    public Tray firstTray;

    public ATM() {
        Tray100 tray100 = new Tray100();
        Tray50 tray50 = new Tray50();
        Tray2 tray2 = new Tray2();

        firstTray = tray100;
        tray100.setNext(tray50);
        tray50.setNext(tray2);
    }

    public void process(int amount) {
        firstTray.process(amount);
    }

}

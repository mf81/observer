package eu.maciejfijalkowski.wzprojobserwator.order;

import eu.maciejfijalkowski.wzprojobserwator.notification.Observer;

public interface Observabel {
    void registerObserwer (Observer observer);
    void unregisterObserwer(Observer observer);
    void notifayObserwer();
}

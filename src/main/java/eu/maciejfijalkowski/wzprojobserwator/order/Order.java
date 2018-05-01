package eu.maciejfijalkowski.wzprojobserwator.order;

import eu.maciejfijalkowski.wzprojobserwator.notification.Observer;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
public class Order implements Observabel{
    private Long orderNumber;
    private OrderStatus orderStatus;
    private Set<Observer> registeredObservers = new HashSet<>();

    public Order(Long orderNumber, OrderStatus orderStatus) {
        this.orderNumber = orderNumber;
        this.orderStatus = orderStatus;
    }

    @Override
    public void registerObserwer(Observer observer) {
        registeredObservers.add(observer);
    }

    @Override
    public void unregisterObserwer(Observer observer) {
        registeredObservers.remove(observer);

    }

    @Override
    public void notifayObserwer() {
        for (Observer observer : registeredObservers){
            observer.update(this);
        }
    }

    public void changeOrderStatus(OrderStatus orderStatus){
        setOrderStatus(orderStatus);
        notifayObserwer();

    }
}

package eu.maciejfijalkowski.wzprojobserwator.notification;

import eu.maciejfijalkowski.wzprojobserwator.order.Order;

public interface Observer {
    void update(Order order);
}

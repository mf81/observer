package eu.maciejfijalkowski.wzprojobserwator.notification;

import eu.maciejfijalkowski.wzprojobserwator.order.Order;

public class TextMessages implements Observer {
    public void update(Order order){
        System.out.println("SMS - zamówienie numer: " + order.getOrderNumber() + "zmieniło status na: " + order.getOrderStatus());
    }


}

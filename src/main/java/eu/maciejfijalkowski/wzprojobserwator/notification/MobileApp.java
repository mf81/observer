package eu.maciejfijalkowski.wzprojobserwator.notification;

import eu.maciejfijalkowski.wzprojobserwator.order.Order;

public class MobileApp implements  Observer{
    public void update(Order order){
        System.out.println("Mobali App - zamówienie numer: " + order.getOrderNumber() + "zmieniło status na: " + order.getOrderStatus());
    }

}

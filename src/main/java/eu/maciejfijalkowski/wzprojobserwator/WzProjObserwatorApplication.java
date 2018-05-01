package eu.maciejfijalkowski.wzprojobserwator;

import eu.maciejfijalkowski.wzprojobserwator.notification.Email;
import eu.maciejfijalkowski.wzprojobserwator.notification.MobileApp;
import eu.maciejfijalkowski.wzprojobserwator.notification.TextMessages;
import eu.maciejfijalkowski.wzprojobserwator.order.Order;
import eu.maciejfijalkowski.wzprojobserwator.order.OrderStatus;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WzProjObserwatorApplication {

	public static void main(String[] args) {

		Order order = new Order(101L,OrderStatus.ZAREJESTROWANE);

		Email email = new Email();
		MobileApp mobileApp = new MobileApp();
		TextMessages textMessages = new TextMessages();

		order.registerObserwer(email);
		order.registerObserwer(mobileApp);
		order.registerObserwer(textMessages);

		order.notifayObserwer();

//		SpringApplication.run(WzProjObserwatorApplication.class, args);
	}
}


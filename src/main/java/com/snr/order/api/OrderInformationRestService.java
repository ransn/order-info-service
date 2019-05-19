package com.snr.order.api;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.snr.order.bean.Order;
import com.snr.order.bean.UserOrders;

@RestController
@RequestMapping("/order")
public class OrderInformationRestService {
	
	@RequestMapping("/orderDetails/{orderId}")
	public Order getOrderInformation(@PathVariable("orderId") String orderId) {
		
		return new Order(1, "shipped", 890.32);
	}
	
	@RequestMapping("/myOrders/{userId}")
	public UserOrders getOrdersList(@PathVariable("userId") String userId) {
		UserOrders userOrders = new UserOrders();
		
		List<Order> orders = Arrays.asList(new Order(1, "shipped", 890.32), 
				new Order(2, "dispatched", 320.00),
				new Order(3, "delivered", 110.00));
		
		userOrders.setOrders(orders);
		return userOrders;
	}

}

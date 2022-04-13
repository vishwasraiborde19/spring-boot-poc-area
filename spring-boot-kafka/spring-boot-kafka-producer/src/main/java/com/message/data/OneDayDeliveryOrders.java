package com.message.data;

import java.io.Serializable;
import java.util.Objects;

import com.message.data.Order;

public class OneDayDeliveryOrders extends Order{

	public OneDayDeliveryOrders(Integer orderID, Double totalPayable, Double vatAmount, String deliveryAddressLine1,
	        String deliveryAddressLine2, String postCode) {
		super(orderID, totalPayable, vatAmount, deliveryAddressLine1, deliveryAddressLine2, postCode);
		// TODO Auto-generated constructor stub
	}

}

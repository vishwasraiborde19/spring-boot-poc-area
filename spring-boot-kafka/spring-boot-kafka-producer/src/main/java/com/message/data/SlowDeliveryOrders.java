package com.message.data;

import java.io.Serializable;
import java.util.Objects;

import com.message.data.Order;

public class SlowDeliveryOrders extends Order{

	public SlowDeliveryOrders(Integer orderID, Double totalPayable, Double vatAmount, String deliveryAddressLine1,
	        String deliveryAddressLine2, String postCode) {
		super(orderID, totalPayable, vatAmount, deliveryAddressLine1, deliveryAddressLine2, postCode);
		// TODO Auto-generated constructor stub
	}

}

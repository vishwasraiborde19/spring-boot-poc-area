package com.message.data;

import java.io.Serializable;
import java.util.Objects;

public class Order implements Serializable {

	private Integer orderID;
	private Double totalPayable;
	private Double vatAmount;
	private String deliveryAddressLine1;
	private String deliveryAddressLine2;
	private String postCode;

	public Order() {

	}

	public Order(Integer orderID, Double totalPayable, Double vatAmount, String deliveryAddressLine1,
	        String deliveryAddressLine2, String postCode) {
		super();
		this.orderID = orderID;
		this.totalPayable = totalPayable;
		this.vatAmount = vatAmount;
		this.deliveryAddressLine1 = deliveryAddressLine1;
		this.deliveryAddressLine2 = deliveryAddressLine2;
		this.postCode = postCode;
	}

	public Double getTotalPayable() {
		return totalPayable;
	}

	public void setTotalPayable(Double totalPayable) {
		this.totalPayable = totalPayable;
	}

	public Double getVatAmount() {
		return vatAmount;
	}

	public void setVatAmount(Double vatAmount) {
		this.vatAmount = vatAmount;
	}

	public String getDeliveryAddressLine1() {
		return deliveryAddressLine1;
	}

	public void setDeliveryAddressLine1(String deliveryAddressLine1) {
		this.deliveryAddressLine1 = deliveryAddressLine1;
	}

	public String getDeliveryAddressLine2() {
		return deliveryAddressLine2;
	}

	public void setDeliveryAddressLine2(String deliveryAddressLine2) {
		this.deliveryAddressLine2 = deliveryAddressLine2;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public Integer getOrderID() {
		return orderID;
	}

	public void setOrderID(Integer orderID) {
		this.orderID = orderID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(orderID);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		return Objects.equals(orderID, other.orderID);
	}

}

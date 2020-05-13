package Intr;

import java.util.Date;

public class Order implements java.io.Serializable {
	int teacherID;
	String orderName;
	int number;
	public Order(int teacherID, String orderName, int number) {
		this.teacherID = teacherID;
		this.orderName = orderName;
		this.number = number;
	}
	public Order(String orderName, int number) {
		this.orderName = orderName;
		this.number = number;
	}
	public int getNumber() {
		return number;
	}
	public String toString() {
		return "Order: " + orderName + ". Order number: " + number;
	}
	public boolean equals(Object o) {
		if(o == this) return true;
		if (!(o instanceof Order)) return false;
		Order order = (Order) o;
		return order.orderName.equals(orderName) && order.number == number;
	}
	public int hashcode() {
		int result = 17;
		result = result * 31 + orderName.hashCode();
		result = result * 31 + number;
		return result;
	}
}

package tuan12_task1;

import java.sql.Date;
import java.util.List;

public class Order {
	private String id;
	private String customer;
	private String employee;
	private Date date;
	private List<OrderItem> items;
	public Order(String id, String customer, String employee, Date date, List<OrderItem> items) {
		this.id = id;
		this.customer = customer;
		this.employee = employee;
		this.date = date;
		this.items = items;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public String getEmployee() {
		return employee;
	}
	public void setEmployee(String employee) {
		this.employee = employee;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public List<OrderItem> getItems() {
		return items;
	}
	public void setItems(List<OrderItem> items) {
		this.items = items;
	}
	

}

package cn.tedu.entity;
/*
 *t_order表：订单表
	     id
	     order_number 订单号
	     Total_money 总价
 * */
public class T_Order {
    private int id;
    private String  order_number;//订单号
    private double Total_money;//总价
	public T_Order(int id, String orderNumber, double totalMoney) {
		super();
		this.id = id;
		order_number = orderNumber;
		Total_money = totalMoney;
	}
	
	public T_Order(String orderNumber, double totalMoney) {
		super();
	 
		order_number = orderNumber;
		Total_money = totalMoney;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOrder_number() {
		return order_number;
	}

	public void setOrder_number(String orderNumber) {
		order_number = orderNumber;
	}

	public double getTotal_money() {
		return Total_money;
	}

	public void setTotal_money(double totalMoney) {
		Total_money = totalMoney;
	}

	public T_Order() {
		super();
	}
    
    
    
    
}

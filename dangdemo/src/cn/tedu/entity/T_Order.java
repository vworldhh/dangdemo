package cn.tedu.entity;
/*
 *t_order��������
	     id
	     order_number ������
	     Total_money �ܼ�
 * */
public class T_Order {
    private int id;
    private String  order_number;//������
    private double Total_money;//�ܼ�
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

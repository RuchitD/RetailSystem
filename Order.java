package pa4;

import java.util.Date;

public class Order {
	private String number;
	private Date ordered;
	private Date shipped;
	private Address ship_to;
	private OrderStatus status;
	private Real total;

}

enum OrderStatus  { 
    New, Hold, Shipped, Delivered, Closed; 
} 

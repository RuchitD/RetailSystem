package pa4;
import java.util.Date;

public class Account {
	
	private String id;
	private Address billing_address;
	private boolean is_closed;
	private Date open;
	private Date closed;

}

public Account( ) {
	
	id = makeID();
	billing_address = new Address();
	
}

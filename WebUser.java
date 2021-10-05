package pa4;

public class WebUser {
	private String login_id;
	private String password;
	private UserState state;

}
enum UserState  { 
    New, Active, Blocked, Banned; 
} 

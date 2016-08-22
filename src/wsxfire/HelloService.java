package wsxfire;

public class HelloService implements IHelloService {

	@Override
	public String sayHello(String name) {
		return "Hello,"+name;
	}

	@Override
	public User getUser(User user) {
        User userNew = new User();  
        userNew.setId(user.getId());  
        userNew.setName("new:"+user.getName());  
        return userNew;  
	}

}

package test;

import java.net.MalformedURLException;
import java.net.URL;

import org.codehaus.xfire.XFireFactory;
import org.codehaus.xfire.client.Client;
import org.codehaus.xfire.client.XFireProxyFactory;
import org.codehaus.xfire.service.Service;
import org.codehaus.xfire.service.binding.ObjectServiceFactory;

import wsxfire.IHelloService;
import wsxfire.User;

public class ClientTest {
	public static void main(String[] args) throws Exception {
		// 第一種调用webservice
		/*
		 * Service service=new
		 * ObjectServiceFactory().create(IHelloService.class); XFireProxyFactory
		 * factory =new
		 * XFireProxyFactory(XFireFactory.newInstance().getXFire()); String
		 * url="http://localhost:8080/wsxfire/service/IHelloService";
		 * IHelloService helloService=(IHelloService)
		 * factory.create(service,url);
		 * System.out.println(helloService.sayHello("张三")); User user=new
		 * User(); user.setName("张三");
		 * System.out.println(helloService.getUser(user).getName());
		 */

		// 第二种调用
		// String url =
		// "http://221.224.206.253:8089/DSB2B_Proxy/WebService.asmx?wsdl" ;
		String url = "http://192.168.104.72:8080/SSOManage/SSOWebservice?wsdl";
		//String url = "http://192.168.104.72:8080/SSOManage/SSOWebservice?xsd=1";

		Client client = new Client(new URL(url));
		Object[] objArray = new Object[1];
		objArray[0]="admin";
		//objArray[1]="ecidh.com";
		Object[] results = client.invoke("abel", objArray);
		System.out.println(results[0]);

		/*
		 * User user =new User(); user.setName("李四"); objArray[0]=user; Object[]
		 * result2 =client.invoke("getUser", objArray);
		 * 
		 * User u=(User) result2[0]; System.out.println(u.getName());
		 */
	}
}

package NewSpring.SpringApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ex= new ClassPathXmlApplicationContext("NewFile1.xml");
		DebitCard dc=(DebitCard) ex.getBean("temp2");
		DebitCard dc1=(DebitCard) ex.getBean("temp2");
		dc.payment();
		dc.setA(20);
		System.out.println(dc.getA());
		System.out.println(dc1.getA());
		dc.getAddress();
		
	}
}

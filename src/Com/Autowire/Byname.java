package Com.Autowire;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Byname {

	public static void main(String[] args) {
		
		System.out.println("----Welcome To Main----");
		
		Resource res= new ClassPathResource("Com/Autowire/Context.xml");
		
		BeanFactory bf=new XmlBeanFactory(res);
		
		Address ad=(Address) bf.getBean("Add");
		
		     ad.Disp();
		System.out.println("----Run Successfully----");
		
	}
	
	
}

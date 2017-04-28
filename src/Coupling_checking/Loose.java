package Coupling_checking;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Loose {

	
	public static void main(String[] args) {
		
		Resource res=new ClassPathResource("Coupling_checking/apple.xml");
		
		BeanFactory bf= new XmlBeanFactory(res);
		
		Coupling cp= (Coupling) bf.getBean("cp1");
		
		cp.Start();
		
		
		
	}
	
	
	
}

package Dependency_List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class ListCheck {

	public static void main(String[] args) {
		
		System.out.println("-----WELCOME TO MAIN-----");
		Resource res=new ClassPathResource("Dependency_List/ListCont.xml");
		System.out.println("-----XML PARSED SUCCESSFULLY-----");
		BeanFactory bf=new XmlBeanFactory(res);
		System.out.println("-----RESOURCE LOADED-----");
		Question q=(Question) bf.getBean("que");
		System.out.println("-----OBJECT CREATED-----");
		q.Display();
		System.out.println("-----DISPLAY SUCCESSFULLY RUN-----");
		
		
	}

}

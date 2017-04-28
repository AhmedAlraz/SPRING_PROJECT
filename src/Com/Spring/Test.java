package Com.Spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {
		
		System.out.println("Main Method Start");
		Resource res=new ClassPathResource("applicationContext.xml");
		
		System.out.println("Application Start to load");
		BeanFactory fact= new XmlBeanFactory(res);
		
		System.out.println("XML PARSE COMPLETED");
		Student st=(Student) fact.getBean("studentbean");
		System.out.println("Student Object Created");
	st.display();
	
	System.out.println("Display successfully run ");
	}

}

package DI_WITH_DEPENDENT_OBJECT;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class DependObj {
  
	public static void main(String[] args) {
		
		System.out.println("-----Welcome To Main Method----");
		
		Resource res= new ClassPathResource("DI_WITH_DEPENDENT_OBJECT/ObjectContext.xml");
		System.out.println("-----XML SUCCESSFULLY PARSED----");
		
		BeanFactory bf=new XmlBeanFactory(res);
		System.out.println("-----ALL THE RESOURESE LOADED----");
		
		Student st=(Student) bf.getBean("stu");
		System.out.println("-----OBJECT CREATED----");
		
		st.DispInfo();	
		System.out.println("-----DISPLAY RUN SUCCESSFULLY----");
		
	}
	
}

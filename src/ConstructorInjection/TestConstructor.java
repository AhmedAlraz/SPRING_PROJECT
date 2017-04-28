package ConstructorInjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestConstructor {
public static void main(String[] args) {
	System.out.println("-----Welcome to main metod-----");	
	Resource res=new ClassPathResource("ConstructorInjection/ConstructorContext.xml");
	System.out.println("----dXml Parsed-----");	

	BeanFactory bf=new XmlBeanFactory(res);
	System.out.println("-----Resourse Loaded-----");	

	TextEditor te=(TextEditor) bf.getBean("txtedit");
	
	//SpellChecker sp=(SpellChecker) bf.getBean("Spel");
	System.out.println("----- Created Object-----");	
	System.out.println("===========Output=============");
    te.CallDisp();
	te.CallDisp();
	System.out.println("===========OutputCompleted=============");

	

}
}

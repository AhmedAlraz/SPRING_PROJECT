package Coupling_checking;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Coupling {
Vehicle v;



public Vehicle getV() {
	return v;
}



public void setV(Vehicle v) {
	this.v = v;
}



void Start(){
	v.move();
}
	

}

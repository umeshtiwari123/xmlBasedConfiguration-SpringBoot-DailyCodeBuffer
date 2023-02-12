package demo;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@ComponentScan(basePackages = {"demo"})
@Scope(scopeName = "prototype")
public class Doctor implements Staff , BeanNameAware {

	private String qualification;
	
	@Bean
	public void assist() {
		System.out.println("Doctor is Assisting!");
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	@Override
	public String toString() {
		return "Doctor [qualification=" + qualification + "]";
	}

	@Override
	public void setBeanName(String name) {
		
		System.out.println("Set Bean name method is called");
	}
	
	@PostConstruct
	public void postConstruct()
	{
		System.out.println("Post Construct Method is called");
	}
	
}

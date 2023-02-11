package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
//		Doctor doctor=context.getBean(Doctor.class);
//		doctor.assist();
//		
//		Doctor doc=(Doctor)context.getBean("doctor");
//		doc.assist();
//		
//		Nurse nurse=context.getBean(Nurse.class);
//		nurse.assist();
		
		Staff staff=context.getBean(Nurse.class);
		staff.assist();
		
		Doctor doc1=context.getBean(Doctor.class);
		System.out.println(doc1.getQualification());
		
	}

}

package springIntro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
	ICustomerService service = context.getBean("service",ICustomerService.class);
	
	//Yukarýda bir soyutlama katmaný daha oluturduk arayüz deðiþirse diye
	
	//CustomerManager manager = new CustomerManager(context.getBean("database",ICustomerDal.class));
	
	service.add();
	
	}

}

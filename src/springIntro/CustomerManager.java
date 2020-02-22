package springIntro;

public class CustomerManager  implements ICustomerService{
	
	ICustomerDal customerDal;
	
	
	//Constructor injection
//	public CustomerManager(ICustomerDal customerDal) {
//		super();
//		this.customerDal = customerDal;
//	}
	
	
	//Setter injection
	public void setCustomerDal(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}

	public void add(){
		customerDal.add();
		
	}


}

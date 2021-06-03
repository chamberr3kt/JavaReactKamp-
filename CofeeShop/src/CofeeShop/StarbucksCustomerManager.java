package CofeeShop;
public class StarbucksCustomerManager extends BaseCustomerManager {

	private CustomerCheckService customerCheckService;
	
	
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) {
		if(this.customerCheckService.CheckIfRealPerson(customer)) {
			System.out.println("Database Kay�t Ba�ar�l�"+customer.getFirstName());
		}
		else {
			System.out.println("Database Kay�t Ba�ar�l� De�ildir");
		}
		
	}

	
	
	
}

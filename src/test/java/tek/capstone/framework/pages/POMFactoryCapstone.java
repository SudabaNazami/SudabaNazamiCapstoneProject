package tek.capstone.framework.pages;

import tek.capstone.framework.base.BaseSetup;

public class POMFactoryCapstone extends BaseSetup {

	private RetailHomePageCapstone HomePageCapstone;
	private RetailSignInPageCapstone signInPageCapstone;
	private RetailAccountPageCapstone accountPageCapstone;	
	private RetailOrderPageCapstone orderPageCapstone;


	public POMFactoryCapstone() {
		this.HomePageCapstone = new RetailHomePageCapstone();
		this.signInPageCapstone = new RetailSignInPageCapstone();
		this.accountPageCapstone = new RetailAccountPageCapstone();
		this.orderPageCapstone = new RetailOrderPageCapstone();
		
	}

	
	
	
	
	
	public RetailHomePageCapstone HomePageCapstone() {
		return this.HomePageCapstone;

	}

	public RetailSignInPageCapstone signInPageCapstone() {
		return this.signInPageCapstone;
		
	}
	
	public RetailAccountPageCapstone accountPageCapstone() {
		return this.accountPageCapstone;
	}

    public RetailOrderPageCapstone orderPageCapstone() {
    	return this.orderPageCapstone;
    }




	 





}

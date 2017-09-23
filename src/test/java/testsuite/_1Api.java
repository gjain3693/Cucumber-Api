package testsuite;

import java.util.List;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.api.ProductsApi;
import io.swagger.client.model.Product;

public class _1Api {
	
	
	ApiClient apiClient=new ApiClient();
	
	ProductsApi productsApi=new ProductsApi(apiClient);
	
	@Given("^we have valid url \"([^\"]*)\"$")
	public void we_have_valid_url(String arg1) {
	    // Write code here that turns the phrase above into concrete actions
		
	    apiClient.setBasePath(arg1);
	}

	@When("^we enter latitude as \"([^\"]*)\" and longitude as \"([^\"]*)\"$")
	public void we_enter_latitude_as_and_longitude_as(String arg1, String arg2) {
	    // Write code here that turns the phrase above into concrete actions
	try {
	//	Double d1=Double.parseDouble(arg1);
		//Double d2=Double.parseDouble(arg2);
		
		//System.out.println("D1 and D2::"+d1+ " "+ d2);
		List<Product> response=productsApi.productsGet(15.0, 15.0);
		System.out.println("RESPONSE:::"+response.get(0));
	} catch(ApiException ape) {
		System.out.println(ape.getCode());
		System.out.println(ape.getMessage());
	}
	    
	}
	
	
	

	@Then("^location fetch sucessfully\\.$")
	public void location_fetch_sucessfully()  {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

}

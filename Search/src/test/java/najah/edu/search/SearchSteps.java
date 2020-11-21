package najah.edu.search;
import najah.edu.main.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.*;
import najah.edu.main.*;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class SearchSteps {
	private SearchApp search;
private String spec;
private Home h;
private int price;
private int area;
private Integer num_of_bedroom;
private int num_of_bathroom;
private Integer lease_length;
private String pets;
private String material;
private String petsc;
boolean r;
	boolean e;
	boolean cm;
	int count;

private String amenities;
private int lp;
private int hp;
private int la;
private int ha;

ArrayList<String> pricelist=new ArrayList<String>();
ArrayList<String> arealist=new ArrayList<String>();
ArrayList<String> typelist=new ArrayList<String>();
ArrayList<String> placementlist=new ArrayList<String>();
ArrayList<String> amenitieslist=new ArrayList<String>();
ArrayList<String> materiallist=new ArrayList<String>();
ArrayList<String> petslist=new ArrayList<String>();
ArrayList<String> numofbedroomslist=new ArrayList<String>();
ArrayList<String> numofbathroomslist=new ArrayList<String>();
ArrayList<String> leaseLengthlist=new ArrayList<String>();
ArrayList<String> combination=new ArrayList<String>();

String[] arraykey=null;
	String[] arrayamenties=null;
	String[] arrayvalue=null;
	Set<String> keys ;
	Collection<String> values; 
	String result ;
	Map<String,String> dataTable;




private Map<String,String> feature_search;
	public  SearchSteps(SearchApp search)  {
		this.search=search;	}
	
	@Given("these homes are contained in the system")
	public void these_homes_are_contained_in_the_system(Map<String,String> dataTable) {
		this.dataTable=dataTable;
			keys= dataTable.keySet();
			values= dataTable.values();
    for (String key : keys) {
	arraykey =key.split("_");
	
	typelist.add(arraykey[0]);
	materiallist.add(arraykey[1]);
	placementlist.add(arraykey[2]);
	petslist.add(arraykey[3]);
	amenitieslist.add(arraykey[4]);
	combination.add(arraykey[0]);
	combination.add(arraykey[2]);
	arrayamenties=arraykey[arraykey.length-1].split(",");
	for(int i=0 ; i<arrayamenties.length ;i++) {
	amenitieslist.add(arrayamenties[i]);
    }
	}
for (String value : values) {
	arrayvalue=value.split("_");
	pricelist.add(arrayvalue[0]);
	arealist.add(arrayvalue[1]);
	numofbedroomslist.add(arrayvalue[2]);
	numofbathroomslist.add(arrayvalue[3]);
	leaseLengthlist.add(arrayvalue[4]);
}

 


		}
		
	  

	@When("I search about home by {string}")
	public void i_search_about_home_by(String spec) {
		this.spec=spec;
		if(spec.equals(Hometype.APARTMENT.toString())||spec.equals(Hometype.HOUSE.toString())) {
			
		     for(String d:typelist) {
				if(spec.equals(d)) {count++;}	
				}
				
				result=search.byType(spec,count,keys,dataTable);}
		

	else if (spec.equals(Homematerial.BRICK.toString())||spec.equals(Homematerial.STONE.toString())||
			spec.equals(Homematerial.WOOD.toString())) {
		{
			
			for(String d:materiallist) {
			if(spec.equals(d)) {count++;}	
			}
	
			result=search.byMaterial(spec,count,keys,dataTable);}
	}
		

		
		else if (spec.equals(HomePlacement.CITY.toString())||spec.equals(HomePlacement.VILAGE.toString())) {
			
			for(String d:placementlist) {
						if(spec.equals(d)) {count++;}	
						}
						
						result=search.byPlacement(spec,count,keys,dataTable);}
				 
		
		else if(spec.equals(Homepets.YES.toString())||spec.equals(Homepets.NO.toString())) {
			
		     for(String d:petslist) {
						if(spec.equals(d)) {count++;}	
						}
						
						result=search. bypets(spec,count,keys,dataTable);
						 }
				//System.out.println(result);
				//System.out.println(result);
				 
			
			  
		}
		
		
	
	@Then("A list of homes that matches the  type specification should be returned and printed on the console")
	public void a_list_of_homes_that_matches_the_type_specification_should_be_returned_and_printed_on_the_console() {
	    // Write code here that turns the phrase above into concrete actions

		
	//assertEquals(result,spec);
		}

	@Then("A list of homes that matches the  placement specification should be returned and printed on the console")
	public void a_list_of_homes_that_matches_the_placement_specification_should_be_returned_and_printed_on_the_console() {
	    // Write code here that turns the phrase above into concrete actions
		//assertEquals(result,spec);
		}

	

	@Then("A list of homes that matches the  material specification should be returned and printed on the console")
	public void a_list_of_homes_that_matches_the_material_specification_should_be_returned_and_printed_on_the_console() {
	    // Write code here that turns the phrase above into concrete actions
//assertEquals(result,spec);
}
	
	@When("I search about home with price less than {int}")
	public void i_search_about_home_with_price_less_than(Integer price) {
	    // Write code here that turns the phrase above into concrete actions
this.price=price;
		count=0;
			for(String d:pricelist) {
				
			if((Integer.parseInt(d))<(price)) {count++;
			}	
			}
			
			r=search.bybellowprice(price,count,keys,values,dataTable);
			//System.out.print(r);
	
	
	
	}

	@Then("A list of homes that matches the price specification should be returned and printed on the console")
	public void a_list_of_homes_that_matches_the_price_specification_should_be_returned_and_printed_on_the_console() {
	    // Write code here that turns the phrase above into concrete actions

		String d=Boolean.toString(r);
			assertEquals("true", d);
			
	
	}

	@When("I search about home with area less than {int}")
	public void i_search_about_home_with_area_less_than(Integer area) {
	    // Write code here that turns the phrase above into concrete actions
		
	this.area=area;
		
			count=0;
		for(String d:arealist) {
			
		if((Integer.parseInt(d))<(area)) {count++;
		}	
		}
		
		r=search.bybellowarea(area,count,keys,values,dataTable);
		//System.out.print(r);
		
	
	
	
	}

	@Then("A list of homes that matches the area specification should be returned and printed on the console")
	public void a_list_of_homes_that_matches_the_area_specification_should_be_returned_and_printed_on_the_console() {
	    // Write code here that turns the phrase above into concrete actions

		
				
		String d=Boolean.toString(r);
			assertEquals("true", d);
			
			
		
	}

	

	

	@When("I search about home with price between {int} and {int}")
	public void i_search_about_home_with_price_between_and(Integer lp, Integer hp) {
	    // Write code here that turns the phrase above into concrete actions
this.lp=lp;
this.hp= hp;
//count=0;
			for(String d:pricelist) {
				
			if((Integer.parseInt(d))<(lp) && (Integer.parseInt(d))>(hp) ) {count++;
			}	
			}
			r=search.bybetweenprice(lp,hp,count,keys,values,dataTable);
			//System.out.print(r);
	
	}

		@Then("A list of homes that matches the  between  specific price should be returned and printed on the console")
		public void aListOfHomesThatMatchesTheBetweenSpecificPriceShouldBeReturnedAndPrintedOnTheConsole() {
			String d=Boolean.toString(r);
				assertEquals("true", d);
		}



	
	

	@When("I search about home with area between {int}  and {int}")
	public void i_search_about_home_with_area_between_and(Integer la, Integer ha) {
	    count=0;
			for(String d:arealist) {
				
			if((Integer.parseInt(d))<(la)&& (Integer.parseInt(d))>(ha)) {count++;
			}	
			}
			
			r=search.bybetweenarea(la,ha,keys,values,dataTable);
			//System.out.print(r);
		
			
	}

		@Then("A list of homes that matches the between specific area should be returned and printed on the console A list of homes that matches the area specification should be returned and printed on the console")
		public void aListOfHomesThatMatchesTheBetweenSpecificAreaShouldBeReturnedAndPrintedOnTheConsoleAListOfHomesThatMatchesTheAreaSpecificationShouldBeReturnedAndPrintedOnTheConsole() {
		    String d=Boolean.toString(r);
				assertEquals("true", d);
		}

	@When("I search about home by {int} bedrooms")
	public  void iSearchAboutHomeByBedrooms(Integer num_of_bedroom) {
	    // count=0;
				for(String d:numofbedroomslist) {
					
				if((Integer.parseInt(d))== num_of_bedroom) {count++;
				
				}
				
				}
				    
					r=search.bynumbedrooms(num_of_bedroom,count,keys,values,dataTable);
		
	}
	@Then("A list of homes that matches the  specific number of bedrooms should be returned and printed on the console")
	public void aListOfHomesThatMatchesTheSpecificNumberOfBedroomsShouldBeReturnedAndPrintedOnTheConsole() {
	    // Write code here that turns the phrase above into concrete actions
		 
		  String d=Boolean.toString(r);
				assertEquals("true", d);
		
	}

	@When("I search about home by {int} bathrooms")
	public void iSearchAboutHomeByBathrooms(Integer num_of_bathroom) {
	    count=0;
					for(String d:numofbathroomslist) {
						
					if((Integer.parseInt(d))== num_of_bathroom) {count++;
					
					}
					
					}
					    
						r=search. bynumbathroom(num_of_bathroom,count,keys,values,dataTable);
	}

	@Then("A list of homes that matches the  specific number of bathrooms should be returned and printed on the console")
	public void aListOfHomesThatMatchesTheSpecificNumberOfBathroomsShouldBeReturnedAndPrintedOnTheConsole() {
	     String d=Boolean.toString(r);
				assertEquals("true", d);
	}
	@When("I search about home with {string}")
	public void i_search_about_home_with(String amenities) {
	    // Write code here that turns the phrase above into concrete actions
		this.amenities=amenities;
		
	    // Write code  that turns the phrase above into concrete action
if(amenities.equals(Amenities.AIRCONDITIONING.toString())||amenities.equals(Amenities.BALCONY.toString())||amenities.equals(Amenities.ELEVATOR.toString())||
		amenities.equals(Amenities.FIREPLACE.toString())||
		amenities.equals(Amenities.GARAGEPARKING.toString())||amenities.equals(Amenities.SWIMMINGPOOL.toString())) {
	
			for(String d:amenitieslist) {
			if(amenities.equals(d)) {count++;}	
			}
		
		result=search.byamenities(amenities,  count, keys, values, dataTable);}
	
		 }

    // byamenities_list=search.byamenities(amenities);
	
	
	

	@Then("A list of homes that matches the Amenities  specification should be returned and printed on the console")
	public void a_list_of_homes_that_matches_the_amenities_specification_should_be_returned_and_printed_on_the_console() {
	    // Write code here that turns the phrase above into concrete actions
		//assertEquals(result,amenities);

	
	}
	


		@When("I search about home by lease_length {int}")
		public void iSearchAboutHomeByLeaseLength(Integer int1) {
		    count=0;
						for(String d:leaseLengthlist) {
							
						if((Integer.parseInt(d))== int1) {count++;
						
						}
						
						}
						    
							r=search.byleaseleng(int1,count,keys,values,dataTable);
						
					}

		
		


		@Then("A list of homes that matches the lease_length specification should be returned and printed on the console")
		public void aListOfHomesThatMatchesTheLeaseLengthSpecificationShouldBeReturnedAndPrintedOnTheConsole() {
		    // Write code here that turns the phrase above into concrete actions

			String d=Boolean.toString(r);
						assertEquals("true", d);
				}		

		@Then("A list of homes that matches the pets specification should be returned and printed on the console")
		public void aListOfHomesThatMatchesThePetsSpecificationShouldBeReturnedAndPrintedOnTheConsole() {
		    // Write code here that turns the phrase above into concrete actions
			//assertEquals(result,spec);	
			}


	    // Write code here that turns the phrase above into concrete actions

			@When("I search about home by {string} and {string}")
			public void iSearchAboutHomeByAnd(String string, String string2) {
			    // Write code here that turns the phrase above into concrete actions
				this.material=string;
				this.petsc=string2;
				if (material.equals(Homematerial.BRICK.toString())||material.equals(Homematerial.STONE.toString())||material.equals(Homematerial.WOOD.toString())&&petsc.equals(Homepets.YES.toString())||petsc.equals(Homepets.NO.toString())) {
					
					//bycombinationlist= search.bycombination(material, petsc);
				}

			}

			@Then("A list of homes that matches the type and specification should be returned and printed on the console")
			public void aListOfHomesThatMatchesTheTypeAndSpecificationShouldBeReturnedAndPrintedOnTheConsole() {
			    // Write code here that turns the phrase above into concrete actions
			//	System.out.println("A List of Home that Combination Between "+material +" and "+petsc +" :"+bycombinationlist);
				
			}
			}



		
	
	


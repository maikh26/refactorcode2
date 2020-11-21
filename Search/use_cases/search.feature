Feature: Search about suitable home
  
Background: The System has a repository of homes with their specifications (type-material-placement-pets-amenties-price-area-bedrooms-bathrooms-leaselength)
Given  these homes are contained in the system
                |HOUSE_WOOD_VILLAGE_NO_GARAGEPARKING,FIREPLACE,ELEVATOR|510_150_3_2_6|
                |APARTMENT_BRICK_CITY_NO_ELEVATOR|230_120_4_2_12|
               
  @bytype  
 Scenario: Search home by type
  When I search about home by "HOUSE"
  Then A list of homes that matches the  type specification should be returned and printed on the console
   
   @bypets
  Scenario: Search home by pets
  When I search about home by "yes"  
  Then A list of homes that matches the pets specification should be returned and printed on the console
  
 @byprice  
 Scenario: Search about home with less than a specific price
    When I search about home with price less than 300
    Then A list of homes that matches the price specification should be returned and printed on the console
   

@byarea  
  Scenario: Search about home with less than a specific  area
    When I search about home with area less than 200
    Then A list of homes that matches the area specification should be returned and printed on the console
   
@byplacement  
  Scenario: Search home by placement
  When I search about home by "CITY"
  Then A list of homes that matches the  placement specification should be returned and printed on the console
   @bymaterial  
  Scenario: Search home by material
  When I search about home by "WOOD"
  Then A list of homes that matches the  material specification should be returned and printed on the console
  
   @bypricebetween
  Scenario: Search home by price
  When I search about home with price between 500 and 300
  Then A list of homes that matches the  between  specific price should be returned and printed on the console
   
@byareabetween  
  Scenario: Search about home with less than a specific  area
    When I search about home with area between 150  and 100
    Then A list of homes that matches the between specific area should be returned and printed on the console A list of homes that matches the area specification should be returned and printed on the console
   
@bybedroom 
  Scenario: Search home by number of bedrooms
  When I search about home by 3 bedrooms
  Then A list of homes that matches the  specific number of bedrooms should be returned and printed on the console
  
  @bybathrooms 
  Scenario: Search home by number of bathrooms
  When I search about home by 2 bathrooms
  Then A list of homes that matches the  specific number of bathrooms should be returned and printed on the console
  
  @byplacement  
  Scenario: Search home by placement
  When I search about home by "VILLAGE"
  Then A list of homes that matches the  placement specification should be returned and printed on the console


 @byAmenities
  Scenario: Search home by Amenities
  When I search about home with "Swimming Pool"
  Then A list of homes that matches the Amenities  specification should be returned and printed on the console

 @bylease_length
  Scenario: Search home by lease_length
  When I search about home by lease_length 6 
  Then A list of homes that matches the lease_length specification should be returned and printed on the console
  
@bycombination
   Scenario: Search home by material and pets
  When I search about home by "WOOD" and "NO" 	
  Then A list of homes that matches the type and specification should be returned and printed on the console 
  







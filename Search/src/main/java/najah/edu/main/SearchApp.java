package najah.edu.main;





import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;



import java.util.Collection;
import java.util.List;


public class SearchApp {

	Logger l= Logger.getLogger(SearchApp.class.getName());

	
	String[] arrayofk;
	String[] arrayofv;
	
 

    
    public String byType(String type ,int count,Set<String> keys,Map<String,String> data ) {
      
			l.log(Level.INFO, "A List of Home  that matches the  type :{0} ",type);
			
			
			
			for(String k: keys) {
			
				arrayofk=k.split("_");
				if(arrayofk[0].equals( type)) {
					
					l.info(k);
					l.info(data.get(k));
						
				}
        
			}
        
		return type;
		}
	
    
	
    public String byMaterial(String material , int count, Set<String> keys, Map<String, String> dataTable) {
    	

 l.log(Level.INFO, "A List of Home  that matches the material {0} ",material);

for(String k: keys) {
	
	arrayofk=k.split("_");


	
		if(arrayofk[1].equals(material)) {
			
			l.info(k);
			l.info(dataTable.get(k));
				
		}

		
}

		
			
		return material;
	}



    
    public String byPlacement(String placement, int count, Set<String> keys, Map<String, String> dataTable) {
       
		l.log(Level.INFO, "A List of Home  that matches the  placment {0} ",placement);

		for(String k: keys) {
			
			arrayofk=k.split("_");

				if(arrayofk[2].equals(placement)) {
					
					l.info(k);
					l.info(dataTable.get(k));
					
						
				}
		}
			
		
		return placement;
	}
	
    public String bypets(String pets ,  int count, Set<String> keys, Map<String, String> dataTable) {
       
       l.log(Level.INFO, "A List of Home  that matches the pets {0}  ",pets);

for(String k: keys) {
	
	arrayofk=k.split("_");


	
		if(arrayofk[3].equals(pets)) {
			
			l.info(k);
			l.info(dataTable.get(k));
		}
}

		return pets;
	}

    	
	
	
	 
	 
	 public boolean bybellowarea(int area,int count, Set<String> keys, Collection<String> values, Map<String, String> dataTable){
			
		
		l.log(Level.INFO, "A List of Home  that matches the  area {0} ",area);

		for(String k: values) {
		
			arrayofv=k.split("_");
			

			
				if(Integer.parseInt(arrayofv[1])<area ) {
					
					for(String v: keys) {
						if(dataTable.get(v).equals(k))
							l.info(v);
						}
					
					l.log(Level.INFO, k);
						
						
				}

				
		}
		
		
		
		return true;
	

}

	
	 
	 public  boolean bybellowprice(int price ,int count, Set<String> keys, Collection<String> values, Map<String, String> dataTable){
	
		
		l.log(Level.INFO, "A List of Home  that matches the  price {0}  ",price);

		for(String k: values) {
		
			arrayofv=k.split("_");
			

			
				if(Integer.parseInt(arrayofv[0])<price) {
					
					for(String v: keys) {
						if(dataTable.get(v).equals(k))
							l.info(v);
						}
					l.log(Level.INFO,k);
					
						
						
				}

				
		}
		
		
		return true;
}	

		 
	 
	
	 public boolean bynumbedrooms(Integer numbedroom , int count, Set<String> keys, Collection<String> values, Map<String, String> dataTable) {
		 
	
		l.log(Level.INFO, "A List of Home  that matches the number of bedroom {0} ",numbedroom);

		for(String k: values) {
		
			arrayofv=k.split("_");
			

			
				if(Integer.parseInt(arrayofv[2])==numbedroom) {
					
					for(String v: keys) {
						if(dataTable.get(v).equals(k))
							l.info(v);
						}
					l.info(k);
						
						
				}

				
		}
		
	return true;
	}

	    
	 
	 
	 public boolean bynumbathroom(Integer numbathroom , int count, Set<String> keys, Collection<String> values, Map<String, String> dataTable){
		
		l.log(Level.INFO, "A List of Home  that matches the number of bathroom :{0} ",numbathroom);

		for(String k: values) {
		
			arrayofv=k.split("_");
			

			
				if(Integer.parseInt(arrayofv[3])==numbathroom) {
					
					for(String v: keys) {
						if(dataTable.get(v).equals(k))
							l.info(v);
						}
					l.log(Level.INFO, k);
					
						
						
				}

				
		}
		
		
			
		return true;
	}

	 public boolean byleaseleng(int leaseleng ,  int count, Set<String> keys, Collection<String> values, Map<String, String> dataTable){
		 
		
		l.log(Level.INFO, "A List of Home  that matches the leaselength :{0}  ",leaseleng);

		for(String k: values) {
		
			arrayofv=k.split("_");
			

			
				if(Integer.parseInt(arrayofv[4])==leaseleng) {
					
					for(String v: keys) {
						if(dataTable.get(v).equals(k))
							l.info(v);
						}
					l.log(Level.INFO,k);
						
						
				}

				
		}
			
			return true;
	}


		 
	 
	
	 public boolean bybetweenprice(int lp,int hp,  int count, Set<String> keys, Collection<String> values, Map<String, String> dataTable){
		 
		
		l.log(Level.INFO,"A List of Home  that the  price between :{0} and {1}", new Object[] {lp,hp});

		for(String k: values) {
		
			arrayofv=k.split("_");
			

			
				if(Integer.parseInt(arrayofv[0])<lp&& Integer.parseInt(arrayofv[0])>hp) {
					
					for(String v: keys) {
						if(dataTable.get(v).equals(k))
							l.info(v);
						}
					l.log(Level.INFO,k);
						
						
				}

				
		}
		
		
		
		return true;
	}
	 public boolean bybetweenarea(int la,int ha ,  Set<String> keys, Collection<String> values, Map<String, String> dataTable){
		
		
		l.log(Level.INFO,"A List of Home  that the  area between :{0} and {1}", new Object[] {la,ha});

		for(String k: values) {
		
			arrayofv=k.split("_");
			

			
				if(Integer.parseInt(arrayofv[1])<la&& Integer.parseInt(arrayofv[1])>ha) {
					
					for(String v: keys) {
						if(dataTable.get(v).equals(k))
							l.info(v);
						}
					l.log(Level.INFO,k);
						
						
				}

				
		}
		
		return true;
	}
	 @SuppressWarnings("unlikely-arg-type")
	public String byamenities(String amenities ,  int count, Set<String> keys, Collection<String> values, Map<String, String> dataTable){
		 
l.log(Level.INFO,"A List of Home  that the matches amenities :{0}",  amenities);


for(String k: keys) {
	
	arrayofk=k.split("_");
	

	String[] arrayofamenities = arrayofk[4].split(",");
	for(String h:arrayofamenities) {
		if(h.equals(amenities)) {
			l.info(k);
			l.info(dataTable.get(k));
				
				
		}

		
}}

		
		return amenities;
	}
		
	 
		public boolean bycombination(String string,String string2,Set<String> keys  , int count){
			 
	
	 
for (String key : keys) {
			arrayofk=key.split("_");
			if (string.equals(arrayofk[0]) && string2.equals(arrayofk[2])) {   
			
	            count--;
		}
			}

			
		return true;
	}

}







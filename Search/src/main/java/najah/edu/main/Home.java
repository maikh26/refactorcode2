package najah.edu.main;
public class Home {

private int area;
private int price;
private int numbedrooms;
private int numbathroom;
private int leaseleng;
 private HomePlacement placement;
 private Hometype type;
 private Homematerial material;
private java.util.List<Amenities> amenities;
 private Homepets pets;
 
 
public Homepets getpets() {
	 
	 
	return pets;
	 
 }
 
  void setpets(Homepets pets) {
		 this.pets=pets;
		 
	 }
 
  
 public int getleaseleng() {
	 return leaseleng;
 }
 void setleaseleng(int leaseleng) {
	 this.leaseleng=leaseleng;
	 
 }
 

public int getarea() {
		 return area;
	 }

  void setarea(int area) {
this.area=area; }
	 
public	int getprice() {
		 return price;
	 }
	
	void setprice(int price) {
		 this.price=price;
	 }
	
	
	
	void setnumbedrooms(int numbedrooms) {
		this.numbedrooms=numbedrooms;
	}
	
	public int getnumbedrooms() {
		 
		 return numbedrooms;
	 }
	void setnumbathrooms(int numbathrooms) {
		this. numbathroom=numbathrooms;
	}
	

	 
	 
public	 int getnumbathrooms() {
		 return numbathroom;
	 }
	 
	
	 
	 
	public Hometype gettype(){
		return type;
	}
	
	
void	 settype(Hometype type){
		this.type=type;
	}
	
	public  Homematerial getmaterial() {
		return material;
	}
	  void settmaterial(Homematerial material) {
this.material=material;		} 
	  
	  
	public HomePlacement getplacement() {
		return placement;
	}
	
	void setplacement(HomePlacement placement) {
this.placement=placement;
	}
	
	java.util.List<Amenities> getamenities() {
		return amenities;
		
	}

	
	
	 
	
 }
 
	


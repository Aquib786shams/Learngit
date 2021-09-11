public class Vehicle {
    protected int Licence_number;
    protected int speed;
    protected String color;
    protected String owner_name;
    public void setLicence(int n) {
    	Licence_number=n;
    }
    public void setspeed(int m) {
    	speed=m;
    }
    public void setcolor(String a) {
    	color=a;;
    }
    public void setowner(String b) {
    	owner_name=b;
    }
    public int getLicence() {
    	return (Licence_number);
    }
    public int getspeed() {
    	return (speed);
    }
    public String  getcolor() {
    	return (color);
    }
    public String getowner() {
    	return (owner_name);
    }
    public void showdata() {
    	System.out.println("This is a vehicle class");
    }
    public static void main(String[] args) {
    	Bus b1 = new Bus();
    	b1.setLicence(102);
    	b1.setspeed(80);
    	b1.setcolor("Red");
    	b1.setowner("Rahul");
    	b1.setroute(11);
    	b1.showdata();
    	Car c1=new Car();
	c1.setLicence(122);
    	c1.setspeed(90);
    	c1.setcolor("Yellow");
    	c1.setowner("Abhishek");
    	c1.setManu("Steve");
    	c1.showdata();
    }
}
class Bus extends Vehicle {
	private int route_no;
	public void setroute(int p) {
		route_no=p;
	}
	public int getroute() {
		return (route_no);
	}
	public void showdata() {
	super.showdata();
	System.out.println("Licence is "+Licence_number);
    	System.out.println("Speed is "+speed);
    	System.out.println("Color is "+color);
    	System.out.println("owner name is "+owner_name);
    	System.out.println("Route no is "+route_no);
	}
}
class Car extends Vehicle {
	private String Manufacturer_name;
	public void setManu( String k) {
		Manufacturer_name=k;
	}
	public String getManu() {
		return(Manufacturer_name);}
	public void showdata() {
	super.showdata();
	System.out.println("Licence is "+Licence_number);
    	System.out.println("Speed is "+speed);
    	System.out.println("Color is "+color);
    	System.out.println("Owner name is "+owner_name);
    	System.out.println("Manufacturer name no is "+Manufacturer_name);
	}
}



in dev branch
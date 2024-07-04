package kalyan;

import java.util.ArrayList;

public class Building {
	
    String name;
    String country;
    String city;
    int height;
    int builtYear;
    int rank;

    public Building(String name, String country, String city, int height, int builtYear, int rank) {
        this.name = name;
        this.country = country;
        this.city = city;
        this.height = height;
        this.builtYear = builtYear;
        this.rank = rank;
    }

    public static void main(String[] args) {
      ArrayList<Building> al=new  ArrayList<Building>();
      al.add(new Building("Burj Khalifa", "UAE", "Dubai", 829, 2010, 1));
      al.add(new Building("Clock Tower Hotel", "Saudi Arabia", "Mecca", 601, 2012, 2));
      al.add(new Building("Taipei 101", "Taiwan", "Taipei", 509, 2004, 3));
      al.add(new Building("Shanghai World Financial Center", "China", "Shanghai", 492, 2008, 4));
      
      
      
      for (Building b : al) {
		if (b.height>400) {
			System.out.println(b);
		}
	}
      
      
     
//      int h1=0;
//      int h2=0;
//      for (Building b : al) {
//		if (b.rank==1) {
//			h1=b.height;
//		}
//		else if (b.rank==4) {
//			h2=b.height;
//		}
//	}
//      System.out.println("Height difference is : "+(h1-h2));
}
    public String toString() {
    	return name+"\t"+country+"\t"+city+"\t"+height+"\t"+builtYear+"\t"+rank;
    }
}
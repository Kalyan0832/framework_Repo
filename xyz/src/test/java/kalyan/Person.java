package kalyan;
import java.util.ArrayList;

public class Person {
	String name;
    String position;
    String city;
    int amount;

   public Person(String name, String position, String city, int amount) {
       this.name = name;
       this.position = position;
       this.city = city;
       this.amount = amount;
   }
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Alex", "Engineer", "Chennai", 28));
        people.add(new Person("Ben", "Mechanic", "Bengaluru", 23));
        people.add(new Person("Dwayne", "Manager", "Kolkata", 48));
        people.add(new Person("Ivory", "Receptionist", "Chennai", 18));
        people.add(new Person("Jack", "Engineer", "Pune", 32));
        people.add(new Person("pavan", "Engineer", "chennai", 32));

        
        int engineersCount = 0;
        int chennaiResidentsCount = 0;

        for (Person person : people) {
            if (person.position.equalsIgnoreCase("Engineer")) {
                engineersCount++;
            }
            if (person.city.equalsIgnoreCase("Chennai")) {
                chennaiResidentsCount++;
            }
        }
        System.out.println("Number of Engineers: " + engineersCount);
        System.out.println("Number of residents in Chennai: " + chennaiResidentsCount);
    }
}
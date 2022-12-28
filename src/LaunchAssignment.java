import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Grandparent {
	/*Initialising variables*/
	Scanner scan = new Scanner(System.in);
	String name=null;
	String title=null;
	int age=0;
	private int identity=0;

	

	/*Storing variables information*/
	void store() {
		System.out.println("Please input the information below.");
		System.out.println("Please input the name.");
		name= scan.next();
		System.out.println("Please input the family member position (eg. Grandfather).");
		title= scan.next();
		System.out.println("Please input the age.");
		age= scan.nextInt();
	}

	/*Grandparent methods*/
	void eat() {
		System.out.println("The "+this.title+", "+this.name+" is eating dinner.");
	}
	void sleep() {
		System.out.println("The "+this.title+", "+this.name+" is sleeping.");
	}
	
	/*Getting private Identity number*/
	public void getIdentity() {
		System.out.println("The identity number is "+identity);
	}
	
	/*Setting private Identity number*/
	public void setIdentity() {
		int x;
		System.out.println("Please input the identity number");
		Scanner scan = new Scanner(System.in);
		x= scan.nextInt();
		this.identity = x;
	}
}

class Parent extends Grandparent {
	String titleInput="Father/Mother";
	
	/*Parent methods*/
	void work() {
		System.out.println("The "+this.title+", "+this.name+" is going to office.");
	}

	void exercise() {
		System.out.println("The "+this.title+", "+this.name+" is exercising.");
	}
}

class Children extends Parent {
	String titleInput="Son/Daughter";
	
	/*Children methods*/
	void school() {
		System.out.println("The "+this.title+", "+this.name+" is going to school.");
	}
}


class Family {
	 
		Scanner scan = new Scanner(System.in);
		
		/*Creating list to store Grandparent, Parent and Child information*/
		List<Grandparent> g = new ArrayList<Grandparent>();
		List<Parent> p = new ArrayList<Parent>();
		List<Children> c = new ArrayList<Children>();
		
	/*input information methods*/
	 void input () {
			char input = 0;
			System.out.println("Please state the Family member type you would like to store.");
			System.out.println("For Grandparent, type 'g'");
			System.out.println("For Parent, type 'p'");
			System.out.println("For Children, type 'c'");
			input = scan.next().charAt(0);
			
			/*storing name, title, age and identity number information method*/
			/*adding information into ArrayList*/
			if (input == 'g') {
				Grandparent a = new Grandparent();
				a.store();
				a.setIdentity();
				g.add(a);
			} else if (input == 'p') {
				Parent a = new Parent();
				a.store();
				a.setIdentity();
				p.add(a);
			} else if (input == 'c') {
				Children a = new Children();
				a.store();
				a.setIdentity();
				c.add(a);
			}	
	 }
	/*display information method*/
	 void display() {
			char input = 0;
			System.out.println("Please state the list of family member type you wish to display");
			System.out.println("For Grandparent, type 'g'");
			System.out.println("For Parent, type 'p'");
			System.out.println("For Children, type 'c'");
			input = scan.next().charAt(0);
			
			/*displaying name, title and age information method*/
			/*retrieving information from ArrayList. Displaying the information and action of each object*/
			if (input == 'g') {
			      for (int i = 0; i < g.size();i++) 
			      { 		      
			          System.out.println("-----------------------------------------"); 
			          System.out.println("Name:"+g.get(i).name); 
			          System.out.println("Title:"+g.get(i).title); 	
			          System.out.println("Age:"+g.get(i).age); 
			          System.out.println("-----------------------------------------"); 
					  System.out.println("Things the grandparent do:");
			          g.get(i).eat(); 
			          g.get(i).sleep(); 
			          System.out.println("-----------------------------------------"); 			  
			      }   
				
			} else if (input == 'p') {
			      for (int i = 0; i < p.size();i++) 
			      { 		      
			          System.out.println("-----------------------------------------"); 
			          System.out.println("Name:"+p.get(i).name); 
			          System.out.println("Title:"+p.get(i).title); 	
			          System.out.println("Age:"+p.get(i).age); 
			          System.out.println("-----------------------------------------"); 
					  System.out.println("Things the parent do:");
			          p.get(i).eat(); 
			          p.get(i).sleep(); 
			          p.get(i).work(); 
			          p.get(i).exercise(); 
			          System.out.println("-----------------------------------------"); 
			          
			      } 
			} else if (input == 'c') {
			      for (int i = 0; i < c.size();i++) 
			      { 		      
			          System.out.println("-----------------------------------------"); 
			          System.out.println("Name:"+c.get(i).name); 
			          System.out.println("Title:"+c.get(i).title); 	
			          System.out.println("Age:"+c.get(i).age); 	
			          System.out.println("-----------------------------------------"); 
					  System.out.println("Things the children do:");
			          c.get(i).eat(); 
			          c.get(i).sleep(); 
			          c.get(i).work(); 
			          c.get(i).exercise(); 
			          c.get(i).school(); 
			          System.out.println("-----------------------------------------"); 
			      } 
			}
	 }
 }


public class LaunchAssignment {
	static Family f = new Family();

	public static void main(String[] args) {
		

		/*setting boolean condition to exit the program*/
		boolean b = true;
		
		System.out.println("Welcome to Family Tree Storage System. Please state your agenda for today.");
		
		while (b) {
			System.out.println("To input new family members, press'i'");
			System.out.println("To display family members, press'd'");
			System.out.println("Press'e' to exit");

			/*Getting input from user for program execution */
			Scanner scan = new Scanner(System.in);
			char input = 0;
			input = scan.next().charAt(0);
		
			
			if (input == 'i') {
				f.input();
				System.out.println("Thank you, is there anything else you wish to do?");			
			} else if (input == 'd') {
				f.display();
				System.out.println("Thank you, is there anything else you wish to do?");
			} else if (input == 'e'){
				System.out.println("Thank you");
				b = false;
			}

		}			
	}

}

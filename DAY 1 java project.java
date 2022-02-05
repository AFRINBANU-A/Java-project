

//CAB FARE SYSTEM

import java.util.Scanner;
class Cab
{
    int fare;
    void showFare()
    {
        System.out.print("Fare Amount: " + fare);
    }
}
public class Main
{
	public static void main(String[] args) {
	    Cab id = new Cab();
	    Scanner sc = new Scanner(System.in);
	    int d;
		System.out.print("Enter the travel distance(in km) : ");
		d = sc.nextInt();
		id.fare = 12 * d;
		id.showFare();
	}
} 


// TAKING INPUT 

import java.util.Scanner;
class Test
{
    int x;
}
public class Main
{
    public static void main(String args[]){
        Test ob = new Test();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        ob.x= sc.nextInt();
        System.out.print("Data : " + ob.x);
    }
} 



// CONSTRUCTOR 
class Test
{
    static int x;
    int y;
}
public class Main
{
    public static void main(String args[]){
        Test ob1 = new Test();
        Test ob2 = new Test();
        ob1.x = 10;
        ob2.x = 20;
        ob1.y = 30;
        ob2.y = 40;
        System.out.print("Data : " + ob1.x + ob2.x + ob1.y + ob2.y);
    }
}


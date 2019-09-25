package day_1;
import java.util.*;

/*public class demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String w;
		System.out.println("Enter the day");
		w=sc.next();
		switch(w)
		{
		case "monday": System.out.println("day 1");
		break;
		case "tuesday":System.out.println("day 2");
		break;
		case "wednesday":System.out.println("day 3");
		break;
		case "thursday":System.out.println("day 4");
		break;
		case "friday":System.out.println("day 5");
		break;
		case "saturday":System.out.println("day 6");
		break;
		case "sunday":System.out.println("day 7");
		break;
		default:System.out.println("Enter proper value");
		}
		

	}

}*/
public class demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n,rev=0,rem;
		n=sc.nextInt();
		int nu=n;
		while(n>0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		System.out.println("reverse of "+nu+" is "+rev);
	}
}


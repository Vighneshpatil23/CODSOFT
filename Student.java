

import java.util.Scanner;

class Marks
{
	int phy,che,maths,bio,eng,tot;
	double Avgpercentage;
	

	void Acceptmarks()
	{
      Scanner sc =new Scanner(System.in);
      System.out.println("Enter Physics marks=");
      phy=sc.nextInt();
      System.out.println("Enter Chemistry marks=");
      che=sc.nextInt();
      System.out.println("Enter Maths marks=");
      maths=sc.nextInt();
      System.out.println("Enter Biology marks=");
      bio=sc.nextInt();
      System.out.println("Enter English marks=");
      eng=sc.nextInt();
      
	}
	void total()
	{
		tot=phy+che+maths+bio+eng;
		System.out.println("Total Marks="+tot);
	     
	}
	
	void avgper()
	
	{
		Avgpercentage=tot/5.0;
		System.out.println("Average Percentage="+Avgpercentage+"%");
		
	}
	
	void grade()
	{
		if(Avgpercentage>=90 && Avgpercentage<=100)
		{
			System.out.println("Grade=O");
		}
		if (Avgpercentage>=80 && Avgpercentage<90)
		{
			System.out.println("Grade=A");
		}
		if(Avgpercentage>=70 && Avgpercentage<80)
		{
			System.out.println("Grade=B");
		}
		if(Avgpercentage>=60 && Avgpercentage<70)
		{
			System.out.println("Grade=C");
		}
		if(Avgpercentage>=50 && Avgpercentage<60)
		{
			System.out.println("Grade=D");
		}
		if(Avgpercentage>=40 && Avgpercentage<50)
		{
			System.out.println("Grade=E");
		}
		if(Avgpercentage<40)
		{
			System.out.println("Student is Fail");
		}
		
	}
	
	
}
public class Student
 {

	public static void main(String[] args) 
	{
		Marks m=new Marks();
		m.Acceptmarks();
		m.total();
		m.avgper();
        m.grade();
	}

}
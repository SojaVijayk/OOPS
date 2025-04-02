import java.util.Scanner;
class Employee
{
	int eNo,eSalary;
	String eName;
	Employee(int eno,int esalary,String ename)
	{
	eNo=eno;
	eSalary=esalary;
	eName=ename;
	}
	void display()
	{
	System.out.println("\n Employee No:"+eNo);
	System.out.println("\n Employee Name:"+eName);
	System.out.println("\n Employee Salary:"+eSalary);
	}
	}
class Employe
{
public static void main(String args[])
{
	int n,i,result=1,eno,esal,enumber;
	String ename;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of employees:");
	n=sc.nextInt();
	Employee Obj[]=new Employee[n];
	for(i=0;i<n;i++)
	{
	System.out.println("Enter Employee No:");
	eno=sc.nextInt();
	System.out.println("Enter Employee Name:");
	ename=sc.next();
	System.out.println("Enter Employee Salary:");
	esal=sc.nextInt();
	Obj[i]=new Employee(eno,esal,ename);
	}
	System.out.println("\nEmployee Details:");
	for(i=0;i<n;i++)
	{
	Obj[i].display();
	}
	System.out.println("Enter the employee number to be searched:");
	enumber=sc.nextInt();
	for(i=0;i<n;i++)
	{
	if(Obj[i].eNo==enumber)
	{
	result=1;
	Obj[i].display();
	break;
	}
	else
	{
	result=0;
	}
	}
	if(result==0)
	{
	System.out.println("Not found");
	}
	}
	}
	
	
	
ksb@ksb-H410M-H-V2:~/SOJA/sojaoops$ javac Employe.java
ksb@ksb-H410M-H-V2:~/SOJA/sojaoops$ java Employe
Enter the number of employees:
2
Enter Employee No:
1
Enter Employee Name:
soja
Enter Employee Salary:
20000
Enter Employee No:
2
Enter Employee Name:
sreya
Enter Employee Salary:
30000

Employee Details:

 Employee No:1

 Employee Name:soja

 Employee Salary:20000

 Employee No:2

 Employee Name:sreya

 Employee Salary:30000
Enter the employee number to be searched:
1

 Employee No:1

 Employee Name:soja

 Employee Salary:20000
	

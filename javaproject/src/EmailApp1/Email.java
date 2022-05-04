package EmailApp1;

import java.util.Scanner;

public class Email 
{
	private String Firstname;
	private String Lastname;
	private String password;
	private String Department;
	private String email;
	private int mailboxCapacity=500;
	private int DefaultPasswordlenght=10;
	private String alternateemail;
	private String companysuffix="abcdcompany.com";
	
	public Email(String Firstname,String Lastname)
	{
		this.Firstname=Firstname;
		this.Lastname=Lastname;
		System.out.println("EMAIL CREATED:"+this.Firstname+" "+this.Lastname);
	
	
	this.Department=setDepartment();
	System.out.println("Department:"+this.setDepartment());
	
	this.password=randomPassword(DefaultPasswordlenght);
	System.out.println("your password is:"+this.password);
	
	email=Firstname.toLowerCase()+" "+Lastname.toLowerCase()+" "+"@"+Department+" "+companysuffix;
	System.out.println("your email is:"+email);
	}
	
	

	private String setDepartment()
	{
		System.out.println("New works:"+Firstname+".Department codes \n1 for sales\n2 for developing\n3 for accounting\n0 for none\n enter Department code");
		Scanner sc=new Scanner(System.in);
		int depChoice=sc.nextInt();
		
		if(depChoice==1)
		{
			return "sales";
			
		}
		else if(depChoice==2)
		{
			return "dev";
		}
		else if(depChoice==3)
		{
			return "acct";
		}
		else
		{
			return "" ;
		}
	}
		
		private String randomPassword(int lenght)
		{
		
		String passwordset="abcdefghijklm1233";
		char[]password=new char[lenght];
		for(int i=0;i<lenght;i++)
		{
			int rand=(int)(Math.random()*passwordset.length());
			password[i]=passwordset.charAt(rand);
		}
		return new String(password);
	}
		
	public void setmailboxcapacity(int capacitty)
	{
		this.mailboxCapacity=capacitty;
	}
	public void setAlternateEmail(String AltEmail)
	{
	this.alternateemail=AltEmail;
	
	}
	public void changepassword(String password)
	{
		this.password=password;
	}
	public int getmailboxcapacity()
	{
		return mailboxCapacity;
	}
	public String getAlternateEmail()
	{
		return alternateemail;
		
	}
	public String password()
	{
		return password;
		
	}
	public String ShowInfo()
	{
		return "DISPLAYNAME"+Firstname+" "+Lastname+
				"COMPANY EMAIL:"+email+
				"MAILBOX CAPACITY:"+mailboxCapacity+"mb";
				
	}
	// TODO Auto-generated method stub
		

	
}

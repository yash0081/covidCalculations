package Covid;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CovidDecider {
String symptom1;
String symptom2;

//what percentage to add
double a=0;
//total percentage
double b=0;

//what percentage to add
double d=0;

//total percentage
double e=0;




	
	public CovidDecider() throws IOException {
	decision();
	}
	public void decision() throws IOException{
		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ir);
	System.out.println("**********************************************************");
	System.out.println("          Enter 0 for an adult covid calculator.");
	System.out.println("          Enter 1 for a child covid calculator.");
	System.out.println("                Enter 2 to exit program.");
	System.out.println("**********************************************************");
	int v=Integer.parseInt(br.readLine());
	if(v==0) {
		covidAdultCalculator();
	}else if(v==1) {
		childrenCovidCalculator();
	}else if(v==2) {
		System.out.println("********************************");
		System.out.println("Thank you for using our program.");
		System.out.println("********************************");
	}
	}
	
	
	public void covidAdultCalculator() throws IOException {
		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ir);
		System.out.println("************************************************");
		System.out.println("          We will list symptoms."); 
		System.out.println("          Enter 0 for you have them\n     Enter 1 for you don't have them.");
		System.out.println("************************************************");
		
		for(int i=1; i<=8; i++) {
			double c=b;
			
			switch(i) {
			case 1:
				
				symptom1="Sore Throat";
				a=31.2;
				break;
			case 2:
				symptom1="Fever";
				a=40.95;
				break;
			case 3:
				symptom1="Breathing problems";
				a=41.1;
				break;
			case 4:
				symptom1="Headache";
				a=42.6;
				break;
			case 5:
				symptom1="Muscle or joint pain";
				a=44.6;
				break;
			case 6:
				symptom1="Dry Cough";
				a=60.4;
				break;
			case 7:
				symptom1="Loss of smell";
				a=64.4;
				break;
			case 8:
				symptom1="Fatigue";
				a=68.3;
				break;
			}
			System.out.println(symptom1);
			
			int decider=Integer.parseInt(br.readLine());
			if(decider==0) {
				b+=((100-c)*a)/100;
				c=a;
			}	
		}
		System.out.println("**********************************************");
		System.out.println("You have a "+b+"% chance of having covid.");
		System.out.println("However, remember that symptoms may show up after 2 weeks of having the virus.");
		System.out.println("Even if you show no symptoms, there is still a chance you have the virus.");
		System.out.println();
		System.out.println("Enter 1 to go back to the menu");
		System.out.println("Enter 2 to end program.");
		System.out.println("**********************************************");
		int h=Integer.parseInt(br.readLine());
		if(h==1) {
			b=0;
			decision();
		}else if(h==2) {
			System.out.println("********************************");
			System.out.println("Thank you for using our program.");
			System.out.println("********************************");
		}
	}
	
	public void childrenCovidCalculator() throws IOException{
		double f=e;
		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ir);
		System.out.println("*************************************");
		System.out.println("We will list symptoms."); 
		System.out.println("Enter 0 for you have them\nEnter 1 for you don't have them.");
		System.out.println("*************************************");
		
		for(int k=1; k<=3;k++) {
			switch(k) {
			case 1:
				symptom2="Shortness of breath";
				d=13;
				break;
			case 2:
				symptom2="Dry cough";
				d=54;
				break;
			case 3:
				symptom2="Fever";
				d=56;
				break;
			}
			System.out.println(symptom2);
			int decider1=Integer.parseInt(br.readLine());
			if(decider1==0) {
				e+=((100-f)*d)/100;
				f=d;
			}
			
		}
		System.out.println("**********************************************");
		System.out.println("You have a "+e+"% chance of having covid.");
		System.out.println("However, remember that symptoms may show up after 2 weeks of having the virus.");
		System.out.println("Even if you show no symptoms, there is still a chance you have the virus.");
		System.out.println();
		System.out.println("Enter 1 to go back to the menu");
		System.out.println("Enter 2 to end program.");
		System.out.println("**********************************************");
		int g=Integer.parseInt(br.readLine());
		if(g==1) {
			e=0;
			decision();
		}else if(g==2) {
			System.out.println("********************************");
			System.out.println("Thank you for using our program.");
			System.out.println("********************************");
		}
		
	}
	
}

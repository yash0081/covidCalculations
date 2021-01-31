package Covid;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CovidGrowthSimulator {
	double y;

	public CovidGrowthSimulator() throws IOException{
		methodAll();
	}
	
	public void methodAll() throws IOException{
		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ir);
		boolean hello=false;
		while(!hello) {
		System.out.println("**********************************************************************");
		System.out.println("            Enter the number of covid cases in your state.");
		System.out.println("             If you want to exit the program, enter 0");
		System.out.println("**********************************************************************");
		double x=Integer.parseInt(br.readLine());
		if(x==0) {
			System.out.println("********************************");
			System.out.println("Thank you for using our program.");
			System.out.println("********************************");
			hello=true;
		}else {
		
		
		
		System.out.println("**********************************************************************");
		System.out.println("  Enter the number of days(integer) in the future to see the cases.");
		System.out.println("      We will output the estimated number of deaths and cases.");
		System.out.println("**********************************************************************");
		double j=Integer.parseInt(br.readLine());
		
		
		double cases=Math.round(Math.pow(1.05, j)*420)+x;
		double deaths=Math.floor((3.4/100)*cases);
		System.out.println("**********************************************************************");
		System.out.println("        The estimated number of cases in "+j+" days is: "+cases);
		System.out.println("       The estimated number of deaths in "+j+" days is: "+deaths);
		System.out.println("**********************************************************************");
		
		}
		
		
		
	}
	
}
}
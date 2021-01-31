package Covid;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		ArrayList<CovidDecider> a=new ArrayList<CovidDecider>();
		ArrayList<CovidGrowthSimulator> b=new ArrayList<CovidGrowthSimulator>();
		ArrayList<Positivity> c=new ArrayList<Positivity>();
		
		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ir);
		
		System.out.println("******************************************************");
		System.out.println("                 Enter the following.");
		System.out.println("     Enter 1 to use our covid symptom calculator.");
		System.out.println("     Enter 2 to use our covid growth calculator.");
		System.out.println("       Enter 3 to use our positivity feature.");
		System.out.println("******************************************************");
int l=Integer.parseInt(br.readLine());
switch(l) {
case 1:
	CovidDecider a1=new CovidDecider();
	break;
case 2:
	CovidGrowthSimulator b1=new CovidGrowthSimulator();
	break;
case 3:
	Positivity c1=new Positivity();
	break;
	
}
		
		
		
		
		
}
	

}

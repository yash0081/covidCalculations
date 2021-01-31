package Covid;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;



public class Positivity {

	String statement;
	
	public Positivity() throws IOException, InterruptedException{
		positive();
	}
	public void positive() throws IOException, InterruptedException{
		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ir);
		System.out.println("**********************************************************");
		System.out.println("    Enter how many cycles of statements you want.");
		System.out.println("**********************************************************");
		int n=Integer.parseInt(br.readLine());
		System.out.println("**********************************************************");
		System.out.println("        Enter how many seconds of delay you want.");
		System.out.println("**********************************************************");
		int u=Integer.parseInt(br.readLine());
		int j=1000*u;
		
		
		for(int i=0; i<n; i++) {
		int randNum=(int)(Math.random()*8)+1;
		String firstStatement="Just try your best. I'm sure you'll do great";
		String secondStatement="You're smart, strong, and amazing. You just don't know it yet";
		String thirdStatement="You matter.";
        String fourthStatement="Have a positive attitude. With that, your an unstoppable force.";	
        String fifthStatement="Just believe in yourself.";
        String sixthStatement="Remember, never give up. You always have a chance.";
        String seventhStatement="You are so cool!";
        String eightStatement="Nobody can stop you today!";
		switch(randNum) {
		case 1:
			statement=firstStatement;
			break;
		case 2:
			statement=secondStatement;
			break;
		case 3:
			statement=thirdStatement;
			break;
		case 4:
			statement=fourthStatement;
			break;
		case 5:
			statement=fifthStatement;
			break;
		case 6:
			statement=sixthStatement;
			break;
		case 7:
			statement=seventhStatement;
			break;
		case 8:
			statement=eightStatement;
			break;
		}
		
		System.out.println(statement);
		
		
		Thread.sleep(j);
		
       
	}
	
}
}
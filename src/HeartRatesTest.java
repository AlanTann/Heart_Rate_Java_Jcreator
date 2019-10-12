import java.util.Scanner;

public class HeartRatesTest {
    
    public static void main(String[] args) {
    	
    	String FirstName;
		String LastName;
		int BirthMonth;
		int BirthDay;
		int BirthYear;
		
		Scanner input = new Scanner( System.in );
    	
    	System.out.printf("Enter First Name: ");
    	FirstName = input.nextLine();
    	System.out.printf("Enter Last Name: ");
    	LastName = input.nextLine();
    	System.out.printf("Date of Birth\n ");
    	System.out.printf("i)Day: ");
    	BirthDay = input.nextInt();
    	System.out.printf("ii)Month: ");
    	BirthMonth = input.nextInt();
    	System.out.printf("iii) Year:");
    	BirthYear = input.nextInt();
    	
    	HeartRates HeartRates1 = new HeartRates(FirstName, LastName, BirthDay, BirthMonth, BirthYear);
        
        
    	System.out.printf("\nFirst Name: %s", HeartRates1.getFirstName());
    	System.out.printf("\nLast Name: %s", HeartRates1.getLastName());
    	System.out.printf("\nDate of birth(dd/mm/yy): %d-%d-%d",HeartRates1.getDay(),HeartRates1.getMonth(), HeartRates1.getYear());
    	System.out.printf("\nAge: %d(2014)", HeartRates1.CalcAge());
    	System.out.printf("\nMaximum Heart rate: %d", HeartRates1.CalcMaxHRate());
    	System.out.printf("\nTarget heart rate range: %.2f-%.2f", HeartRates1.TarMinHRange(),HeartRates1.TarMaxHRange());    
    }
}

public class HeartRates {
	
	private String fName;
	private String lName;
	private int month;
	private int day;
	private int year;
    
    public HeartRates(String FirstName,String LastName,int BirthDay,int BirthMonth,int BirthYear){
    	fName = FirstName;
    	lName = LastName;
    	day = BirthDay;
    	month = BirthMonth;
    	year = BirthYear;
    }
    
    public void setFirstName(String FirstName){
    	fName = FirstName;
    }
    
    public void setLastName(String LastName){
    	lName = LastName;
    }
    
    public void setDay(int BirthDay){
    	day = BirthDay;
    }
    
    public void setMonth(int BirthMonth){
    	month = BirthMonth;
    }
    
    public void setYear(int BirthYear){
    	year = BirthYear;
    }
    
    public String getFirstName(){
    	return fName;
    }
    
    public String getLastName(){
    	return lName;
    }
    
    public int getDay(){
    	return day;
    }
    
    public int getMonth(){
    	return month;
    }
    
    public int getYear(){
    	return year;
    }
    
    public int CalcAge(){
    	int age;
    	
    	age = 2014 - year;
    	
    	return age;
    }
    
    public int CalcMaxHRate(){
    	int age;
    	int MaxHRate;
    	
    	age = CalcAge();
    	
    	MaxHRate = 220 - age;
    	
    	return MaxHRate;
    }
    
    public double TarMinHRange(){
    	int MaxHRate;
    	double MinHRange;
    	
    	MaxHRate = CalcMaxHRate();
    	
    	MinHRange = MaxHRate * 0.50;
    	
    	return MinHRange;
    }
    
    public double TarMaxHRange(){
    	int MaxHRate;
    	double MaxHRange;
    	
    	MaxHRate = CalcMaxHRate();
    	
    	MaxHRange = MaxHRate * 0.85;
    	
    	return MaxHRange;
    }
}
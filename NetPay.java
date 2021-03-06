
import java.util.Scanner;
public class NetPay {

	private static double sOCIAL_SECURITY_PERCENT;
	private static double sTATE_TAX_PERCENT;
	private static double mEDICARE_PERCENT;
	private static double pAY_PER_HOUR;
	private static double fEDERAL_TAX_PERCENT;

	public static void main(String[] args) {
	

	Scanner scanner = new Scanner(System.in);
	
	fEDERAL_TAX_PERCENT = 10.00; 
	sTATE_TAX_PERCENT = 4.5; 
	sOCIAL_SECURITY_PERCENT = 6.2;
	mEDICARE_PERCENT = 1.45;
	pAY_PER_HOUR = 7.25;
	int HoursPerWeek; 
	
	System.out.println("Enter the number of hours per week:");
	HoursPerWeek = scanner.nextInt();
	
    double GrossPay = HoursPerWeek * pAY_PER_HOUR; 
    
    double federalDeduction = (GrossPay * fEDERAL_TAX_PERCENT ) / 100;
    double stateDeduction = (GrossPay * sTATE_TAX_PERCENT) / 100;
    double medicareDeduction = (GrossPay *  mEDICARE_PERCENT ) /100;
    double socialSecurityDeduction = (GrossPay * sOCIAL_SECURITY_PERCENT) / 100; 
    double net_pay = (GrossPay) - (federalDeduction + stateDeduction + medicareDeduction +  socialSecurityDeduction);
    
    System.out.println("Hours Per Week:\t" + HoursPerWeek);
    System.out.println("Gross Pay:\t" + GrossPay );
    System.out.println("Net Pay:\t " + net_pay );		  
    
    System.out.println("Federal:\t" + federalDeduction);
    System.out.println("State:\t" + stateDeduction);
    System.out.println("Medicare:\t" + medicareDeduction);
    System.out.println("Social Security:\t" + socialSecurityDeduction);
    
    
    
    
    
    

	
	
	}

}

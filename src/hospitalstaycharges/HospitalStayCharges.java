/*
 * write a program that computes and displays the total charges for our patient 
 * in a hospital stay. The patient might be admitted overnight. For an overnight
 * stay, you're going to ask the user for the hospital overnight charges, as 
 * well as medication charges and lab service charges.
 * If it's not an overnight stay, then you're just going to have medication 
 * charges and lab service charges. You're going to calculate the charges, print 
 * the final total, then ask the user if they want to calculate the charges for 
 * another patient.
 */
package hospitalstaycharges;
import java.util.Scanner;

/**
 *
 * @author ahdieh
 */
public class HospitalStayCharges {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                
        do{
            double overnightCharge = 0 , medicationCharge = 0, serviceCharge = 0;
            if(CheckOvernightStay()) overnightCharge = GetOvernightCharge();

            medicationCharge = GetMedicationCharge();
            serviceCharge = GetServiceCharge();
            PrintTotalCharge(overnightCharge, medicationCharge, serviceCharge);
        }while(CheckNextPatient());
    }
    
    public static boolean CheckOvernightStay(){
        Scanner in = new Scanner(System.in);
        System.out.print("Did you stay overnight? (y/n) ");
        String x = in.next();
        if (x.equalsIgnoreCase("y")){ return true;}
        else return false;
    }
    public static double GetOvernightCharge(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the overnight charge: ");
        return in.nextDouble();       
    }
    public static double GetMedicationCharge(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Medication charge: ");
        return in.nextDouble();       
    }
    public static double GetServiceCharge(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Service charge: ");
        return in.nextDouble();       
    }
    public static void PrintTotalCharge(double overnight, double medication, 
            double service){
        System.out.printf("The total charge of youe hospital stay is: $%5.2f", 
                (overnight + medication + service));
        System.out.println();
    }
    public static boolean CheckNextPatient(){
        Scanner in = new Scanner(System.in);
        System.out.print("Would you like to calculate another patient's hospital"
                + " charge? (y/n) ");
        if(in.next().equalsIgnoreCase("y")) return true;
        else return false;
    } 
}

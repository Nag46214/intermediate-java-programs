import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class javaSprint03 {

    static String customerDetails[][]=new String[5][3];
    public static String [] getCustomerName(String cname)
    {
        customerDetails[0][0]="1001";
        customerDetails[0][1]="Raj";
        customerDetails[0][2]="Chennai";

        customerDetails[1][0]="1008";
        customerDetails[1][1]="Akshay";
        customerDetails[1][2]="Pune";

        customerDetails[2][0]="1002";
        customerDetails[2][1]="Simrath";
        customerDetails[2][2]="Amristar";

        customerDetails[3][0]="1204";
        customerDetails[3][1]="Gaurav";
        customerDetails[3][2]="Delhi";

        customerDetails[4][0]="1005";
        customerDetails[4][1]="Ganesh";
        customerDetails[4][2]="Chennai";

        for(String [] custName:customerDetails)
        {
            if(custName[1].equals(cname))
                return custName;
        }
        for(String [] custName:customerDetails)
        {
            if(!Objects.equals(custName[1], cname))
            {
                System.out.println("No Record Found");
                break;
            }
        }
        return new String[]{" "};
    }
    public static void main(String args[] ) throws Exception
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        String cname = sc.nextLine();
        String []newCustomerArray = getCustomerName(cname);
        for(String element:newCustomerArray)
        {
            System.out.println(element);
        }
    }
}

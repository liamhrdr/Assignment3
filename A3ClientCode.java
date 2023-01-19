import java.util.Scanner;
import javax.swing.*;
import java.io.*;
import java.text.NumberFormat;

/** ***************************************************
 *  Name:           Liam
 *  Class:          CS30S
 * 
 *  Assignment:     A3 Q2
 * 
 *  Description:    Program to input/format employee data
 * 
 *************************************************************/

public class A3ClientCode {

    public static void main(String[] args) throws IOException{
    // ***** constants *******
    
    // ***** variables *****
    
        String banner = "";             // output banner
        String prompt = "";             // prompt for user input
        
        String strin = "";              // string fro keyboard input
        String strout = "";             // string for formatted output
        
        String delim = "[ ]+";          // delimiter for splitting input records
        String[] tokens = null;         // used to split input records
        
        // a new line character that works on every computer system
        String nl = System.lineSeparator();
    
    // ***** objects *****
        ProgramInfo pInfo = new ProgramInfo("A3 Q1");
        //Scanner scanner = new Scanner(System.in);
        //NumberFormat currency = NumberFormat.getCurrencyInstance();
        
        // file io buffers for reading and writing to text files
        
        //BufferedReader fin = new BufferedReader(new FileReader("filename.txt"));
        //PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("outfle.txt")));
    
    // ***** print banners *****
        
        System.out.println(pInfo.getBanner());
        //fout.print(banner);
    
    // ***** Get Input *****
    
    // ***** Main Processing *****
    
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee(40, 13.5);
        Employee e4 = new Employee(55, 15);
    
        e1.setHours(22);
        e1.setWage(19.3);
        e2.setHours(60);
        e2.setWage(16.20);
    
    // ***** Print Formatted Output *****
    
        System.out.format("%s%12s%6s%10s%9s%11s%s", "ID", "Hours", "Wage", "Pay", "OT", "Gross", nl);
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println(e4);
    // ***** Closing Message *****
    
        System.out.println();
        System.out.println(pInfo.getClosingMessage());
        //fout.println("End of Processing");
        
    // **** close io buffers *****
    
        //fin.close();
        //fout.close();
    } // end main 
    
} // end FormatTemplate
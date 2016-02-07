package algorithms.warmup;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Solution6 {

	public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);
        String time = in.next();
        
        SimpleDateFormat display = new SimpleDateFormat("HH:mm");
        SimpleDateFormat imput = new SimpleDateFormat("hh:mm a");
        
        System.out.println("Entered time: "+time);
        Date date = imput.parse(time);
        //Date date1 = imput.parse("10:30 PM");
        
        System.out.println(display.format(date));
        //System.out.println(display.format(date1));
    }

}

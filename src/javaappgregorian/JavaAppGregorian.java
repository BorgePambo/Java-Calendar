package javaappgregorian;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class JavaAppGregorian {

    
    public static void main(String[] args) {
        
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy hh:MM:ss");
        
        
        Calendar data = new GregorianCalendar(2020, 5, 10, 10,30, 20);
        
        
        System.out.println(sdf.format(data.getTime()));
    }
    
}

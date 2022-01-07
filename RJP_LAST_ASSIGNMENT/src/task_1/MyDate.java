package task_1;
import java.util.Calendar;
import java.util.Date;
import java.util.StringTokenizer;

public class MyDate implements Comparable<MyDate>,Cloneable
{
   int day,month,year;
  
   public MyDate() 
   {
       Date date=new Date();
       day=date.getDay();
       month=date.getMonth();
       year=date.getYear();
   }
  
   public MyDate(String string)
   {
       StringTokenizer str=new StringTokenizer(string,"/");
       day=Integer.parseInt(str.nextToken());
       month=Integer.parseInt(str.nextToken());
       year=Integer.parseInt(str.nextToken());
   }
   public MyDate(Calendar cal)
   {
       day=cal.get(Calendar.DAY_OF_WEEK);
       month=cal.get(Calendar.MONTH);
       year=cal.get(Calendar.YEAR);
   }
   public boolean setDate(int day,int month,int year) 
   {
       this.day=day;
       this.month=month;
       this.year=year;
       return true;
   }
   public MyDate getDate()
   {
       return new MyDate(day+"/"+month+"/"+year);
   }
   public int difference(MyDate date)
   {
       return this.day-date.day;
   }
   @Override
   public int compareTo(MyDate date)
   {
       if(this.day>date.day)
           return 1;
       else if(this.day<date.day)
           return 2;
       else
       return 3;
   }
   @Override
   public Object clone() 
   {
       try
       {
           return super.clone(); 
       }
       catch(CloneNotSupportedException e)
       {
           System.out.println("exception is thrown.");
       }
       return null;
   }
   @Override
   public String toString() 
   {
       return day+"/"+month+"/"+year;
   }
 
   
   public static void main(String[] args)
   {
       MyDate x=new MyDate(); 
       Calendar c=Calendar.getInstance();
       c.set(2008,07,22);
       MyDate y=new MyDate(c);
       MyDate z=new MyDate("27/08/2005");
      
       x.setDate(20,01,2010); 
       System.out.println("Date : "+x.getDate());
      
       System.out.println("Date1: "+x.toString()); 
       System.out.println("Date2: "+y.toString());
       System.out.println("Date3: "+z.toString());
      
       MyDate d=(MyDate) x.clone(); 
       System.out.println("Copied object:"+d.toString());
      
       System.out.println("Difference between date:"+x.difference(z));
      
       System.out.println("Compare dates:");   
       int i=x.compareTo(y);
       if(i==1)
           System.out.println("Date1 is greater than date2");
       else if(i==2)
           System.out.println("\nDate1 is less than date2");
       else
           System.out.println("\nDates are equal");
   }
}
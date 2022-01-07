//Name: Fahmida Akhter Nourin
//Id  : 2031741642
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
    MyDate date1=new MyDate(); 
    Calendar calender=Calendar.getInstance();
    calender.set(2016,05,11);
    MyDate date2=new MyDate(calender);
    MyDate date3=new MyDate("29/09/2011");
    
    date1.setDate(17,05,2020); 
    System.out.println("Date : "+date1.getDate());
    
    System.out.println("Date1: "+date1.toString()); 
    System.out.println("Date2: "+date2.toString());
    System.out.println("Date3: "+date3.toString());
    
    MyDate d=(MyDate) date1.clone(); 
    System.out.println("Copied object:"+d.toString());
    System.out.println("Difference between date:"+date1.difference(date3));
    System.out.println("Comparing dates:");
    int com=date1.compareTo(date2);
    
    if(com==1) {
        System.out.println("Date1 is greater than Date2");
    }
    else if(com==2)
    {
        System.out.println("\nDate1 is less than Date2");
    }
    else {
        System.out.println("\nDates are equal");
    }
}
}
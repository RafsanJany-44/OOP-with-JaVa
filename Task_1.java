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
    StringTokenizer s=new StringTokenizer(string,"/");
    day=Integer.parseInt(s.nextToken());
    month=Integer.parseInt(s.nextToken());
    year=Integer.parseInt(s.nextToken());
}
public MyDate(Calendar calender)
{
    day=dt.get(Calendar.DAY_OF_WEEK);
    month=dt.get(Calendar.MONTH);
    year=dt.get(Calendar.YEAR);
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
public int difference(MyDate d)
{
    int temp=this.day-d.day;
    return temp;
}
@Override
public int compareTo(MyDate d)
{
    if(this.day>d.day)
        return 1;
    else if(this.day<d.day)
        return -1;
    else
    return 0;
}
public Object clone()
{
    try
    {
        return super.clone();
    }
    catch(CloneNotSupportedException e)
    {
        System.out.println("Clone not supported.");
    }
    return null;
}
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
    System.out.println("Date is:"+x.getDate());

    System.out.println("Date1: "+x.toString());
    System.out.println("Date2: "+y.toString());
    System.out.println("Date3: "+z.toString());

    MyDate d=(MyDate) x.clone();
    System.out.println("Copy of object:"+d.toString());

    System.out.println("Difference between date:"+x.difference(z));

    System.out.println("Compare dates:");   
    int i=x.compareTo(y);
    if(i==1)
        System.out.println("Date1 is greater than date2");
    else if(i==-1)
        System.out.println("\nDate1 is less than date2");
    else
        System.out.println("\nDates are equal");
}
}

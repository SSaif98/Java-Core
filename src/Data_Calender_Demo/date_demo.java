package Data_Calender_Demo;

import java.text.SimpleDateFormat;
import java.util.*;

public class date_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Current Date and Current Time
		
		Date d= new Date();
		 
		System.out.println(d.toString());
		
		System.out.println (d.getDate());

	
		SimpleDateFormat sdf= new SimpleDateFormat("M/d/YYYY hh:m:s E ");
		System.out.print(sdf.format(d));
		
	}

}

/*

Character	Description	Example
G	Era designator	AD
y	Year in four digits	2001
M	Month in year	July or 07
d	Day in month	10
h	Hour in A.M./P.M. (1~12)	12
H	Hour in day (0~23)	22
m	Minute in hour	30
s	Second in minute	55
S	Millisecond	234
E	Day in week	Tuesday
D	Day in year	360

*/
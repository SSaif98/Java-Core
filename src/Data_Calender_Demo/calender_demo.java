package Data_Calender_Demo;

import java.text.SimpleDateFormat;
import java.util.*;

public class calender_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar cal = Calendar.getInstance();

		SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy h:m:s");
		System.out.println(sdf.format(cal.getTime()));
		System.out.println(sdf.format(cal.get(Calendar.DAY_OF_MONTH)));
		System.out.println(sdf.format(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH)));



	}

}

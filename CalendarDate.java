
import java.util.Scanner;

public class CalendarDate {
	
	public static boolean leap(int inputYear) {
		 boolean l = false;

		    // if the year is divided by 4
		    if (inputYear % 4 == 0) {

		      // if the year is century
		      if (inputYear % 100 == 0) {

		        // if year is divided by 400
		        // then it is a leap year
		        if (inputYear % 400 == 0) {
		          return  true;
		        }
		        else {
		          return false;
		        }
		      }
		      
		      // if the year is not century
		      else {
		        return true;
		      }
		    }
		    
		    else {
		      return false;
		    }
	}
	
	public static void calDays(int di, int mi, int yi, int d0, int mo, int yo) {
		System.out.print(" No. of days = ");
		int dd = 0, mm = 0, yyyy=0;
		
		
int dmi=0 , pre=0, next=0;
		
		
		switch(mi) {
		
		case 01:
		     dmi+=31;
		     pre+=0;
		     if(leap(yi))
		     next+=31+30+31+30+31+31+30+31+30+31+28;
			
			break;
		case 02:
			if(leap(yi)) {
				dmi+=29;
			}
			else {
			 dmi+=28;
			}
			 pre+=31;
			 next+=31+30+31+30+31+31+30+31+30+31;
			break;
		case 03:
	        dmi+=31;
	        next+=31+30+31+30+31+31+30+31+30;
	        if(leap(yi)) {
	        	pre+=31+29;
	        }
	        else
	        pre+=31+28;
			break;
		case 04:
			dmi+=30;
			next+=31+30+31+30+31+31+30+31;
			if(leap(yi))
				pre+=31+29+31;
			else
			pre+=31+28+31;
			break;
		case 05:
			dmi+=31;
			next+=31+30+31+30+31+31+30;
			if(leap(yi))
				pre+=31+29+31+30;
				else
					pre+=31+28+31+30;
			break;
		case 06:
			dmi+=30;
			next+=31+30+31+30+31+31;
			if(leap(yi))
				pre+=31+29+31+30+31;
				else
					pre+=31+28+31+30+31;
			break;
		case 07:
			dmi+=31;
			next+=31+30+31+30+31;
			if(leap(yi))
				pre+=31+29+31+30+31+30;
				else
					pre+=31+28+31+30+31+30;
			break;
		case 010:
			dmi+=31;
			next+=31+30+31+30;
			if(leap(yi))
				pre+=31+29+31+30+31+30+31;
				else
					pre+=31+28+31+30+31+30+31;
			break;
		case 024:
			dmi+=30;
			next+=31+30+31;
			if(leap(yi))
				pre+=31+29+31+30+31+30+31+31;
				else
					pre+=31+28+31+30+31+30+31+31;
			break;
		case 10:
			dmi+=31;
			next+=31+30;
			if(leap(yi))
				pre+=31+29+31+30+31+30+31+31+30;
				else
				pre+=31+28+31+30+31+30+31+31+30;
			break;
		case 11:
			dmi+=30;
			next+=31;
			if(leap(yi))
				pre+=31+29+31+30+31+30+31+31+30+31;
				else
					pre+=31+28+31+30+31+30+31+31+30+31;
			break;
		case 12:
			dmi+=31;
			next+=0;
			if(leap(yi))
				pre+=31+29+31+30+31+30+31+31+30+31+30;
				else
				pre+=31+28+31+30+31+30+31+31+30+31+30;
			break;
		
		}
		//System.out.println(dmi);
		
		
int dmo=0 ,pre0=0;
		
		
		switch(mo) {
		
		case 01:
		     dmo+=31;
		     pre0+=0;
			
			break;
		case 02:
			if(leap(yo)) {
				dmo+=29;
			}
			else {
			 dmo+=28;
			}
			 pre0+=31;
			break;
		case 03:
	        dmo+=31;
	        if(leap(yo)) {
	        	pre0+=31+29;
	        }
	        else
	        pre0+=31+28;
			break;
		case 04:
			dmo+=30;
			if(leap(yo))
				pre0+=31+29+31;
			else
			pre0+=31+28+31;
			break;
		case 05:
			dmo+=31;
			if(leap(yo))
			pre0+=31+29+31+30;
			else
				pre0+=31+28+31+30;
			break;
		case 06:
			dmo+=30;
			if(leap(yo))
			pre0+=31+29+31+30+31;
			else
				pre0+=31+28+31+30+31;	
			break;
		case 07:
			dmo+=31;
			if(leap(yo))
			pre0+=31+29+31+30+31+30;
			else
				pre0+=31+28+31+30+31+30;
			break;
		case 010:
			dmo+=31;
			if(leap(yo))
			pre0+=31+29+31+30+31+30+31;
			else
				pre0+=31+28+31+30+31+30+31;
			break;
		case 024:
			dmo+=30;
			if(leap(yo))
			pre0+=31+29+31+30+31+30+31+31;
			else
				pre0+=31+28+31+30+31+30+31+31;
			break;
		case 10:
			dmo+=31;
			if(leap(yo))
			pre0+=31+29+31+30+31+30+31+31+30;
			else
			pre0+=31+28+31+30+31+30+31+31+30;
			break;
		case 11:
			dmo+=30;
			if(leap(yo))
			pre0+=31+29+31+30+31+30+31+31+30+31;
			else
				pre0+=31+28+31+30+31+30+31+31+30+31;	
			break;
		case 12:
			dmo+=31;
			if(leap(yo))
			pre0+=31+29+31+30+31+30+31+31+30+31+30;
			else
			pre0+=31+28+31+30+31+30+31+31+30+31+30;
			break;
		
		}
		//System.out.println(dmo);
	
		
		if(di==d0 && mi==mo && yi==yo) {
			System.out.println(" 1 day");
		}
		else if((di==d0 && mi==mo) && yi!=yo) {
			yyyy= Math.abs(yo-yi);
			if(yyyy==1) {
				System.out.println(yyyy+ " year");
			}
			else {
			System.out.println(yyyy+ " years");
			}
		}
		else if((di==d0 && yi==yo) && mi!=mo) {
			mm=Math.abs( mo-mi);
			if(mm==1) {
				System.out.println(mm+ " month");
			}
			else {
			System.out.println(mm+ " months");
			}
		}
		else if((mi==mo && yi==yo) && di!=d0) {
			dd= Math.abs(d0+ (dmi-di));
			if(dd==1) {
				System.out.println(dd+ " day");
			}
			else {
			System.out.println(dd+ " days");
			}
		}
		
		else if( yi!=yo) {
			dd= Math.abs(d0+ (dmi-di)); mm= Math.abs(mo-mi); yyyy=Math.abs( yo-yi);
			if(dd==1 && mm==1 && yyyy== 1) {
				System.out.println(dd+ " day "+mm+ " month "+yyyy+ " year" );
			}
			else if((dd==1 && mm==1) && yyyy!= 1 ) {
				System.out.println(dd+ " day "+mm+ " month "+yyyy+ " years" );
			}
			else if((yyyy==1 && mm==1) && dd!= 1 ) {
				System.out.println(dd+ " days "+mm+ " month "+yyyy+ " year" );
			}
			else if((yyyy==1 && dd==1) && mm!= 1 ) {
				System.out.println(dd+ " day "+mm+ " months "+yyyy+ " year" );
			}
			else {
			System.out.println(dd+ " days "+mm+ " months "+yyyy+ " years");
			}
		}
		else if(yi==yo) {
			dd=Math.abs(d0+ (dmi-di)); mm= Math.abs(mo-mi);
			if(mm==1 && dd==1) {
				System.out.println(dd+ " day "+mm+" month");
			}
			else if(mm==1 && dd!=1) {
				System.out.println(dd+ " days "+mm+" month");
			}
			else if (mm!=1 && dd==1) {
			System.out.println(dd+ " day "+mm+" months");
			}
			else {
				System.out.println(dd+ " days "+mm+" months");
			}
		}
		else {
			System.out.println("wrong in-valid dates , please enter valid dates");  // 09-11-2004   24-12-2006
		}

	//System.out.println(dmo);
		
	long sum=0;
	int dm=0;
	int yy=0;
	dm= Math.abs(dmi-di)+ next +d0 +pre0;
	
	yy+=dm;
	for (int i=yi+1; i<yo; i++){
		
		 if(leap(i)) {
			 
			yy+=366; 	
		 }
		 else {
		 yy+=365;
		 }
		
	}
		
	sum=yy;

		 System.out.println(sum+ " days ");
		
       
	}

	public static void main(String[] args) {
		
//       Calendar c= Calendar.getInstance();
//       System.out.println(c.getTime());
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter check-in date in dd-mm-yyy format");
		String checkIn = sc.nextLine();
		System.out.println("Enter check-out date in dd-mm-yyy format");
		String checkOut = sc.nextLine();
		
		
		
		int di =Integer.parseInt(checkIn.substring(0, 2));
		int mi =Integer.parseInt(checkIn.substring(3, 5));
		int yi=Integer.parseInt(checkIn.substring(6));
		
		int d0 =Integer.parseInt(checkOut.substring(0, 2));
		int mo =Integer.parseInt(checkOut.substring(3, 5));
		int yo=Integer.parseInt(checkOut.substring(6));
		
//		System.out.println("in "+di +" "+mi+" "+yi);
//		System.out.println("out "+d0 +" "+mo+" "+yo);
		
		if(di<0 || d0<0 || mi<0 || mo<0 || yi<0 || yo<0 ) {
			System.out.println("Dates cannot be in negative ");
		}
		else if((di<1 || di>31) || (d0<1 || d0>31)) {
			System.out.println("you have entered invalid day");
		}
		else if( (mi<1 || mi>12)|| (mo<1 || mo>12)) {
			System.out.println("Incorrect month, please check");
		}
		else if( yi<1000 || yi>=10000 || yo<1000 || yo>=10000) {
			System.out.println("Year should be 4 digits only");
		}
		else if( !((checkIn.substring(2,3)).equals("-")) || !((checkIn.substring(5,6)).equals("-")) || !((checkOut.substring(5,6)).equals("-")) || !((checkIn.substring(2,3)).equals("-"))) {
			System.out.println("please separate day , month and year by '-' ");
		}
		
		else if(yi>yo) {
			System.out.println("Check-in year cannot be greater than check-out's year ");
		}
		else {
			calDays(di,mi,yi,d0,mo,yo);
		}
		
		
		
       
       
	}

	

}

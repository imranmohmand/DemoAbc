package ClassAndObject;

public class AllMethodWithRetun {
	

int sum(int num1,int num2) {
	int c=num1+num2;
	return c;
}
int sub(int num1,int num2) {
	int sub=num1-num2;
	return sub;
}
int mult(int num1,int num2) {
	int mult=num1*num2;
	return mult;
}
int div(int num1,int num2) {
	int div=num1/num2;
	return div;
}
int findLargest(int num1,int num2) {
	int larger;
	if(num1>num2) {
		larger=num1;
	}else {
		larger=num2;
	}return larger;
}
//  method to return the number is odd
  boolean IsOdd(int num) {
	  boolean isOdd=true;
	  if(num%2==0) {
		  isOdd=false;
	  }else {
		  isOdd=true;
	  }
	  return isOdd;
	  
  }
  String WeekDayName(int WeekDay) {
	  String WeekDayName;
	  switch (WeekDay) {
	case 1:
		WeekDayName="Monday";
		break;
	case 2:
		WeekDayName="Tuesday";
		break;
	case 3:
		WeekDayName="Wednesday";
		break;
	case 4:
		WeekDayName="Thursday";
		break;
	case 5:
		WeekDayName="Friday";
		break;
	case 6:
		WeekDayName="Saturday";
		break;
	case 7:
		WeekDayName="Sunday";
		break;
		default:
			WeekDayName="Unknown";
		break;
	}
	  return WeekDayName;
	  
  }

	

}


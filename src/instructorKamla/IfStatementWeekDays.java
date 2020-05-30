package instructorKamla;

public class IfStatementWeekDays {

	public static void main(String[] args) {
		/*
		 *  Write a program to take a number and if it is 1 print - This is Monday
		 *  2- Print this is Tuesday
		 *  3- Print this is Wednesday
		 *  4- Print this is Thursday
		 *  5- print this is Friday
		 *  6- Print this is Saturday
		 *  7- Print this is Sunday
		 *   */
		
		String day1="Monday";
		String day2="Tuesday";
		String day3="Wednesday";
		String day4="Thursday";
		String day5="Friday";
		String day6="Saturday";
		String day7="Sunday";
		
		
		if(day1.equalsIgnoreCase("Monday")) {
			System.out.println("today is "+day1);
		}else {
			if(day2.equalsIgnoreCase("tuesday")) {
				System.out.println("today is "+day2);
			}else {
				if(day3.equalsIgnoreCase("Wednesday")) {
					System.out.println("today is "+day3);
				}else {
					if(day4.equalsIgnoreCase("Thursday")) {
						System.out.println("today is "+day4);
					}else {
						if(day5.equalsIgnoreCase("friday")) {
							System.out.println("today is "+day5);
						}else {
							if(day6.equalsIgnoreCase("Saturday")) {
								System.out.println("today is "+day6);
							}else {
								System.out.println("today is "+day7);
							}
						}
					}
				}
			}
		}

	}

}

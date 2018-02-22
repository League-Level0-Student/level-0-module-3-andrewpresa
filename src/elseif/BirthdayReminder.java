
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {
 {
		
	}

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "December 30th";
		String dadsBirthday = "September 5th";
		String myBirthday = "November 28th";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String Bday = JOptionPane.showInputDialog("What birthday do you want to know");
		// 3. Print out what the user typed
		if(Bday.equals ("mom"))
			System.out.println(momsBirthday);
		// 4. if user asked for "mom"
			//print mom's birthday
		else if(Bday.equals ("dad"))
			System.out.println(dadsBirthday);
		// 5. if user asked for "dad"
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		else if(Bday.equals ("my"))
			System.out.println(myBirthday);
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
		else {
			JOptionPane.showMessageDialog(null,"Sorry, i don't remember that person's birthday!");}
		}

	} 


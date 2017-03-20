/** This program will tell you what your major is as well as what year your in school.
    @Lauren L
    @3/17/17
    */




import java.util.Scanner;
public class Student{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter two character:");

		String s = input.next();
		input.close();
		String major = getMajor(s.charAt(0));
		String status = getSchoolYear(s.charAt(1));

		if (major == null status == null){
			System.out.println("Invaild input"){
				System.exit(0);
			}
			System.out.println(major + "" + status);
		}
		public static String getSchoolYear(charschoolYear){
			Switch(schoolYear){
				case '1': return "Freshman";
				case '2': return "Sophomore";
				case '3': return "Junior";
				case '4': return "Senior";
				default: return null;
			}
		}
		public static String getMajor(charmajor){
			major = Character.toUpperCase(major);
			Switch(major){
				case 'M':
				return "Mathmatics";
				case 'C':
				return "Computer Science";
				case 'I':
				return "Information Technology";
				default: return null;
			}
		}
	}
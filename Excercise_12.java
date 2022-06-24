package Week_1;

public class Excercise_12 {
	public static String translate(String input) {
		String[] string = input.split("/");
		int month = Integer.parseInt(string[1]);
		String thang="";
		String result="";
		switch (month) {
		case 1:
			thang = "January";
			break;
		case 2:
			thang = "February";
			break;
		case 3:
			thang = "March";
			break;
		case 4:
			thang = "April";
			break;
		case 5:
			thang = "May";
			break;
		case 6:
			thang = "June";
			break;
		case 7:
			thang = "July";
			break;
		case 8:
			thang = "August";
			break;
		case 9:
			thang = "September";
			break;
		case 10:
			thang = "October";
			break;
		case 11:
			thang = "November";
			break;
		case 12:
			thang = "December";
			break;
		default:
			result="Ban da nhap sai dinh dang ngay thang vui long nhap lai";
			return result;
		}
		result = string[0]+" "+thang+" "+string[2];
		return result;
	}
	public static void main(String[] args) {
		System.out.println(translate("21/06/2000"));
	}
}

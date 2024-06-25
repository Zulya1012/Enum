package enums;
public class Dispatcher {
	public static void main(String[] args) {
		Seasons[] s = Seasons.values();
		for (Seasons temp : s) {
			System.out.println(temp.temperature);
			temp.resort();
			switch (temp) {
			case SPRING: 
				System.out.println("Have a birthday");
				break;
			case WINTER: 
				System.out.println("Have a New Year");
				break;
			}
		}
	}
}

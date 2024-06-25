package enums;
public enum Seasons {
	SPRING(12), 
	SUMMER(23){
		void resort() {
			super.resort();
			System.out.println("Swim");
		}
	},
	AUTUMN(11), 
	WINTER(1){
		void resort() {
			super.resort();
				System.out.println("Ski");
		}
	};
	int temperature;
	Seasons(int temperature){
		this.temperature = temperature;
	}
	void resort() {
		System.out.println("Walk");
	}
}

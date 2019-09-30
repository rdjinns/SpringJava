package springdemo1;

public class FootCoach implements CoachInterface {

	private FortuneService fortuneservice;
	
	public FootCoach(FortuneService fortuneservice) {

		this.fortuneservice = fortuneservice;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Tire en lucarne";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneservice.getFortune();
		
	}

}

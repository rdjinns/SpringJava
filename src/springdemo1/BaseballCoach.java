package springdemo1;

public class BaseballCoach implements CoachInterface {
	
	private FortuneService fortuneservice;
	
	public BaseballCoach(FortuneService fortuneservice) {
	
		this.fortuneservice = fortuneservice;
	}

	@Override
	public String getDailyWorkout() {
		return "fait 30 tours du terrains";
	}

	@Override
	public String getDailyFortune() {

		return "CHIEN"+fortuneservice.getFortune();
	}
	
	
	

}

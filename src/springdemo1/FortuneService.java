package springdemo1;

public class FortuneService implements FortuneInterface {

	@Override
	public String getFortune() {
		return "TODAY IS YOUR LUCKY DAY";
	}
	
}

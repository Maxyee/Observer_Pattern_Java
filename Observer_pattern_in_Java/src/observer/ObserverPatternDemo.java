package observer;

public class ObserverPatternDemo {
	
	public static void main(String[] args)
	{
		Subject subject = new Subject();
		
		new HexaObserver(subject);
		new OctalObserver(subject);
		new BinaryObserver(subject);
		
		System.out.println("First state Change : 15");
		subject.setState(15);
		System.out.println("Second State Change: 10");
		subject.setState(10);
	}
}

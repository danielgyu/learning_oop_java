package sixInterface.basic;

public final class ConsoleLogger implements ILoggable{
	public void log(String message) {
		System.out.println(message);
	}
}

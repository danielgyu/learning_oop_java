package fourInheritance.clock;

public class Clock {
	private byte hours;
	private byte minutes;
	private byte seconds;

	public Clock() {
	}

	public byte getHours() {
		return this.hours;
	}

	public void setHours(byte hours) {
		this.hours = (byte) Math.min(Math.max(1, hours), 12);
	}

	public byte getMinutes() {
		return this.minutes;
	}

	public void setMinutes(byte minutes) {
		while (minutes < 0) {
			minutes += 60;
		}

		this.minutes = (byte) (minutes % 60);
	}

	public byte getSeconds() {
		return this.seconds;
	}

	public void setSeconds(byte seconds) {
		while (seconds < 0) {
			seconds += 60;
		}
		
		this.seconds = (byte) (seconds % 60);
	}

	public void setTime(byte hours, byte minutes, byte seconds) {
		this.setHours(hours);
		this.setMinutes(minutes);
		this.setSeconds(seconds);
	}

	public void addSeconds(short seconds) {
		final int HALF_DAY_IN_SECONDS = 60 * 60 * 12;

		int value = this.seconds + seconds;
		while (value < 0) {
			value += HALF_DAY_IN_SECONDS;
		}

		this.seconds = (byte) (value % 60);

		value = value / 60;
		value += this.minutes;

		this.minutes = (byte) (value % 60);

		value = value / 60;
		value += this.hours - 1;
		this.hours = (byte) (value % 12 + 1);
	}
}

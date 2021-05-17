public enum EnumSubject {
	KOREAN(2),
	ENGLISH(3);

	private int hours;

	public int getHours() {
		return hours;
	}	

	Subject(int h) {
		hours = h;
	}
}

package oneJavaSyntax.hismayfly;

public class ForLoop {

	public ForLoop() {
		int[] score = new int[] {1, 2, 3, 4, 5};

		System.out.println("for loop");
		for (int i = 0; i < score.length; i++) {
			System.out.println(score[i]);
		}

		int count = 0;
		System.out.println("while loop");
		while (count < score.length) {
			System.out.println(count++);
		}

		int[] scores = {10, 20, 30};
		System.out.println("for each loop");
		for (int s: scores) {
			System.out.println(s);
		}
	}
}

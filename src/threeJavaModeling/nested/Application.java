package threeJavaModeling.nested;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Application {

	public static void main(String[] argv) {
		String text = "POCU";
		Record record = new Record(text.getBytes(StandardCharsets.UTF_8));

		RecordReader r0 = new RecordReader(record);
		RecordReader r1 = new RecordReader(record);

		if (r0.canRead()) {
			System.out.println(r0.readByte());
		}

		System.out.println(r1.readSignature());
	}
}

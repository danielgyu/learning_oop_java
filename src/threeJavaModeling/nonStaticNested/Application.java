package threeJavaModeling.nonStaticNested;

import java.util.Arrays;
import java.nio.charset.StandardCharsets;

public class Application {
	public static void main(String[] argv) {
		String string = "POCU";
		byte[] s_byte = string.getBytes(StandardCharsets.UTF_8);

		Record record = new Record(s_byte);

		Record.Reader r0 = record.new Reader();
		Record.Reader r1 = record.new Reader();

		if (r0.canRead()) {
			System.out.println(r0.readByte());
		}

		System.out.println(r1.readSignature());
	}
}

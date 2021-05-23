package threeJavaModeling.nonStaticNested;

public class Record {
	private final byte[] rawData;

	public Record(byte[] rawData) {
		this.rawData = rawData;
	}

	public class Reader {
		private int position;

		public boolean canRead() {
			return this.position < rawData.length;
		}

		public byte readByte() {
			return rawData[this.position++];
		}

		public String readSignature() {
			byte ch0 = this.readByte();
			byte ch1 = this.readByte();
			byte ch2 = this.readByte();
			byte ch3 = this.readByte();

			return String.format("%c%c%c%c", ch0, ch1, ch2, ch3);
		}
	}
}

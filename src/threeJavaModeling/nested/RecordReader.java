package threeJavaModeling.nested;

public class RecordReader {
	private Record record;
	private int position;

	public RecordReader(Record record) {
		this.record = record;
	}

	public boolean canRead() {
		return this.position < this.record.rawData.length;
	}

	public byte readByte() {
		return this.record.rawData[this.position++];
	}

	public String readSignature() {
		byte ch0 = this.readByte();
		byte ch1 = this.readByte();
		byte ch2 = this.readByte();
		byte ch3 = this.readByte();

		return String.format("%c%c%c%c", ch0, ch1, ch2, ch3);
	}
}

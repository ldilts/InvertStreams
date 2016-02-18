package invertOutput;

import java.io.IOException;
import java.io.OutputStream;

public class InvertOutputStream extends OutputStream {
	
	OutputStream output;

	public InvertOutputStream(OutputStream output) {
		
		this.output = output;
	}

	public void write(int b) throws IOException {
		
		throw new UnsupportedOperationException("Not supported yet.");
	}
	
	public void wirte(byte[] data) throws IOException {
		
		output.write(invert(data));
	}
	
	public void write(byte[] data, int offset, int length) throws IOException {
		
		output.write(invert(data, offset, length));
	}

	private byte[] invert(byte[] data) {
		
		int j = data.length - 1;
		
		byte[] invertedData = new byte[data.length];
		
		for (int i = 0; i < data.length; i++, j--) {
			invertedData[j] = data[i];
		}
		
		return invertedData;
	}
	
	private byte[] invert(byte[] data, int offset, int length) {
		
		int j = length - 1;
		
		byte[] invertedData = new byte[length];
		
		for (int i = offset; i < offset + length; i++, j--) {
			invertedData[j] = data[i];
		}
		
		return invertedData;
	}

	
}

package invertInput;

import java.io.IOException;
import java.io.InputStream;

public class InvertInputStream extends InputStream {
	
	InputStream input;

	public InvertInputStream(InputStream input) {
		
		this.input = input;
	}
	
	public int read() throws IOException {
		
		throw new UnsupportedOperationException("Not supported yet.");
	}
	
	public int read(byte[] data) throws IOException {
		
		invert(data);
		
		return data.length;
	}

	public int read(byte[] data, int offset, int length) throws IOException {
		
		invert(data, offset, length);
		
		return length;
	}
	
	private byte[] invert(byte[] data) {
		
		int j = data.length - 1;
		
		byte[] invertedData = new byte[data.length];
		
		for (int i = 0; i < data.length; i++, j--) {
			invertedData[j] = data[i];
		}
		
		System.out.println(new String(invertedData) + "\n");
		
		return invertedData;
	}

	private byte[] invert(byte[] data, int offset, int length) {
		
		int j = length - 1;
		
		byte[] invertedData = new byte[length];
		
		for (int i = offset; i < offset + length; i++, j--) {
			invertedData[j] = data[i];
		}
		
		System.out.println(new String(invertedData) + "\n");
		
		return invertedData;
	}

}

package com.app.util;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;

public class EncodingUtils {
	
	private static final Charset utf8charset = Charset.forName("UTF-8");
	private static final Charset iso88591charset = Charset.forName("ISO-8859-1");

	public static String toISO8859_1(String text) {
		try {
			
			ByteBuffer inputBuffer = ByteBuffer.wrap(text.getBytes(utf8charset));
			// decode UTF-8
			CharBuffer data = utf8charset.decode(inputBuffer);
			// encode ISO-8559-1
			ByteBuffer outputBuffer = iso88591charset.encode(data);
			byte[] outputData = outputBuffer.array();
			System.out.println("length= "+text.length());
			return new String(outputData, iso88591charset);
			
		} catch (Exception e) {
			throw new IllegalStateException(e);
		}
	}
	
	public static String test(String input){
	    String output = "";
	    try {
	        /* From ISO-8859-1 to UTF-8 */
	        output = new String(input.getBytes("ISO-8859-1"), "UTF-8");
	        
	        System.out.println("result 1 ="+output);
	        
	        /* From UTF-8 to ISO-8859-1 */
	        output = new String(input.getBytes("UTF-8"), "ISO-8859-1");
	        System.out.println("result 2 ="+output);
	    } catch (UnsupportedEncodingException e) {
	        e.printStackTrace();
	    }
	    return output;
	}
	
	public static void main(String[] args) {
		//txtEditClientMsgDateLiv2=
		//باز نشده
		String s="کادرهای باز شده";//کادرهای باز شده
		System.out.println(toISO8859_1(s));
		test(s);
		
	}
	
}
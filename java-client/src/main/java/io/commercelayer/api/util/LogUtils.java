package io.commercelayer.api.util;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;


/**
 * @author p.viti
 *
 */
public class LogUtils {
	
	private static final LogUtils instance;
	
	static {
		instance = new LogUtils();
	}
	
	public static LogUtils getInstance() {
		return instance;
	}
	
	public static String printStackTrace(Throwable t) {
		
		if (t == null) return ("");
		
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw, true);
		
		t.printStackTrace(pw);
		
		String stack = sw.toString();
		
		try {
			if (pw != null) pw.close();
			if (sw != null) sw.close();
		}
		catch (IOException ioe) {
			singleErrorStackTrace(LogUtils.class, ioe);
		}
		
		return stack;
				
	}
	
	
	public String getStackTrace(Throwable t) {
		
		if (t == null) return ("");
		
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw, true);
		
		t.printStackTrace(pw);
		
		String stack = sw.toString();
		
		try {
			if (pw != null) pw.close();
			if (sw != null) sw.close();
		}
		catch (IOException ioe) {
			singleErrorStackTrace(LogUtils.class, ioe);
		}
		
		return stack;
		
	}
	


	public static void singleErrorStackTrace(Class<?> classe, Throwable t) {
		singleErrorMessage(classe, printStackTrace(t));
	}
	
	public static void singleErrorStackTrace(Object obj, Throwable t) {
		singleErrorMessage(obj, printStackTrace(t));
	}
	
	public static void singleErrorMessage(Object obj, String message) {
		singleErrorMessage(obj.getClass(), message);
	}
	
	public static void singleInfoMessage(Object obj, String message) {
		singleInfoMessage(obj.getClass(), message);
	}
	
}

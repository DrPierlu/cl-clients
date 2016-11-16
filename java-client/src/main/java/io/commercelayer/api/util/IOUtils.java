package io.commercelayer.api.util;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;

public class IOUtils {

	public static void closeResources(Closeable... resources) {
		if (resources == null) return;
		else
			for (Closeable c : resources)
				try {
					if (c instanceof Flushable) ((Flushable)c).flush();
					c.close();
				}
				catch (IOException ioe) {
					LogUtils.singleErrorStackTrace(IOUtils.class, ioe);
				}
	}
	
}

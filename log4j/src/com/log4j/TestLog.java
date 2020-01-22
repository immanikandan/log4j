package com.log4j;

import org.apache.log4j.Logger;

public class TestLog {
	void devide() {
		int a=10/0;
	}
	final static Logger l=Logger.getLogger(TestLog.class);
	public static void main(String[] args) {
		l.debug("DEBUG MSG");
		l.info("INFO MSG");
		l.warn("WARN MSG");
		l.error("ERROR MSG");
		l.fatal("FATAL MSG");
		
		try {
			TestLog t=new TestLog();
			t.devide();
		}
		catch(Exception e) {
			l.error("Arithmetic Exception Found");
		}
	}

}

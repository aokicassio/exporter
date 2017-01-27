package com.logs.commons.logger;

import com.logs.commons.printer.LogPrinter;
import com.logs.log.Log;

public abstract class Logger {
	
	protected abstract LogPrinter createLogger();
	
	public final void log(Log log){
		
		createLogger().print(log);
		
	}
	
}

package com.logs.console;

import com.logs.commons.logger.Logger;
import com.logs.commons.printer.LogPrinter;

public class ConsoleLogCreator extends Logger{
	
	@Override
	protected LogPrinter createLogger() {
		return new ConsoleLogPrinter();
	}

}

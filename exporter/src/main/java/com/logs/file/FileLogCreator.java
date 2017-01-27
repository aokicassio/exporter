package com.logs.file;

import com.logs.commons.logger.Logger;
import com.logs.commons.printer.LogPrinter;

public class FileLogCreator extends Logger {
	
	@Override
	protected LogPrinter createLogger() {
		return new FileLogPrinter();
	}

}

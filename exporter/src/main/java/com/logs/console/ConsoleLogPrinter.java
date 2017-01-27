package com.logs.console;

import java.util.logging.Logger;

import com.logs.commons.printer.LogPrinter;
import com.logs.log.Log;

public class ConsoleLogPrinter implements LogPrinter {
	
	private static final Logger LOGGER = Logger.getLogger("Console Logging");

	public void print(Log log) {
		LOGGER.log(log.getLevel(), log.getMessage());
	}

}

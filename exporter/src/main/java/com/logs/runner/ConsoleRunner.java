package com.logs.runner;

import java.util.logging.Level;

import com.logs.commons.logger.Logger;
import com.logs.console.ConsoleLogCreator;
import com.logs.log.Log;

public class ConsoleRunner {

	public static void main(String[] args) {
		Logger logger = new ConsoleLogCreator();
		logger.log(generateLog());
	}
	
	private static Log generateLog(){
		Log log = new Log( Level.INFO, "Teste de log");
		return log;
	}

}

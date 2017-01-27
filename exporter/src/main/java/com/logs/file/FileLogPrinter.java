package com.logs.file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import com.logs.log.Log;
import com.logs.commons.printer.LogPrinter;

public class FileLogPrinter implements LogPrinter {
	
	public void print(Log log) {
		
		FileWriter fw = null;
		BufferedWriter bw = null;

		try {
			fw = new FileWriter("C://logs/log.txt");
			bw = new BufferedWriter(fw);
			bw.write(log.getMessage());
			
		} catch (IOException e) {
			System.out.println("Error exporting file log: " + e.getMessage());
		} finally {

			try {

				if (bw != null)
					bw.close();

				if (fw != null)
					fw.close();

			} catch (IOException ex) {
				ex.printStackTrace();
			}

		}
		
	}

}

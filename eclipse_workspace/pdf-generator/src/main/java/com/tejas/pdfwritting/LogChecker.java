package com.tejas.pdfwritting;

public class LogChecker {

	public LogChecker() {
		PdfGenerator.logger.debug("CHECKING ITS WORKING");
		PdfGenerator.logger.error("Its taking time, Maven is nice and awesome");
	}

}

package com.okdori.exception;

import com.okdori.ExcelException;

public class UnSupportedExcelTypeException extends ExcelException {

	public UnSupportedExcelTypeException(String message) {
		super(message, null);
	}

}

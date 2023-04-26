package com.okdori.exception;

import com.okdori.ExcelException;

public class NoExcelColumnAnnotationsException extends ExcelException {

	public NoExcelColumnAnnotationsException(String message) {
		super(message, null);
	}

}

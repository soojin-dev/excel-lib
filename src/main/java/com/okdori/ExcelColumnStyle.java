package com.okdori;


import com.okdori.style.ExcelCellStyle;

public @interface ExcelColumnStyle {

	/**
	 * Enum implements {@link com.okdori.style.ExcelCellStyle}
	 * Also, can use just class.
	 * If not use Enum, enumName will be ignored
	 * @see com.okdori.style.DefaultExcelCellStyle
	 * @see com.okdori.style.CustomExcelCellStyle
	 */
	Class<? extends ExcelCellStyle> excelCellStyleClass();

	/**
	 * name of Enum implements {@link com.okdori.style.ExcelCellStyle}
	 * if not use Enum, enumName will be ignored
	 */
	String enumName() default "";

}

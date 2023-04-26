package com.okdori.dto;

import com.okdori.DefaultHeaderStyle;
import com.okdori.ExcelColumn;
import com.okdori.ExcelColumnStyle;
import com.okdori.style.BlueHeaderStyle;
import com.okdori.style.BlackHeaderStyle;

@DefaultHeaderStyle(style = @ExcelColumnStyle(excelCellStyleClass = BlueHeaderStyle.class))
public class ExcelDto {

    @ExcelColumn(headerName = "name")
    private String name;

    private String hideColumn;

    @ExcelColumn(headerName = "age",
            headerStyle = @ExcelColumnStyle(excelCellStyleClass = BlackHeaderStyle.class))
    private int age;

}

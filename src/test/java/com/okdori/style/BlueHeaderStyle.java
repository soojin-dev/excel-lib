package com.okdori.style;

import com.okdori.style.align.DefaultExcelAlign;
import com.okdori.style.border.DefaultExcelBorders;
import com.okdori.style.border.ExcelBorderStyle;
import com.okdori.style.configurer.ExcelCellStyleConfigurer;

public class BlueHeaderStyle extends CustomExcelCellStyle {

    @Override
    public void configure(ExcelCellStyleConfigurer configurer) {
        configurer.foregroundColor(223, 235, 246)
                .excelBorders(DefaultExcelBorders.newInstance(ExcelBorderStyle.THIN))
                .excelAlign(DefaultExcelAlign.CENTER_CENTER);
    }

}

package com.llg.lqs.util;

import com.llg.lqs.exception.LQSException;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class ExcelUtil {

    /**
     * parse excel
     *  @param in
     * @param filename
     * @return
     */
    public static List<List<Cell>> parseExcel(InputStream in, String filename, int cellCount) throws Exception {
        List<List<Cell>> list = null;
        Workbook work = null;
        list = new ArrayList<>();
        //创建Excel工作薄
        work = getWorkbook(in, filename);
        if (null == work) {
            throw new LQSException("Excel sheet is empty.");
        }
        Sheet sheet = null;
        Row row = null;
        Cell cell = null;

        for (int i = 0; i < work.getNumberOfSheets(); i++) {
            sheet = work.getSheetAt(i);
            if (sheet == null) {
                continue;
            }

            for (int j = sheet.getFirstRowNum() + 1; j <= sheet.getLastRowNum(); j++) {
                row = sheet.getRow(j);
                if (row == null || row.getFirstCellNum() == j) {
                    continue;
                }

                List<Cell> li = new ArrayList<>(cellCount);
                for (int y = row.getFirstCellNum(); y < row.getLastCellNum(); y++) {
                    cell = row.getCell(y);
                    li.add(cell);
                }
                list.add(li);
            }
        }
        return list;

    }

    private static Workbook getWorkbook(InputStream in, String fileName) throws IOException {
        Workbook workbook = null;
        String fileType = fileName.substring(fileName.lastIndexOf("."));

        if (".xls".equals(fileType)) {
            workbook = new HSSFWorkbook(in);
        } else if (".xlsx".equals(fileType)) {
            workbook = new XSSFWorkbook(in);
        } else {
            throw new LQSException("File type not support.");
        }
        return workbook;
    }
}

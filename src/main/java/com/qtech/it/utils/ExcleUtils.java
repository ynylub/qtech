package com.qtech.it.utils;

import cn.afterturn.easypoi.excel.ExcelExportUtil;
import cn.afterturn.easypoi.excel.entity.ExportParams;
import org.apache.poi.ss.usermodel.Workbook;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.List;

/**
 * @author: xulinyi
 * @create: 2019-03-21 10:08
 **/
public class ExcleUtils {
    /**
     * excle下载
     * @param list  数据集合
     * @param title excle表中的标题
     * @param sheetName  sheet名称
     * @param pojoClass  pojo类
     * @param fileName   生成的文件名
     * @param response
     */
    public static void downloadExcel(List<?> list, String title, String sheetName, Class<?> pojoClass, String fileName, HttpServletResponse response) {
        Workbook workbook = ExcelExportUtil.exportExcel(new ExportParams(title, sheetName), pojoClass, list);
        if (workbook != null) {
            try {
                response.setCharacterEncoding("UTF-8");
                response.setHeader("content-Type", "application/vnd.ms-excel");
                response.setHeader("Content-Disposition",
                        "attachment;filename=" + URLEncoder.encode(fileName, "UTF-8"));
                workbook.write(response.getOutputStream());
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

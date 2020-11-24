package com.orderdealwith;

import com.orderdealwith.service.ExcelImportService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {OrderdealwithApplication.class})
public class Test {

    @Autowired
    private ExcelImportService excelImportService;

    @org.junit.Test
    public void test() {
        excelImportService.importExcel();
    }

}

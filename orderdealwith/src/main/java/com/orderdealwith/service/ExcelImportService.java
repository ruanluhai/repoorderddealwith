package com.orderdealwith.service;
import com.alibaba.excel.ExcelReader;
import com.alibaba.excel.metadata.Sheet;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.orderdealwith.mapper.OrderMapper;
import com.orderdealwith.pojo.OrderInformation;
import com.orderdealwith.utils.ExcelListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;


@Service
public class ExcelImportService {

    @Autowired
    private OrderMapper orderMapper;

    public void importExcel () {
        try {
            InputStream inputStream = new FileInputStream("D:\\test.xlsx");
            //实例化实现了AnalysisEventListener接口的类
            ExcelListener listener = new ExcelListener();
            // 传入参数
            ExcelReader excelReader = new ExcelReader(inputStream, ExcelTypeEnum.XLSX, null, listener);
            //读取信息
            excelReader.read(new Sheet(1, 1, OrderInformation.class));
            //获取数据
            List<Object> list = listener.getDatas();
            List<OrderInformation> orderList = new ArrayList<OrderInformation>();
            //转换数据类型,并插入到数据库
            for (int i = 0; i < list.size(); i++) {
                OrderInformation orderInformation = new OrderInformation();
                orderInformation = (OrderInformation) list.get(i);
                System.out.println(orderInformation);
                orderList.add(orderInformation);
            }
            orderMapper.insertExcel(orderList);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}

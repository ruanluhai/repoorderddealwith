package com.orderdealwith.mapper;
import com.orderdealwith.pojo.OrderInformation;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Map;


@Mapper
@Component
public interface OrderMapper {

    /**
     * 查询订单相关信息
     * @return
     */
    List<OrderInformation> findOrder(Map map);

    /**
     * 插入excel
     * @param orderInformationList
     * @return
     */
      int insertExcel(List<OrderInformation> orderInformationList);
}

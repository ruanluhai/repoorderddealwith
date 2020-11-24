package com.orderdealwith.mapper;

import com.orderdealwith.pojo.OrderDetail;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Mapper@
Component
public interface OrderDetailMapper {

    List<OrderDetail> findOrderDetail(Map map);
}

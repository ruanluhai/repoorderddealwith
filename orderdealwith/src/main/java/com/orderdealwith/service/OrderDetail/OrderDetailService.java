package com.orderdealwith.service.OrderDetail;

import com.orderdealwith.pojo.OrderDetail;

import java.util.List;
import java.util.Map;

public interface OrderDetailService {

    List<OrderDetail> findOrderDetail(Map map);
}

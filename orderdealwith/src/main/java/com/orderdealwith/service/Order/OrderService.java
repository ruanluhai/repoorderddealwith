package com.orderdealwith.service.Order;

import com.orderdealwith.pojo.OrderInformation;

import java.util.List;
import java.util.Map;

public interface OrderService {

    public List<OrderInformation> findOrder(Map map);
}

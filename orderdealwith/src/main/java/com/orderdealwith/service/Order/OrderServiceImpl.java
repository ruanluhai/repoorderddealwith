package com.orderdealwith.service.Order;

import com.orderdealwith.mapper.OrderMapper;
import com.orderdealwith.pojo.OrderInformation;
import com.orderdealwith.service.Order.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public List<OrderInformation> findOrder(Map map) {
        List<OrderInformation> orderInformationList = orderMapper.findOrder(map);
        return orderInformationList;
    }
}

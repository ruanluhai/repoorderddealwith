package com.orderdealwith.controller;

import com.orderdealwith.pojo.OrderDetail;
import com.orderdealwith.pojo.OrderInformation;
import com.orderdealwith.service.Order.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@CrossOrigin("http://localhost:63342")
public class OrderController {

    @Autowired
    private OrderServiceImpl orderServiceImpl;

    @RequestMapping(value="/findOrder", method = RequestMethod.POST)
    @ResponseBody
    public List<OrderInformation> findOrder(HttpServletRequest request) {
        Map<String,Object> map = new HashMap<>();
        if (!StringUtils.isEmpty(request.getParameter("orderId"))) {
            map.put("orderId",request.getParameter("orderId"));
        }
        if(!StringUtils.isEmpty(request.getParameter("goodName"))) {
            map.put("goodName",request.getParameter("goodName"));
        }
        List<OrderInformation> orderInformationList = orderServiceImpl.findOrder(map);
        return orderInformationList;
    }

    @RequestMapping(value="/findOrderDetail", method = RequestMethod.POST)
    @ResponseBody
    public List<OrderDetail> findOrderDetail() {
        return null;
    }
}

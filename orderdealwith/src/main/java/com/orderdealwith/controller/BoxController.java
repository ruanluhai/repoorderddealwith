package com.orderdealwith.controller;

import com.orderdealwith.service.box.BoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Controller
@CrossOrigin("http://localhost:63342")
public class BoxController {

    @Autowired
    private BoxService boxService;

    @RequestMapping("/updateBox")
    @ResponseBody
    public void updateBox(HttpServletRequest request) {
//        try {
            Map<String,Object> map = new HashMap<>();
        if (!StringUtils.isEmpty(request.getParameter("hight"))) {
            map.put("hight",request.getParameter("hight"));
        }
        if(!StringUtils.isEmpty(request.getParameter("weight"))) {
            map.put("weight",request.getParameter("weight"));
        }
            int i = boxService.updateBox(map);
            System.out.println("成功插入" + i + "条信息");
 //       } catch (Exception e) {
 //           System.out.println("插入失败");
   //     }

    }
}

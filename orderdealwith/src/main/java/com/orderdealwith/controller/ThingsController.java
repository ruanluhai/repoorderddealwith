package com.orderdealwith.controller;


import com.orderdealwith.service.things.ThingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@CrossOrigin("http://localhost:63342")
public class ThingsController {

    @Autowired
    private ThingsService thingsService;

    @RequestMapping("/updateThings")
    @ResponseBody
    public void updateThings() {
        try{
            int i = thingsService.updateThings();
            System.out.println("已成功插入" + i + "条信息");
        }catch (Exception e){
            System.out.println("插入失败");
        }
    }
}

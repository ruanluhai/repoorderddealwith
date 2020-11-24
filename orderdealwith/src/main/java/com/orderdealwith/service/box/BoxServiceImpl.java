package com.orderdealwith.service.box;


import com.orderdealwith.mapper.BoxMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class BoxServiceImpl implements BoxService{


    @Autowired
    private BoxMapper boxMapper;

    @Override
    public int updateBox(Map map) {
        int i = boxMapper.updateBox(map);
        return i;
    }
}

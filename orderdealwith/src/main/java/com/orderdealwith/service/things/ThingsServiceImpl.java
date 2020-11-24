package com.orderdealwith.service.things;


import com.orderdealwith.mapper.ThingsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ThingsServiceImpl implements ThingsService{

    @Autowired
    private ThingsMapper thingsMapper;
    @Override
    public int updateThings() {
        int i = thingsMapper.updateThings();
        return i;
    }
}

package com.orderdealwith.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.Map;

@Mapper
@Component
public interface BoxMapper {

    int updateBox(Map map);
}

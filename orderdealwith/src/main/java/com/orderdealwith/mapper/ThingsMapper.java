package com.orderdealwith.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface ThingsMapper {

    int updateThings();
}

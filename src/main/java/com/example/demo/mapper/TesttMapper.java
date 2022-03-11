package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import java.util.Map;

@Mapper
@Repository
public interface TesttMapper {
    Logger logger = LoggerFactory.getLogger(TesttMapper.class);

    Map<?,?> selectEmpInfo();

}

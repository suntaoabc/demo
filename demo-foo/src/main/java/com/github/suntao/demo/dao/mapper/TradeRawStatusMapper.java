package com.github.suntao.demo.dao.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.github.suntao.demo.dao.dataobject.TradeRawStatusDO;

@Mapper
public interface TradeRawStatusMapper {

    int insert(TradeRawStatusDO tradeRawStatusDO);

    TradeRawStatusDO findByOrderId(@Param("orderId") Long orderId);

    int updateByExample(TradeRawStatusDO record);
}
package com.github.suntao.demo.dao.mapper;

import com.github.suntao.demo.dao.dataobject.TradeControlPointStatusDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TradeControlPointStatusMapper {

    int insert(TradeControlPointStatusDO tradeControlPointStatusDO);

    TradeControlPointStatusDO findByOrderId(@Param("orderId") Long orderId);

    int updateByExample(TradeControlPointStatusDO tradeControlPointStatusDO);
}
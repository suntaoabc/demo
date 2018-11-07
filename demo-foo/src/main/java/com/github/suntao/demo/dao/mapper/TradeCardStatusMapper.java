package com.github.suntao.demo.dao.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.github.suntao.demo.dao.dataobject.TradeCardStatusDO;

@Mapper
public interface TradeCardStatusMapper {

    int insert(TradeCardStatusDO tradeCardStatusDO);

    TradeCardStatusDO findByOrderId(Long orderId);

    int updateByExample(TradeCardStatusDO tradeCardStatusDO);
}
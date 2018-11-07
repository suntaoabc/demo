/**
 * ymm56.com Inc. Copyright (c) 2013-2018 All Rights Reserved.
 */
package com.github.suntao.demo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.github.suntao.demo.dao.dataobject.TradeCardStatusDO;
import com.github.suntao.demo.dao.mapper.TradeCardStatusMapper;

/**
 * 操作TradeCardStatus
 * 
 * @author suntao
 * @date 2018-11-06 17:03
 */
@Repository
public class TradeCardStatusRepo {

    @Autowired
    private TradeCardStatusMapper tradeCardStatusMapper;

    public void saveTradeCardStatus(TradeCardStatusDO tradeCardStatusDO) {
        this.tradeCardStatusMapper.insert(tradeCardStatusDO);
    }

    public TradeCardStatusDO findTradeCardStatusByOrderId(Long orderId) {

        return this.tradeCardStatusMapper.findByOrderId(orderId);
    }

    public void updateTradeCardStatus(TradeCardStatusDO tradeCardStatusDO) {

        this.tradeCardStatusMapper.updateByExample(tradeCardStatusDO);
    }
}
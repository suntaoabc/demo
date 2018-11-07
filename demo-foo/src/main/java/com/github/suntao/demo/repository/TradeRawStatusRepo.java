/**
 * ymm56.com Inc. Copyright (c) 2013-2018 All Rights Reserved.
 */
package com.github.suntao.demo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.github.suntao.demo.dao.dataobject.TradeRawStatusDO;
import com.github.suntao.demo.dao.mapper.TradeRawStatusMapper;

/**
 * 操作TradeRawStatus
 * 
 * @author suntao
 * @date 2018-11-06 15:46
 */
@Repository
public class TradeRawStatusRepo {

    @Autowired
    private TradeRawStatusMapper tradeRawStatusMapper;

    public void saveTradeRawStatus(TradeRawStatusDO tradeRawStatusDO) {
        this.tradeRawStatusMapper.insert(tradeRawStatusDO);
    }

    public TradeRawStatusDO findTradeRawStatusByOrderId(Long orderId) {

        return this.tradeRawStatusMapper.findByOrderId(orderId);
    }

    public void updateTradeRawStatus(TradeRawStatusDO tradeRawStatusDO) {
        this.tradeRawStatusMapper.updateByExample(tradeRawStatusDO);
    }
}
/**
 * ymm56.com Inc.
 * Copyright (c) 2013-2018 All Rights Reserved.
 */
package com.github.suntao.demo.repository;

import com.github.suntao.demo.dao.dataobject.TradeControlPointStatusDO;
import com.github.suntao.demo.dao.mapper.TradeControlPointStatusMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author suntao
 * @date 2018-11-06 19:03
 */
@Repository
public class TradeControlPointStatusRepo {

    @Autowired
    private TradeControlPointStatusMapper tradeControlPointStatusMapper;

    public int saveTradeControlPointStatus(TradeControlPointStatusDO tradeControlPointStatusDO) {
        return this.tradeControlPointStatusMapper.insert(tradeControlPointStatusDO);
    }

    public TradeControlPointStatusDO findTradeControlPointStatusByOrderId(Long orderId) {
        return this.tradeControlPointStatusMapper.findByOrderId(orderId);
    }

    public int updateTradeControlPointStatus(TradeControlPointStatusDO tradeControlPointStatusDO) {
        return this.tradeControlPointStatusMapper.updateByExample(tradeControlPointStatusDO);
    }
}
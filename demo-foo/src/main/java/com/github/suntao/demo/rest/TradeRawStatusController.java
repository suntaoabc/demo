/**
 * ymm56.com Inc. Copyright (c) 2013-2018 All Rights Reserved.
 */
package com.github.suntao.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.github.suntao.demo.dao.dataobject.TradeRawStatusDO;
import com.github.suntao.demo.repository.TradeRawStatusRepo;
import com.github.suntao.demo.rest.response.Response;
import com.github.suntao.demo.rest.response.ResultCode;

/**
 * @author suntao
 * @date 2018-11-06 19:07
 */
@RestController
@RequestMapping("/raws")
public class TradeRawStatusController {

    @Autowired
    private TradeRawStatusRepo tradeRawStatusRepo;

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
        produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Response<Long> addTradeRawStatus(@RequestBody TradeRawStatusDO tradeRawStatusDO) {
        this.tradeRawStatusRepo.saveTradeRawStatus(tradeRawStatusDO);

        return new Response<>(ResultCode.SUCCESS, 1L);
    }

    @RequestMapping(value = "/{orderId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Response<TradeRawStatusDO> getTradeRawStatus(@PathVariable("orderId") Long orderId) {

        TradeRawStatusDO tradeRawStatusDO = this.tradeRawStatusRepo.findTradeRawStatusByOrderId(orderId);
        return new Response<>(ResultCode.SUCCESS, tradeRawStatusDO);
    }

    @RequestMapping(value = "/{orderId}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
        produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Response<Long> updateTradeRawStatus(@PathVariable("orderId") Long orderId,
        @RequestBody TradeRawStatusDO tradeRawStatusDO) {
        tradeRawStatusDO.setOrderId(orderId);
        this.tradeRawStatusRepo.updateTradeRawStatus(tradeRawStatusDO);

        return new Response<>(ResultCode.SUCCESS, 1L);
    }
}
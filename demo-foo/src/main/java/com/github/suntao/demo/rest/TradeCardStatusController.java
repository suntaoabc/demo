/**
 * foo Copyright (c) 2013-2018 All Rights Reserved.
 */
package com.github.suntao.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.github.suntao.demo.dao.dataobject.TradeCardStatusDO;
import com.github.suntao.demo.repository.TradeCardStatusRepo;
import com.github.suntao.demo.rest.response.Response;
import com.github.suntao.demo.rest.response.ResultCode;

/**
 * @author suntao
 * @date 2018-11-06 19:07
 */
@RestController
@RequestMapping("/cards")
public class TradeCardStatusController {

    @Autowired
    private TradeCardStatusRepo tradeCardStatusRepo;

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
        produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Response<Long> addTradeCardStatus(@RequestBody TradeCardStatusDO tradeCardStatusDO) {
        this.tradeCardStatusRepo.saveTradeCardStatus(tradeCardStatusDO);

        return new Response<>(ResultCode.SUCCESS, 1L);
    }

    @RequestMapping(value = "/{orderId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Response<TradeCardStatusDO> getTradeCardStatus(@PathVariable("orderId") Long orderId) {

        TradeCardStatusDO tradeCardStatusDO = this.tradeCardStatusRepo.findTradeCardStatusByOrderId(orderId);
        return new Response<>(ResultCode.SUCCESS, tradeCardStatusDO);
    }

    @RequestMapping(value = "/{orderId}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
        produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Response<Long> updateTradeCardStatus(@PathVariable("orderId") Long orderId,
        @RequestBody TradeCardStatusDO tradeCardStatusDO) {
        tradeCardStatusDO.setOrderId(orderId);
        this.tradeCardStatusRepo.updateTradeCardStatus(tradeCardStatusDO);

        return new Response<>(ResultCode.SUCCESS, 1L);
    }
}
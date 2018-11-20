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

import com.github.suntao.demo.dao.dataobject.TradeControlPointStatusDO;
import com.github.suntao.demo.repository.TradeControlPointStatusRepo;
import com.github.suntao.demo.rest.response.Response;
import com.github.suntao.demo.rest.response.ResultCode;

/**
 * @author suntao
 * @date 2018-11-06 19:07
 */
@RestController
@RequestMapping("/points")
public class TradeControlPointStatusController {

    @Autowired
    private TradeControlPointStatusRepo tradeControlPointStatusRepo;

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
        produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Response<Long> addTradeControlPointStatus(@RequestBody TradeControlPointStatusDO tradeControlPointStatusDO) {
        this.tradeControlPointStatusRepo.saveTradeControlPointStatus(tradeControlPointStatusDO);

        return new Response<>(ResultCode.SUCCESS, 1L);
    }

    @RequestMapping(value = "/{orderId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Response<TradeControlPointStatusDO> getControlPointStatus(@PathVariable("orderId") Long orderId) {

        TradeControlPointStatusDO tradeControlPointStatusDO =
            this.tradeControlPointStatusRepo.findTradeControlPointStatusByOrderId(orderId);
        return new Response<>(ResultCode.SUCCESS, tradeControlPointStatusDO);
    }

    @RequestMapping(value = "/{orderId}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
        produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Response<Long> updateTradeControlPointStatus(@PathVariable("orderId") Long orderId,
        @RequestBody TradeControlPointStatusDO tradeControlPointStatusDO) {
        tradeControlPointStatusDO.setOrderId(orderId);
        this.tradeControlPointStatusRepo.updateTradeControlPointStatus(tradeControlPointStatusDO);

        return new Response<>(ResultCode.SUCCESS, 1L);
    }
}
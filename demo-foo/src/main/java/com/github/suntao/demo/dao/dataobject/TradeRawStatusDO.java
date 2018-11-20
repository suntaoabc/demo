package com.github.suntao.demo.dao.dataobject;

public class TradeRawStatusDO {

    /**
     * 订单ID
     */
    private Long orderId;

    /**
     * 关联的业务ID
     */
    private Long relatedItemId;

    /**
     * 触发的业务表
     */
    private String relatedTableName;

    /**
     * 状态
     */
    private Integer turnedStatus;

    /**
     * 交易类型
     */
    private Integer tradeType;

    /**
     * 触发时间
     */
    private Long relatedItemUpdateTime;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getRelatedItemId() {
        return relatedItemId;
    }

    public void setRelatedItemId(Long relatedItemId) {
        this.relatedItemId = relatedItemId;
    }

    public String getRelatedTableName() {
        return relatedTableName;
    }

    public void setRelatedTableName(String relatedTableName) {
        this.relatedTableName = relatedTableName;
    }

    public Integer getTurnedStatus() {
        return turnedStatus;
    }

    public void setTurnedStatus(Integer turnedStatus) {
        this.turnedStatus = turnedStatus;
    }

    public Integer getTradeType() {
        return tradeType;
    }

    public void setTradeType(Integer tradeType) {
        this.tradeType = tradeType;
    }

    public Long getRelatedItemUpdateTime() {
        return relatedItemUpdateTime;
    }

    public void setRelatedItemUpdateTime(Long relatedItemUpdateTime) {
        this.relatedItemUpdateTime = relatedItemUpdateTime;
    }
}
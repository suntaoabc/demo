package com.github.suntao.demo.dao.dataobject;

public class TradeCardStatusDO {

    /**
     * 订单ID
     */
    private Long orderId;

    /**
     * 货源ID
     */
    private Long cargoId;

    /**
     * 货主ID
     */
    private Long consignorUserId;

    /**
     * 司机ID
     */
    private Long driverUserId;

    /**
     * 定金金额
     */
    private Integer depositMoneyAmount;

    /**
     * 起始城市
     */
    private String cityBegin;

    /**
     * 终点城市
     */
    private String cityEnd;

    /**
     * 货物重量
     */
    private String cargoWeight;

    /**
     * 货物容积
     */
    private String cargoCapacity;

    /**
     * 货车类型
     */
    private String cargoCarType;

    /**
     * 货车长度
     */
    private String cargoCarLength;

    /**
     * 定金金额描述
     */
    private String depositMoneyInfo;

    /**
     * 订单状态描述
     */
    private String orderStatusInfo;

    /**
     * 订单状态
     */
    private Integer orderStatus;

    /**
     * 上传回单
     */
    private Integer uploadReceipt;

    /**
     * 运费描述
     */
    private String freightMoneyInfo;

    /**
     * 协议状态描述
     */
    private String contractStatusInfo;

    /**
     * 运单状态描述
     */
    private String wayStatusInfo;

    /**
     * 交易类型描述
     */
    private String lastGuideStepTradeRawStatusITradeType;

    /**
     * 状态触发模块描述
     */
    private String lastGuidStepTradeRawStatusTradeTChangeModule;

    /**
     * 交易状态描述
     */
    private String lastGuidStepTradeRawStatusTradeTChangedStatus;

    /**
     * 运费金额
     */
    private Long freightMoneyCount;

    /**
     * 触发时间
     */
    private Long lastGuidStepTradeRawStatusUpdateTime;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getCargoId() {
        return cargoId;
    }

    public void setCargoId(Long cargoId) {
        this.cargoId = cargoId;
    }

    public Long getConsignorUserId() {
        return consignorUserId;
    }

    public void setConsignorUserId(Long consignorUserId) {
        this.consignorUserId = consignorUserId;
    }

    public Long getDriverUserId() {
        return driverUserId;
    }

    public void setDriverUserId(Long driverUserId) {
        this.driverUserId = driverUserId;
    }

    public Integer getDepositMoneyAmount() {
        return depositMoneyAmount;
    }

    public void setDepositMoneyAmount(Integer depositMoneyAmount) {
        this.depositMoneyAmount = depositMoneyAmount;
    }

    public String getCityBegin() {
        return cityBegin;
    }

    public void setCityBegin(String cityBegin) {
        this.cityBegin = cityBegin;
    }

    public String getCityEnd() {
        return cityEnd;
    }

    public void setCityEnd(String cityEnd) {
        this.cityEnd = cityEnd;
    }

    public String getCargoWeight() {
        return cargoWeight;
    }

    public void setCargoWeight(String cargoWeight) {
        this.cargoWeight = cargoWeight;
    }

    public String getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(String cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public String getCargoCarType() {
        return cargoCarType;
    }

    public void setCargoCarType(String cargoCarType) {
        this.cargoCarType = cargoCarType;
    }

    public String getCargoCarLength() {
        return cargoCarLength;
    }

    public void setCargoCarLength(String cargoCarLength) {
        this.cargoCarLength = cargoCarLength;
    }

    public String getDepositMoneyInfo() {
        return depositMoneyInfo;
    }

    public void setDepositMoneyInfo(String depositMoneyInfo) {
        this.depositMoneyInfo = depositMoneyInfo;
    }

    public String getOrderStatusInfo() {
        return orderStatusInfo;
    }

    public void setOrderStatusInfo(String orderStatusInfo) {
        this.orderStatusInfo = orderStatusInfo;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Integer getUploadReceipt() {
        return uploadReceipt;
    }

    public void setUploadReceipt(Integer uploadReceipt) {
        this.uploadReceipt = uploadReceipt;
    }

    public String getFreightMoneyInfo() {
        return freightMoneyInfo;
    }

    public void setFreightMoneyInfo(String freightMoneyInfo) {
        this.freightMoneyInfo = freightMoneyInfo;
    }

    public String getContractStatusInfo() {
        return contractStatusInfo;
    }

    public void setContractStatusInfo(String contractStatusInfo) {
        this.contractStatusInfo = contractStatusInfo;
    }

    public String getWayStatusInfo() {
        return wayStatusInfo;
    }

    public void setWayStatusInfo(String wayStatusInfo) {
        this.wayStatusInfo = wayStatusInfo;
    }

    public String getLastGuideStepTradeRawStatusITradeType() {
        return lastGuideStepTradeRawStatusITradeType;
    }

    public void setLastGuideStepTradeRawStatusITradeType(String lastGuideStepTradeRawStatusITradeType) {
        this.lastGuideStepTradeRawStatusITradeType = lastGuideStepTradeRawStatusITradeType;
    }

    public String getLastGuidStepTradeRawStatusTradeTChangeModule() {
        return lastGuidStepTradeRawStatusTradeTChangeModule;
    }

    public void setLastGuidStepTradeRawStatusTradeTChangeModule(String lastGuidStepTradeRawStatusTradeTChangeModule) {
        this.lastGuidStepTradeRawStatusTradeTChangeModule = lastGuidStepTradeRawStatusTradeTChangeModule;
    }

    public String getLastGuidStepTradeRawStatusTradeTChangedStatus() {
        return lastGuidStepTradeRawStatusTradeTChangedStatus;
    }

    public void setLastGuidStepTradeRawStatusTradeTChangedStatus(String lastGuidStepTradeRawStatusTradeTChangedStatus) {
        this.lastGuidStepTradeRawStatusTradeTChangedStatus = lastGuidStepTradeRawStatusTradeTChangedStatus;
    }

    public Long getFreightMoneyCount() {
        return freightMoneyCount;
    }

    public void setFreightMoneyCount(Long freightMoneyCount) {
        this.freightMoneyCount = freightMoneyCount;
    }

    public Long getLastGuidStepTradeRawStatusUpdateTime() {
        return lastGuidStepTradeRawStatusUpdateTime;
    }

    public void setLastGuidStepTradeRawStatusUpdateTime(Long lastGuidStepTradeRawStatusUpdateTime) {
        this.lastGuidStepTradeRawStatusUpdateTime = lastGuidStepTradeRawStatusUpdateTime;
    }
}
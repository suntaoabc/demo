package com.github.suntao.demo.dao.dataobject;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TradeControlPointStatusDO {
    private Long orderId;

    private Boolean payFreightButton;

    private Boolean payDepositButton;

    private Boolean raiseContractButton;

    private Boolean confirmContractButton;

    private Boolean confirmReceivedButton;

    private Boolean commentDriverButton;

    private Boolean commentConsignorButton;

    private Boolean uploadReceiptButton;

    private Boolean comfirmLoadCargoButton;

    private Boolean driverConfirmContractButton;

    private Boolean ownerConfirmContractButton;

    private Boolean driverUploadReceiptButton;

    private Boolean ownerUploadReceiptButton;

}
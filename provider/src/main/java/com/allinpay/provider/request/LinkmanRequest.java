package com.allinpay.provider.request;

import lombok.Data;

@Data
public class LinkmanRequest {
    /**
     * 联系人编号
     */
    private String linkNo;
    /**
     * 联系人客户名称
     */
    private String linkCuName;
    /**
     * 联系人名称
     */
    private String linkName;
}

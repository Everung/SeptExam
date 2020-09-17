package com.allinpay.provider.pojo.VO;

import lombok.Data;

@Data
public class LinkmanVO {

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
    /**
     * 联系人性别
     */
    private String linkSex;
    /**
     * 联系人职位
     */
    private String linkJob;
    /**
     * 联系人电话
     */
    private String linkPhone;
    /**
     * 联系人手机
     */
    private String linkMobile;
    /**
     * 联系人备注
     */
    private String linkRemark;
}

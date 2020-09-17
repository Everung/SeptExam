package com.allinpay.provider.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("customer")
public class Customer implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 客户编号
     */
    @TableId(value = "cu_no")
    private String cuNo;
    /**
     * 客户名称
     */
    private String cuName;
    /**
     * 地区
     */
    private String cuPlace;
    /**
     * 客户经理名称
     */
    private String cuUNo;
    /**
     * 等级编号
     */
    private String cuLevelNo;
    /**
     * 满意度编号
     */
    private String cuSatisfyNo;
    /**
     * 客户地址
     */
    private String cuAddress;
    /**
     * 客户邮编
     */
    private Integer cuZip;
    /**
     * 客户传真
     */
    private String cuFax;
    /**
     * 办公电话
     */
    private String cuTelephone;
    /**
     * 网址
     */
    private String cuWeb;
    /**
     * 营业执照
     */
    private String cuLicencno;
    /**
     * 法人
     */
    private String cuCorporation;
    /**
     * 注册资金
     */
    private String cuMoney;
    /**
     * 营业额
     */
    private String cuTurnover;
    /**
     * 开户银行
     */
    private String cuBank;
    /**
     * 银行账户
     */
    private String cuBankaccount;
    /**
     * 地税登记
     */
    private String cuLocalno;
    /**
     * 国税登记
     */
    private String cuNationalno;
    /**
     * 标识
     */
    private String cuFlag;
    /**
     * 信誉度编号
     */
    private String cuCreditNo;
}

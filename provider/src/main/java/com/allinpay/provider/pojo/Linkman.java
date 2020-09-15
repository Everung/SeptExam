package com.allinpay.provider.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("Linkman")
public class Linkman {

    /**
     * 联系人编号
     */
    @TableId(value = "link_no")
    private String linkNo;
    /**
     * 联系人客户编号
     */
    private String linkCuNo;
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
    /**
     * 联系人标识
     */
    private String linkFlag;
}

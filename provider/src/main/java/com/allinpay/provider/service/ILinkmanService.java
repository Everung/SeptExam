package com.allinpay.provider.service;

import com.allinpay.provider.pojo.Linkman;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface ILinkmanService extends IService<Linkman> {

    /**
     * 联系人分页查询
     * @return
     */
    List<Linkman> queryLinkmanList();
}

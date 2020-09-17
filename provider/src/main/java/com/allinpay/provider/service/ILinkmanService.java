package com.allinpay.provider.service;

import com.allinpay.provider.pojo.Linkman;
import com.allinpay.provider.pojo.common.PageResponse;
import com.allinpay.provider.request.LinkmanRequest;
import com.allinpay.provider.request.PageRequest;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface ILinkmanService extends IService<Linkman> {

    /**
     * 联系人分页查询
     * @return
     */
    PageResponse queryLinkmanList(PageRequest pageRequest, LinkmanRequest request);
}

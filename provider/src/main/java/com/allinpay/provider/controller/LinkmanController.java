package com.allinpay.provider.controller;

import com.allinpay.provider.pojo.Linkman;
import com.allinpay.provider.pojo.common.PageResponse;
import com.allinpay.provider.request.LinkmanRequest;
import com.allinpay.provider.request.PageRequest;
import com.allinpay.provider.service.ILinkmanService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LinkmanController {

    private static final Logger logger= LoggerFactory.getLogger(LinkmanController.class);

    @Autowired
    private ILinkmanService linkmanService;

    @PostMapping("/queryLinkmanList")
    public PageResponse queryLinkmanList(PageRequest pageRequest, LinkmanRequest request){
        logger.info("queryLinkmanList linkman ====> : {}",request);
        PageResponse page=linkmanService.queryLinkmanList(pageRequest, request);
        return page;
    }

}

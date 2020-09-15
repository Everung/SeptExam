package com.allinpay.provider.service.impl;

import com.allinpay.provider.mapper.LinkmanMapper;
import com.allinpay.provider.pojo.Linkman;
import com.allinpay.provider.service.ILinkmanService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LinkmanServiceImpl extends ServiceImpl<LinkmanMapper,Linkman> implements ILinkmanService {

    private static final Logger logger= LoggerFactory.getLogger(LinkmanServiceImpl.class);

    @Override
    public List<Linkman> queryLinkmanList() {
        return null;
    }
}

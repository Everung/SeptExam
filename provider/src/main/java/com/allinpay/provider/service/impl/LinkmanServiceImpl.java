package com.allinpay.provider.service.impl;

import com.allinpay.provider.mapper.LinkmanMapper;
import com.allinpay.provider.pojo.Linkman;
import com.allinpay.provider.pojo.VO.LinkmanVO;
import com.allinpay.provider.pojo.common.PageResponse;
import com.allinpay.provider.request.LinkmanRequest;
import com.allinpay.provider.request.PageRequest;
import com.allinpay.provider.service.ICustomerService;
import com.allinpay.provider.service.ILinkmanService;
import com.allinpay.provider.utils.CommUtils;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LinkmanServiceImpl extends ServiceImpl<LinkmanMapper,Linkman> implements ILinkmanService {

    private static final Logger logger= LoggerFactory.getLogger(LinkmanServiceImpl.class);

    @Autowired
    private ICustomerService customerService;

    @Override
    public PageResponse queryLinkmanList(PageRequest pageRequest, LinkmanRequest request) {

        //分页参数
        Page<Linkman> pageInfo=new Page<>(pageRequest.getPageNo(),pageRequest.getPagSize());

        //设置查询条件
        QueryWrapper<Linkman> wrapper=new QueryWrapper<>();
        wrapper.lambda().eq(CommUtils.isNotEmpty(request.getLinkNo()),Linkman::getLinkNo,request.getLinkNo())
                .like(CommUtils.isNotEmpty(request.getLinkName()),Linkman::getLinkName,request.getLinkName());

        IPage<Linkman> page=this.page(pageInfo,wrapper);
        List<Linkman> linkmanList=page.getRecords();
        ArrayList<LinkmanVO> arrayList=new ArrayList<>();

        linkmanList.forEach(temp -> {
            LinkmanVO linkmanVO=new LinkmanVO();
            BeanUtils.copyProperties(temp,linkmanVO);
            linkmanVO.setLinkCuName(customerService.getById(temp.getLinkCuNo()).getCuName());
            arrayList.add(linkmanVO);
        });
        logger.info("queryLinkmanList  arrayList :{}",arrayList.toArray());

        PageResponse pageResponse=new PageResponse<>();
        pageResponse.setPageNo(pageInfo.getCurrent());
        pageResponse.setPageSize(pageInfo.getSize());
        pageResponse.setTotal(page.getTotal());
        pageResponse.setDataList(arrayList);
        return pageResponse;
    }
}

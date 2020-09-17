package com.allinpay.provider.service.impl;

import com.allinpay.provider.mapper.CustomerMapper;
import com.allinpay.provider.pojo.Customer;
import com.allinpay.provider.service.ICustomerService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl extends ServiceImpl<CustomerMapper, Customer> implements ICustomerService {
}

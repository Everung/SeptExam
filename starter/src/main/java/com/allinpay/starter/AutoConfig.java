package com.allinpay.starter;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AutoConfig {

    private static final Logger logger= LoggerFactory.getLogger(AutoConfig.class);

    /**
     * 分页插件
     * @return
     */
    @Bean
    public PaginationInterceptor paginationInterceptor(){
        final PaginationInterceptor paginationInterceptor=new PaginationInterceptor();
        logger.info("paginationInterceptor : {}",paginationInterceptor);
        return paginationInterceptor;
    }

}

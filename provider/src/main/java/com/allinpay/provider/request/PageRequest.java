package com.allinpay.provider.request;

import lombok.Data;

@Data
public class PageRequest {
    /**
     * 默认页码为0
     */
    private Long pageNo=0L;
    /**
     * 默认页大小为5
     */
    private Long pagSize=5L;
}

package com.allinpay.provider.pojo.common;

import lombok.Data;

import java.util.List;

/**
 * 分页返回
 * @param <T>
 */
@Data
public class PageResponse<T> {

    /**
     * 页大小
     */
    private long pageSize;
    /**
     * 页码
     */
    private long pageNo;
    /**
     * 总数
     */
    private long total;
    /**
     * 数据
     */
    private List<T> dataList;
}

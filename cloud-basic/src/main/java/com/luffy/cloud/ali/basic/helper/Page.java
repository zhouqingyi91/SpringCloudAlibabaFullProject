package com.luffy.cloud.ali.basic.helper;

import com.luffy.cloud.ali.basic.data.Pageable;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 分页
 * @author luffy
 */
@Data
@NoArgsConstructor
public class Page<T> implements Serializable {

    private static final long serialVersionUID = 4964935815824605803L;

    public Page(List<T> dataList, Pageable pageable, long count) {
        this.dataList = dataList;
        this.totalElements = count;
        this.pageNumber = pageable.getPageNumber();
        this.pageSize = pageable.getPageSize();
    }


    private List<T> dataList;

    private long totalElements;

    private int pageNumber;

    private int pageSize;

    public boolean isLast() {
        return !hasNext();
    }

    public boolean isFirst(){
        return totalElements==0 || pageNumber == 1;
    }

    public boolean hasNext() {
        return pageNumber < getTotalPages();
    }

    public int getTotalPages(){
        return pageSize == 0 ? 1 : (int) Math.ceil((double) totalElements / (double) pageSize);
    }

    public static class EmptyPage<T> extends Page<T>{

        private static final long serialVersionUID = 2197386181275765344L;

        public EmptyPage(Pageable pageable) {
            super(new ArrayList<>(),pageable,0);
        }
    }
}
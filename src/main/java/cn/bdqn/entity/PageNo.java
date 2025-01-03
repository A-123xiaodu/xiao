package cn.bdqn.entity;

import java.util.List;

public class PageNo {
    private Integer currPageNo;
    private Integer pageSize;
    private Integer totalPageCount;
    private Integer totalCount;
    private List<Smove> SmoveList;

    public Integer getCurrPageNo() {
        return currPageNo;
    }

    public void setCurrPageNo(Integer currPageNo) {
        this.currPageNo = currPageNo;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getTotalPageCount() {
        return totalPageCount;
    }

    public void setTotalPageCount(Integer totalPageCount) {
        this.totalPageCount = totalPageCount;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<Smove> getSmoveList() {
        return SmoveList;
    }

    public void setSmoveList(List<Smove> smoveList) {
        SmoveList = smoveList;
    }
}

package entity;

import java.util.List;

/**
 * @User 分页数据的访问数据
 * @ClassName PageResult  类名
 * @Author Administrator  作者
 * @Date 2020-05-08 14:25  时间
 * @Version 1.0 版本
 */
public class PageResult<T> {
    private Long total;
    private List<T> rows;

    public PageResult(Long total, List<T> rows) {
        super();
        this.total = total;
        this.rows = rows;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }
}

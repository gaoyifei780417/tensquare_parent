package com.bwei.qa.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @User feifei
 * @ClassName Pl  类名
 * @Author Administrator  作者
 * @Date 2020-05-18 19:32  时间
 * @Version 1.0 版本
 */
@Entity
@Table(name = "tb_pl")
public class Pl implements Serializable {
    @Id
    private String problemid;
    @Id
    private String labelid;

    public String getProblemid() {
        return problemid;
    }

    public void setProblemid(String problemid) {
        this.problemid = problemid;
    }

    public String getLabelid() {
        return labelid;
    }

    public void setLabelid(String labelid) {
        this.labelid = labelid;
    }
}

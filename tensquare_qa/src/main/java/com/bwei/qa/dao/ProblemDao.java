package com.bwei.qa.dao;

import com.bwei.qa.pojo.Problem;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

/**
 * 数据访问接口
 * @author Administrator
 *
 */
public interface ProblemDao extends JpaRepository<Problem,String>,JpaSpecificationExecutor<Problem>{
    /**
     * 根据标签id查询标签列表
     * select p.* from tb_problem p where id in(select problemid from tb_pl where labelid='1') order by p.replyid desc
     * @param labelId
     * @param pageable
     * @return
     */
    @Query("select p from Problem p where id in(select problemid from Pl where labelid=?1)order by replytime desc ")
    public Page<Problem> findNewListByLabelId(String labelid, Pageable pageable);

    @Query(value = "SELECT p.* FROM tb_problem p where id in(SELECT problemid from tb_pl where labelid='1') ORDER BY p.reply DESC",nativeQuery = true)
    public Page<Problem> findHotListByLabelId(String labelid,Pageable pageable);

    /**
     * 等待问答列表
     * @param labelid
     * @param pageable
     * @return
     */
    @Query("select p from Problem p where id in(select problemid from Pl where labelid=?1) and reply=0 order by createtime desc ")
    public Page<Problem> findWaitListByLabelId(String labelid, Pageable pageable);

}

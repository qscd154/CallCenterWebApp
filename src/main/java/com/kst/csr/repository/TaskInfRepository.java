package com.kst.csr.repository;

import com.kst.csr.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskInfRepository extends JpaRepository<Task, Long> {

    @Query("SELECT t FROM Task t " +
            "WHERE (:regDt IS NULL OR t.regDt = :regDt) " +
            "AND (:reqNm IS NULL OR t.reqNm LIKE %:reqNm%) " +
            "AND (:state IS NULL OR t.state = :state) " +
            "AND (:head IS NULL OR t.reqInfo LIKE %:head%)")
    List<Task> searchTasks(@Param("regDt") String regDt,
                           @Param("reqNm") String reqNm,
                           @Param("state") String state,
                           @Param("head") String head);
}

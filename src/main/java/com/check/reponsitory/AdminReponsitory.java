package com.check.reponsitory;

import com.check.domain.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * com.check.reponsitory
 *
 * 2017/9/21-21:24
 * 2017
 * Created by wuqiang on 2017/9/21.
 */
@Repository
public interface AdminReponsitory extends JpaRepository<Admin,Integer> {
    Admin findByUsernameAndPassword(String username,String password);
}

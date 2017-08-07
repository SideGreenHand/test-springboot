package cn.com.testspringboot.domain.dao;

import cn.com.testspringboot.domain.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by jiaoW on 2017/8/6.
 */
public interface StudentDao extends JpaRepository<Student,Integer> {
    Student findByName(String name);
}

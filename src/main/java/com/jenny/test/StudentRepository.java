package com.jenny.test;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: Jinzhenzhen
 * @Data 19-6-14 下午2:16
 */
public interface StudentRepository extends JpaRepository<Student, Integer> {
}

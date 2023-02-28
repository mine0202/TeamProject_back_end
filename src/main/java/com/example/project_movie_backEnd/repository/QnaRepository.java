package com.example.project_movie_backEnd.repository;


import com.example.project_movie_backEnd.model.Qna;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * packageName : com.example.jpaexam.repository
 * fileName : DeptRepository
 * author : ds
 * date : 2022-10-20
 * description : JPA CRUD를 위한 인터페이스(==DAO)
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-20         ds          최초 생성
 */

@Repository
public interface QnaRepository extends JpaRepository<Qna, Integer> {
    //    title로(title) 조회하는 like 검색 함수
//    1) 쿼리메소드 방식으로 함수 정의
    Page<Qna> findAllBySubjectContainingOrderByQidDesc(String subject, Pageable pageable);
    Page<Qna> findAllByWriterAndSubjectContainingOrderByQidDesc(Integer writer,String subject, Pageable pageable);

}










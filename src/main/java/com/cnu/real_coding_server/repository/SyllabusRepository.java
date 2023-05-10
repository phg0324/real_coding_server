package com.cnu.real_coding_server.repository;

import com.cnu.real_coding_server.entity.Syllabus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SyllabusRepository extends JpaRepository<Syllabus, Integer>  {
//    Syllabus save( Syllabus post);
//    List< Syllabus> findAll();
//    Optional< Syllabus> findById(Integer  syllabusId);
//    void delete( Syllabus  syllabusId);
}

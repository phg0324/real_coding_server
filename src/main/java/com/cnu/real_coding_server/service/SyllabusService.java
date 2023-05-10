package com.cnu.real_coding_server.service;

import com.cnu.real_coding_server.entity.Syllabus;
import com.cnu.real_coding_server.model.request.SyllabusRequest;
import com.cnu.real_coding_server.repository.SyllabusRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SyllabusService {
    private final SyllabusRepository syllabusRepository;

    public Syllabus createSyllabus(SyllabusRequest syllabusRequest) {
        return syllabusRepository.save(syllabusRequest.toEntity());
    }
    public List<Syllabus> getSyllabuss(){
        return syllabusRepository.findAll();
    }
    public Optional<Syllabus> getSyllabus(Integer syllabusId){
        return syllabusRepository.findById(syllabusId);
    }

    public void deleteSyllabus(Integer syllabusId){
        syllabusRepository.findById(syllabusId)
                .ifPresent(syllabusRepository::delete);
    }
}

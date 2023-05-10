package com.cnu.real_coding_server.controller;

import com.cnu.real_coding_server.entity.Project;
import com.cnu.real_coding_server.entity.Syllabus;
import com.cnu.real_coding_server.model.request.ProjectRequest;
import com.cnu.real_coding_server.model.request.SyllabusRequest;
import com.cnu.real_coding_server.service.ProjectService;
import com.cnu.real_coding_server.service.SyllabusService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/syllabuss")
@RequiredArgsConstructor
public class SyllabusController {

    private final SyllabusService syllabusService;
    @PostMapping
    public ResponseEntity<Syllabus> createSyllabus(@RequestBody SyllabusRequest syllabusRequest){
        return ResponseEntity.ok(syllabusService.createSyllabus(syllabusRequest));
    }
    @GetMapping
    public ResponseEntity<List<Syllabus>> getSyllabuss(){
        return ResponseEntity.ok(syllabusService.getSyllabuss());
    }
    @GetMapping("/{syllabusId}")
    public ResponseEntity<Syllabus> getSyllabus(@PathVariable("syllabusId") Integer syllabusId){
        return ResponseEntity.ok(syllabusService.getSyllabus(syllabusId).orElse(null));
    }
    @PutMapping("/{syllabusId}")
    public ResponseEntity<Syllabus> updateSyllabus(@PathVariable("syllabusId") Integer syllabusId,
                                                 @RequestBody SyllabusRequest syllabusRequest){
        return ResponseEntity.ok(syllabusService.updateSyllabus(syllabusId,syllabusRequest).orElse(null));
    }
    @DeleteMapping("/{syllabusId}")
    public ResponseEntity<Void> deleteSyllabus(@PathVariable("syllabusId") Integer syllabusId){
        syllabusService.deleteSyllabus(syllabusId);
        return ResponseEntity.noContent().build();
    }


}

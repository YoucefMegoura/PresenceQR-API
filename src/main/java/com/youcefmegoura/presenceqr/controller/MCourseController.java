package com.youcefmegoura.presenceqr.controller;

import com.youcefmegoura.presenceqr.model.MCourse;
import com.youcefmegoura.presenceqr.service.MCourseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/courses")
public class MCourseController {

    @Autowired
    private MCourseService mCourseService;

    @GetMapping
    public List<MCourse> findAll() {
        return mCourseService.findAll();
    }

    @GetMapping("/{id}")
    public MCourse findById(@PathVariable Long id) {
        return mCourseService.findById(id);
    }

    @PostMapping
    public MCourse save(@RequestBody MCourse mCourse) {
        return mCourseService.save(mCourse);
    }

    @PutMapping
    public MCourse update(@RequestBody MCourse mCourse) {
        return mCourseService.save(mCourse);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        mCourseService.deleteById(id);
    }
}



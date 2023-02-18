package com.youcefmegoura.presenceqr.controller;

import com.youcefmegoura.presenceqr.model.MCourse;
import com.youcefmegoura.presenceqr.service.MCourseService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author youcefmegoura
 * @created 11/02/2023
 */

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/courses")
public class MCourseController {

    private final MCourseService mCourseService;

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



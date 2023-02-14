package com.youcefmegoura.presenceqr.service.implementation;

import java.util.List;

import com.youcefmegoura.presenceqr.service.MCourseService;
import com.youcefmegoura.presenceqr.model.MCourse;
import com.youcefmegoura.presenceqr.repository.MCourseRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * @author youcefmegoura
 * @created 11/02/2023
 */

@Slf4j
@Service
@Transactional
@RequiredArgsConstructor
public class MCourseServiceImpl implements MCourseService {
    //TODO:: add logger

    private MCourseRepository mCourseRepository;

    @Override
    public List<MCourse> findAll() {
        return mCourseRepository.findAll();
    }

    @Override
    public MCourse findById(Long id) {
        return mCourseRepository.findById(id).orElse(null);
    }

    @Override
    public MCourse save(MCourse mCourse) {
        return mCourseRepository.save(mCourse);
    }

    @Override
    public void deleteById(Long id) {
        mCourseRepository.deleteById(id);
    }
}

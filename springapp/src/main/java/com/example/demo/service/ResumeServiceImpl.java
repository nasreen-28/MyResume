package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Resume;
import com.example.demo.repo.ResumeRepository;

@Service
public class ResumeServiceImpl implements ResumeService{

    @Autowired
    private ResumeRepository resumeRepository;

    @Override
    public Resume getResume() {
        
        return resumeRepository.findAll().get(0);
    }

    @Override
    public Resume postResume(Resume resume) {
        return resumeRepository.save(resume);
    }
    
}

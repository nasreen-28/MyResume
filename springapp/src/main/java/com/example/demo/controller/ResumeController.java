package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Resume;
import com.example.demo.service.ResumeService;

@RestController
@CrossOrigin("*")
public class ResumeController {
    @Autowired
    ResumeService resumeService;
    @GetMapping("/getResume")
    public Resume getResume()
    {
        return resumeService.getResume();
    }

    @PostMapping("/postResume")
    public Resume postResume(@RequestBody Resume resume)
    {
        return resumeService.postResume(resume);
    }
}

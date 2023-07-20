package com.springbootuploadcsvfile.SpringBootUploadCSVfile.service;

import com.springbootuploadcsvfile.SpringBootUploadCSVfile.Model.Tutorial;
import com.springbootuploadcsvfile.SpringBootUploadCSVfile.helper.CSVHelper;
import com.springbootuploadcsvfile.SpringBootUploadCSVfile.repository.TutorialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.ByteArrayInputStream;
import java.util.List;

@Service
public class CSVService {
    @Autowired
    TutorialRepository repository;

    public ByteArrayInputStream load() {
        List<Tutorial> tutorials = repository.findAll();

        ByteArrayInputStream in = CSVHelper.tutorialsToCSV(tutorials);
        return in;
    }
}

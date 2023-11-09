package com.example.assignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UploadService {
    @Autowired
    private UploadsRepository repo;
    public List<Uploads> getAllData(){
        return  repo.findAll();
    }
    public void deleteAllData() {
        repo.deleteAll();
    }

    public List<Uploads>findByName(String name){
        List<Uploads>response=repo.findByName(name);
        return response;
//        return response.stream().map(Uploads::getName).distinct().collect(Collectors.toList());

    }
}

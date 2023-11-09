package com.example.assignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api")
public class UploadsController {
    @Autowired
    private UploadService service;

    private UploadsRepository repo;
    @Autowired
    public UploadsController(UploadsRepository repo){
        this.repo=repo;
    }
    @GetMapping("/getallData")
    public ResponseEntity<List<Uploads>> getallData(){
        return new ResponseEntity<List<Uploads>>(service.getAllData(),HttpStatus.OK);
    }
    @GetMapping("/product/{name}")
    public ResponseEntity<List<Uploads>>getDataByName(@PathVariable String name){
        return new ResponseEntity<List<Uploads>>(service.findByName(name),HttpStatus.OK);

    }
    @PostMapping("/upload/data")
    public String uploadData(@RequestBody Uploads upload){
        repo.save(upload);
        return "Data added uploaded";
    }
    @DeleteMapping("/deleteAll")
    public ResponseEntity<String> deleteAllData() {
        service.deleteAllData();
        return new ResponseEntity<>("All data deleted successfully", HttpStatus.OK);
    }

}

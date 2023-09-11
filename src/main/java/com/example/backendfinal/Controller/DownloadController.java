package com.example.backendfinal.Controller;

import com.example.backendfinal.Model.Bookmark;
import com.example.backendfinal.Model.Download;
import com.example.backendfinal.repo.Bookmarkrepo;
import com.example.backendfinal.repo.Downloadrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/download")
public class DownloadController {


        @Autowired
        Downloadrepo downloadrepo;

        @GetMapping("/getall")
        @CrossOrigin(origins = "http://localhost:4200")
        public ResponseEntity<List<Download>> getAlldownloads()
        {
            return ResponseEntity.ok(downloadrepo.findAll());
        }
    }


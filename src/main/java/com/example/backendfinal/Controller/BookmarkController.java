package com.example.backendfinal.Controller;

import com.example.backendfinal.Model.Bookmark;
import com.example.backendfinal.Model.User;
import com.example.backendfinal.repo.Bookmarkrepo;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/bookmark")
public class BookmarkController
{
    @Autowired
    Bookmarkrepo bookmarkrepo;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/getall")
    public ResponseEntity<List<Bookmark>> getAllbookmarks()
    {
        return ResponseEntity.ok(bookmarkrepo.findAll());
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/addbookmark")
    public boolean bookmarkvideo(@RequestBody Bookmark bookmark)
    {
        for( Bookmark n:bookmarkrepo.findAll()){
            bookmark.setId(n.getId()+1);
        }
        boolean answer=false;
        for(Bookmark n:bookmarkrepo.findAll())
        {
            if(n.getId()==bookmark.getId())
            {
                answer=true;
                break;
            }
            else
            {
                answer=false;
            }
        }
        if(answer)
        {
            bookmarkrepo.deleteById(bookmark.getId());
        }
        else
        {
            bookmarkrepo.save(bookmark);
        }
        return true;
    }

}

package com.example.jayant.student.Controller;

import com.example.jayant.student.Service.DetailService;
import com.example.jayant.student.User.User;
import com.example.jayant.student.User.UserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/upi")
public class DetailsController {

    private final DetailService detailservice;

    @Autowired
    public DetailsController(DetailService detailservice) {
        this.detailservice = detailservice;
    }

    @GetMapping
    public List<UserDetails> getUser()
    {
        System.out.println(detailservice.getUser());
        return detailservice.getUser();

    }



    @PostMapping("/save")
    public UserDetails registerNewUser(@RequestBody UserDetails user)
    {

        detailservice.addNewUser(user);
        return user;
    }

    @DeleteMapping(path="{userid}")
    public int deleteUser(@PathVariable ("userid") int userid)
    {
        detailservice.deleteUser(userid);
        return userid;


    }

    @PostMapping("/post")
    public UserDetails updateUser(@RequestBody UserDetails user)
    {
        detailservice.updateUser(user);
        return user;
    }

}


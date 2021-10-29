package com.example.jayant.student.Controller;

import com.example.jayant.student.User.User;
import com.example.jayant.student.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

  @RestController
    @RequestMapping("/api")
    public class UserController {

        private final UserService userservice;

        @Autowired
        public UserController(UserService userservice) {
            this.userservice = userservice;
        }

        @GetMapping
        public List<User> getUser()
        {
            System.out.println(userservice.getUser());
            return userservice.getUser();

        }



            @PostMapping("/save")
        public User registerNewUser(@RequestBody User user)
        {

            userservice.addNewUser(user);
            return user;
        }

        @DeleteMapping(path="{userid}")
        public int deleteUser(@PathVariable ("userid") int userid)
        {
            userservice.deleteUser(userid);
            return userid;


        }

        @PostMapping("/post")
        public User updateUser(@RequestBody User user)
        {
            userservice.updateUser(user);
            return user;
        }

    }



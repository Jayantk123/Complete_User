package com.example.jayant.student.Service;

import com.example.jayant.student.Repo.DetailRepo;
import com.example.jayant.student.Repo.UserRepo;
import com.example.jayant.student.User.User;
import com.example.jayant.student.User.UserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetailService {


    private final DetailRepo detailrepo;

    @Autowired
    public DetailService(DetailRepo detailrepo) {
        this.detailrepo = detailrepo;
    }

    public List<UserDetails> getUser()
    {
        return detailrepo.findAll();   //return list
    }

    public void addNewUser(UserDetails user) {
//      Optional<Student> studentByEmail= StudentRepo.findStudentByEmail(student.getEmail());
//      if(studentByEmail.isPresent())
//      {
//          throw new IllegalStateException("email taken");
//      }
        detailrepo.save(user);
        System.out.println(user);
    }



    public int deleteUser(int userid) {

        boolean exist = detailrepo.existsById(userid);

        if(!exist)
        {
            throw new IllegalStateException("student id"+userid+"not exist");
        }

        detailrepo.deleteById(userid);
        return userid;

    }


    public UserDetails updateUser(UserDetails user) {

        int idv=user.getId();
        boolean existf = detailrepo.existsById( idv);

        if(!existf)
        {
            throw new IllegalStateException(idv+"not exist");
        }

        detailrepo.save(user);
        return user;

    }
}

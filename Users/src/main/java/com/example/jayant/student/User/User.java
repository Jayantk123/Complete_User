package com.example.jayant.student.User;
import javax.persistence.OneToMany;
import javax.persistence.*;
//import java.util.HashSet;
import java.util.Set;
import java.util.List;


@Entity
@Table(name = "user")
public class User   {

//    @Id
//    @SequenceGenerator(
//            name="user_sequence",
//            sequenceName ="user_sequence",
//            allocationSize = 1
//    )
//
//    @GeneratedValue(
//            strategy = GenerationType.SEQUENCE,
//            generator = "user_sequence"
//    )

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "FIRST_NAME")
    private String firstname;
    @Column(name = "LAST_NAME")
    private String lastname;
    @Column(name = "EMAIL_ID")
    private String email;
    @Column(name = "MOBILE")
    private String mobile;
//    private Set<UserDetails> userdetails = new HashSet<UserDetails>(0);

    @OneToMany(mappedBy ="user" ,fetch = FetchType.LAZY)
    List<UserDetails> userdetails;


//    public Set<UserDetails> userdetails()
//    {
//        return this.userdetails;
//    }

    public User()
    {

    }

//    public User(int id, String firstname, String lastname, String email, String address, long pincode) {
//        this.id = id;
//        this.firstname = firstname;
//        this.lastname = lastname;
//        this.email = email;
//        this.address = address;
//        this.pincode = pincode;
//    }


    public List<UserDetails> getUserdetails() {
        return userdetails;
    }

    public void setUserdetails(List<UserDetails> userdetails) {
        this.userdetails = userdetails;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMoble(String address) {
        this.mobile = mobile;
    }




    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +

                '}';
    }
}

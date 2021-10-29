package com.example.jayant.student.User;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.sql.Timestamp;


@Entity
@Table(name = "userdetails")
public class UserDetails {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


//    @Column(name = "USER_ID")
//    private int userid;
    @Column(name = "ADDRESS_TYPE")
    private String addresstype;
    @Column(name = "ADDRESS")
    private String address;
    @Column(name = "LOCALITY")
    private String locality;
    @Column(name = "CITY")
    private String city;
    @Column(name = "STATE")
    private String state;
    @Column(name = "CREATED_DATE")
    private Timestamp date;


    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="user_id", nullable=false)
    private User user;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

//    public int getUserid() {
//        return userid;
//    }
//
//    public void setUserid(int userid) {
//        this.userid = userid;
//    }

    public String getAddresstype() {
        return addresstype;
    }

    public void setAddresstype(String addresstype) {
        this.addresstype = addresstype;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }


    @Override
    public String toString() {
        return "UserDetails{" +
                "id=" + id +
//                ", userid=" + userid +
                ", addresstype='" + addresstype + '\'' +
                ", address='" + address + '\'' +
                ", locality='" + locality + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", date=" + date +
                '}';
    }
}



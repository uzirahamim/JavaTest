package com.example.demo.model;

import jdk.nashorn.internal.ir.annotations.Immutable;
import org.hibernate.usertype.UserType;

import javax.persistence.*;

@Entity
@Table(name="users")
@Immutable
public class User {
    @Id
    @Column(name="user_id")
    private String id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="can_access_global_context")
    private boolean canAccessGlobalContext;

    @Column(name="can_view_any_device")
    private boolean canViewAnyDevice;

    @Column(name = "first_login")
    private Boolean firstLogin;

//    @ManyToOne(fetch= FetchType.EAGER)
//    @JoinColumn(name="user_type_id")
//    private UserType userType;

    @Column(name = "date_format")
    private String dateFormat;

    @Column(name = "email_address")
    private String emailAddress;


    @Column(name="modified_color")
    private String modifiedColor;

    @Column(name="deleted_color")
    private String deletedColor;

    @Column(name="inserted_color")
    private String insertedColor;

    @Column(name="inner_modified_color")
    private String innerModifiedColor;

    @Column(name="show_all_objects")
    private Boolean showAllObjects;

    @Column(name="recent_revisions_period")
    private String recentRevisionsPeriod;

    @Column(name="device_default_view")
    private String deviceDefaultView;

//    @Column(name="user_login_type")
//    @Enumerated(EnumType.STRING)
//    private UserLoginType userLoginType = UserLoginType.local;


}

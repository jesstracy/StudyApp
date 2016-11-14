package com.example;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by jessicatracy on 11/12/16.
 */
@RestController
public class JSONController {

    @RequestMapping(path = "register.json", method = RequestMethod.POST)
    public void register(@RequestBody User newUser) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:h2:./main");
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO users VALUES (NULL, ?, ?, ?, ?)");
            stmt.setString(1, newUser.getFirstName());
            stmt.setString(2, newUser.getLastName());
            stmt.setString(3, newUser.getEmail());
            stmt.setString(4, newUser.getPassword());
            stmt.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}

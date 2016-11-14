package com.example;

import org.h2.tools.Server;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by jessicatracy on 11/12/16.
 */
@org.springframework.stereotype.Controller
public class Controller {
    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String login(){
        try {
            Server.createWebServer().start();

            Connection conn = DriverManager.getConnection("jdbc:h2:./main");
            Statement stmt = conn.createStatement();
            stmt.execute("CREATE TABLE IF NOT EXISTS users (id IDENTITY, first_name VARCHAR, last_name VARCHAR, email VARCHAR, password VARCHAR)");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return "login";
    }
}

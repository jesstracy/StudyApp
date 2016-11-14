package com.example;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jessicatracy on 11/12/16.
 */
@RestController
public class JSONController {
    @RequestMapping(path = "register.json", method = RequestMethod.POST)
    public void register(@RequestBody User newUser) {

    }
}

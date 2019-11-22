package app.controllers;

import app.dto.UsersDTO;
import app.services.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class MyController {

    @Autowired
    private MyService myService;

    @RequestMapping(value = "/v1/getUsers", method = RequestMethod.GET, headers = "Accept=application/json")
    public UsersDTO getUsers() {
        return new UsersDTO(myService.getUsers());

    }
}

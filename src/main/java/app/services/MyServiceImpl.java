package app.services;

import org.springframework.stereotype.Service;

@Service
public class MyServiceImpl implements MyService {

    @Override
    public String getUsers() {
        return "test1";
    }

}

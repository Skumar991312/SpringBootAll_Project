package in.sandeep.Service;

import org.springframework.stereotype.Component;

import java.lang.reflect.Constructor;

@Component
public class UserService {

    public UserService() {
        System.out.println("UserService :: constructor");

    }
}

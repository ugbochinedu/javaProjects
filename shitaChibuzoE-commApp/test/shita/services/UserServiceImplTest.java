package shita.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import shita.data.model.User;
import shita.dto.requests.RegisterUserRequest;
import shita.dto.responses.RegisterUserResponse;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserServiceImplTest {

    private UserService userService;

    @BeforeEach

    public void setUp(){
        userService = new UserServiceImpl();
    }

    @Test
    public void registerUserTest() {
        RegisterUserRequest request = new RegisterUserRequest();
        request.setPhoneNumber("07035137163");
        request.setAddress("address");
        request.setEmail("email");
        request.setFirstName("firstname");
        request.setLastName("lastname");

        RegisterUserResponse user = userService.registerNewUser(request);
        assertEquals(1, user.getId());
        User foundUser = userService.findUser(1);
        assertEquals(user, foundUser);
    }

}
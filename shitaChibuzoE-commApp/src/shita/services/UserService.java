package shita.services;

import shita.data.model.User;
import shita.dto.requests.RegisterUserRequest;
import shita.dto.responses.RegisterUserResponse;

public interface UserService {

    RegisterUserResponse registerNewUser(RegisterUserRequest request);

    User findUser(int id);
}

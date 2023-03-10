package services;

import data.model.User;
import dto.requests.RegisterUserRequest;

public interface UserService {

    User registerNewUser(RegisterUserRequest request);
    User findUser(int id);
}

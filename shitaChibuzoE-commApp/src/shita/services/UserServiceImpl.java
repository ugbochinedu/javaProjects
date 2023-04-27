package shita.services;

import shita.data.model.User;
import shita.data.repositories.UserRepository;
import shita.data.repositories.UserRepositoryImpl;
import shita.dto.requests.RegisterUserRequest;
import shita.dto.responses.RegisterUserResponse;
import shita.utils.Mapper;

public class UserServiceImpl implements UserService{
    //private RegisterUserRequest userRepository;
    UserRepository userRepository = new UserRepositoryImpl();

    @Override
    public RegisterUserResponse registerNewUser(RegisterUserRequest request) {
        User user = Mapper.map(request);
        User savedUser = userRepository.save(user);

        return Mapper.map(savedUser);
    }

    @Override
    public User findUser(int id) {
        return userRepository.findById(id);
    }
}

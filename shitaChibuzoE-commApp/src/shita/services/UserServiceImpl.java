package shita.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shita.data.model.User;
import shita.data.repositories.UserRepository;
import shita.dto.requests.RegisterUserRequest;
import shita.dto.responses.RegisterUserResponse;
import shita.utils.Mapper;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;

    @Override
    public RegisterUserResponse registerNewUser(RegisterUserRequest request) {
        User user = Mapper.map(request);
        User savedUser = userRepository.save(user);

        return Mapper.map(savedUser);
    }

    @Override
    public User findUser(String id) {
        var user = userRepository.findById(id);
        if (user.isEmpty()) throw new IllegalArgumentException("User does not exist");
        return userRepository.findById(id).get();
    }
}

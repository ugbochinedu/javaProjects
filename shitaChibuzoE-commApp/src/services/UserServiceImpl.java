package services;

import data.model.User;
import data.repositories.UserRepository;
import data.repositories.UserRepositoryImpl;
import dto.requests.RegisterUserRequest;

public class UserServiceImpl implements UserService{
    //private RegisterUserRequest userRepository;
    UserRepository userRepository = new UserRepositoryImpl();
    @Override
    public User registerNewUser(RegisterUserRequest request) {
        User newUser = new User();
        newUser.setFirstName(request.getFirstname());
        newUser.setLastName(request.getLastname());
        newUser.setEmail(request.getEmail());
        newUser.setAddress(request.getAddress());
        newUser.setPhoneNumber(request.getPhoneNumber());

        return userRepository.save(newUser);
    }

    @Override
    public User findUser(int id) {
        return userRepository.findById(id);
    }
}

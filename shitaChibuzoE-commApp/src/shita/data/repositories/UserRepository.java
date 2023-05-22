package shita.data.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import shita.data.model.User;

public interface UserRepository extends MongoRepository<User, String> {

}

package data.repositories;

import data.model.Package;
import data.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepositoryImpl implements UserRepository{
    private int lastIdCreated;
    private List<User> users = new ArrayList<>();
    @Override
    public User save(User aUser) {
        boolean isSaved = aUser.getId() != 0;
        if (isSaved) update(aUser); else saveNewUser(aUser);

        return aUser;
    }
    private void update(User aUser) {
//        Package savedPackage = findById(aPackage.getId());
//        int indexOfSavedPackage = packages.indexOf(savedPackage);
//        packages.set(indexOfSavedPackage,aPackage);

//        Package savedPackage = findById(aPackage.getId());
//        packages.remove(savedPackage);
        delete(aUser.getId());
        users.add(aUser);
    }

    private void saveNewUser(User aUser){
        users.add(aUser);
        aUser.setId(generateUserId());
        lastIdCreated++;
    }

    @Override
    public User findById(int id) {
        for (User aUser: users) if(aUser.getId() == id) return aUser;
        return null;
    }

    private int generateUserId() {
        return lastIdCreated+1;
    }

    @Override
    public void delete(User aUser) {
        users.remove(aUser);
    }

    @Override
    public void delete(int id) {
        User foundUser = findById(id);
        delete(foundUser);
    }

    @Override
    public List<User> findAll() {
        return users;
    }


    @Override
    public long count() {
        return lastIdCreated;
    }
}



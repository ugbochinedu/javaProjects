package data.repositories;

import data.model.Package;

import java.util.ArrayList;
import java.util.List;

public class PackageRepositoryImpl implements PackageRepository{

    private int lastIdCreated;
    private List<Package> packages = new ArrayList<>();

    @Override
    public Package save(Package aPackage) {
        boolean isSaved = aPackage.getId() != 0;
        if (isSaved) update(aPackage); else saveNewPackage(aPackage);
        return aPackage;
    }
    private void update(Package aPackage) {
//        Package savedPackage = findById(aPackage.getId());
//        int indexOfSavedPackage = packages.indexOf(savedPackage);
//        packages.set(indexOfSavedPackage,aPackage);

//        Package savedPackage = findById(aPackage.getId());
//        packages.remove(savedPackage);
        delete(aPackage.getId());
        packages.add(aPackage);
    }

    private void saveNewPackage(Package aPackage){
        packages.add(aPackage);
        aPackage.setId(generatePackageId());
        lastIdCreated++;
    }

    @Override
    public Package findById(int id) {
        for (Package aPackage: packages) if(aPackage.getId() == id) return aPackage;
        return null;

    }

    private int generatePackageId() {
        return lastIdCreated+1;
    }

    @Override
    public void delete(Package aPackage) {
        packages.remove(aPackage);
    }

    @Override
    public void delete(int id) {
        Package foundPackage = findById(id);
        delete(foundPackage);
    }

    @Override
    public List<Package> findAll() {
        return packages;
    }


    @Override
    public long count() {
        return lastIdCreated;
    }
}

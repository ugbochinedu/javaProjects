package shita.data.repositories;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import shita.data.model.Package;

import static org.junit.jupiter.api.Assertions.*;

class PackageRepositoryImplTest {

    private PackageRepository packageRepository;

    @BeforeEach
    public  void setUp(){
        packageRepository = new PackageRepositoryImpl();
    }

    @Test
    @DisplayName("Create new Package Test")
    public void saveOnePackage_countIsOneTest(){
        Package aPackage = new Package();
        assertEquals(0, packageRepository.count());

        packageRepository.save(aPackage);
        assertEquals(1, packageRepository.count());
    }

    @Test
    @DisplayName("Generate ID Test")
    public void saveOnePackage_IdIsOneTest(){
        Package aPackage = new Package();
        assertEquals(0, aPackage.getId());
        Package savedPackage = packageRepository.save(aPackage);
        assertEquals(1, savedPackage.getId());
    }

    @Test
    @DisplayName("Find by Id test")
    public void saveOnePackage_findPackageById_returnsSavedPackageTest(){
        Package aPackage = new Package();
        aPackage.setPayOnDelivery(true);
        packageRepository.save(aPackage);
        Package foundPackage = packageRepository.findById(1);
        assertEquals(1, foundPackage.getId());
        assertTrue(foundPackage.isPayOnDelivery());
        assertEquals(aPackage, foundPackage);
    }

    @Test
    @DisplayName("Update test ")
    public void saveTwoItemsWithSameId_countIsOneTest(){
        Package aPackage = new Package();
        aPackage.setWeightInGrammes(34);
        packageRepository.save(aPackage);
        Package savedAPackage = packageRepository.findById(1);
        assertEquals(aPackage, savedAPackage);

        Package secondPackage = new Package();
        secondPackage.setId(1);
        aPackage.setWeightInGrammes(22);

        packageRepository.save(secondPackage);
        Package foundPackage = packageRepository.findById(1);
        assertEquals(foundPackage,secondPackage);
        assertNotEquals(foundPackage, aPackage);
    }

    @Test
    @DisplayName("Delete Test")
    public void deletePackages(){
        Package aPackage = new Package();
        packageRepository.save(aPackage);
        packageRepository.delete(aPackage);
        System.out.println(aPackage.getId());
        assertEquals(0,packageRepository.count());
    }

    @Test
    @DisplayName("find all")
    public void findAll(){
        Package aPackage = new Package();
        packageRepository.save(aPackage);
        Package aPackage1 = new Package();
        packageRepository.save(aPackage1);
        Package aPackage2 = new Package();
        packageRepository.save(aPackage2);
        packageRepository.findAll();

    }
}
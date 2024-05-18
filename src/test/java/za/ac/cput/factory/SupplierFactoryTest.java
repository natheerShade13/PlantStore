package za.ac.cput.factory;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Supplier;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
class SupplierFactoryTest {

    @Test
    void a_buildSupplier() {
        Supplier supplier =  SupplierFactory.buildSupplier("1234","Robert","Ichowa","robertIchowa@gmail.com","0664533023");
        assertNotNull(supplier);
        System.out.println(supplier);
    }

    @Test
    void b_buildSupplierWithFailingNumberPhone() {
        Supplier supplier =  SupplierFactory.buildSupplier("1234","Naruto","Uzumaki","Naruto@gmail.com","0752454543245");
        assertNotNull(supplier);
        System.out.println(supplier);
    }
}
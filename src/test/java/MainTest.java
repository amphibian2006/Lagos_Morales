import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private double[][] datosTesting;

    @BeforeEach
    void setUp() {
        datosTesting = new double[][]{
                {2.5, 3.0, 2.7, 3.8, 4.0, 3.1, 4.6, 2.3, 3.2, 3.1, 2.5, 2.2, 2.5, 3.0, 2.7, 3.8, 4.0, 3.1, 4.5, 2.3, 3.2, 3.1, 2.5, 2.2},
                {4.5, 2.3, 3.2, 3.1, 2.5, 2.2, 2.5, 3.0, 2.7, 3.8, 4.0, 3.1, 2.5, 2.2, 2.5, 3.0, 2.7, 3.8, 2.5, 3.0, 2.7, 3.8, 4.0, 3.1},
                {2.3, 3.2, 3.1, 2.5, 2.2, 2.5, 2.2, 2.5, 3.0, 2.7, 3.8, 2.5, 3.0, 2.7, 3.8, 4.0, 3.1, 3.8, 4.0, 3.1, 4.5, 2.3, 3.2, 2.9},
                {2.5, 3.0, 2.7, 3.8, 4.0, 3.1, 4.5, 2.3, 3.2, 3.1, 2.5, 2.2, 2.5, 2.2, 2.5, 3.0, 2.7, 3.8, 2.7, 3.8, 4.5, 2.3, 3.2, 3.1},
                {3.8, 4.0, 3.1, 4.5, 2.3, 3.2, 2.5, 2.2, 2.5, 3.0, 2.7, 3.8, 4.5, 2.3, 3.2, 3.1, 2.5, 2.2, 2.5, 3.0, 2.7, 3.8, 4.0, 3.1}
        };
    }

    @Test
    public void menuSismosTest(){
        boolean condicion = true;
        Main.menuSismos(datosTesting);
        assertTrue(condicion);
    }

    @AfterEach
    void tearDown() {
    }
}
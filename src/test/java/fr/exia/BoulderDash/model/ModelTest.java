package fr.exia.BoulderDash.model;


import fr.exia.BoulderDash.entity.Map;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;



public class ModelTest {

    private static Map map;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        map = new Map(10,10);

    }

    @Test
    public void getMap() {

    }

    @Test
    public void setMap() {

        map = new Map(10,10);

        assertEquals(this.map, map);

    }

    @Test
    public void loadMap() {
    }

    @Test
    public void getObservable() {

    }

    @Test
    public void setMapNull() {
    }
}

package fr.exia.BoulderDash.controller;




import fr.exia.BoulderDash.entity.Map;
import fr.exia.BoulderDash.entity.mobile.Character;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;



public class BoulderDashControllerTest {


    private static Character characterX;

    private static Map map;
    private static Character character;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        characterX = new Character();
        character = new Character();
        map = new Map(10,10);
    }


    @Test
    public void orderPerform() {

        int heroX = 1;
        int heroY = 1;
        BoulderDashControllerTest.map.goesUP(heroX+0, heroY+1);
        BoulderDashControllerTest.map.hasChanged();
        equals(BoulderDashControllerTest.map.characterGoesUp(character,1,2));
        System.out.println("Il a bougé");

    }

    @Test
    public void getView() {
    }

    @Test
    public void getModel() {
    }

    @Test
    public void getHeroX() {

    }

    @Test
    public void setHeroX() {

        assertEquals(this.characterX, characterX);
    }

    @Test
    public void getHeroY() {
    }

    @Test
    public void setHeroY() {
    }

    @Test
    public void getLevel() {
    }

    @Test
    public void setLevel() {
    }
}

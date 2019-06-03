package fr.exia.BoulderDash.entity;

import fr.exia.BoulderDash.entity.mobile.Character;
import fr.exia.BoulderDash.entity.mobile.Diamond;
import fr.exia.BoulderDash.entity.mobile.Grass;
import fr.exia.BoulderDash.entity.mobile.Monster;
import fr.exia.BoulderDash.entity.motionless.BrokenGrass;
import fr.exia.BoulderDash.entity.motionless.Door;
import fr.exia.BoulderDash.entity.motionless.Rock;
import fr.exia.BoulderDash.entity.motionless.UnbreakableWall;
/**the class entityFactory is used for create a bord of entity
 * @author  Mathéo NOEL
 * @version 1.0
 */
public abstract class EntityFactory {
/** we instantiate a new object of the entity*/
    private static Diamond DIAMOND = new Diamond();
    /** we instantiate a new object of the entity*/
    private static Grass GRASS = new Grass();
    /** we instantiate a new object of the entity*/
    private static BrokenGrass BROKEN_GRASS = new BrokenGrass();
    /** we instantiate a new object of the entity*/
    private static Door DOOR = new Door();
    /** we instantiate a new object of the entity*/
    private static Rock ROCK = new Rock();
    /** we instantiate a new object of the entity*/
    private static UnbreakableWall UNBREAKABLE_WALL = new UnbreakableWall();
    /** we instantiate a new object of the entity*/
    private static Character CHARACTER = new Character();
    /** we instantiate a new object of the entity*/
    private static Monster MONSTER = new Monster();
/** we create a board of entity*/
    private static Entity[] Entities = {
            DIAMOND,
            GRASS,
            BROKEN_GRASS,
            DOOR,
            ROCK,
            UNBREAKABLE_WALL,
            CHARACTER,
            MONSTER,
    };


    /** getFromFileSymbol transform the letter of a entity into a sprite
     * she also instantiates an entity
     * @param fileSymbol
     * @return Entity
     */
    public static Entity getFromFileSymbol(final char fileSymbol){
        for(final Entity Entity : Entities){
            if(Entity.getSprite().getConsoleImage() == fileSymbol){
                return Entity;
            }
        }
        return BROKEN_GRASS;
    }




}
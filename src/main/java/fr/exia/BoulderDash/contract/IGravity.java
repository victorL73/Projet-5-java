package fr.exia.BoulderDash.contract;
/**
 *The Interface IGravity
 *
 * @author Mathéo NOEL
 * @version 0.1
 */
public interface IGravity {

    public void fall();
/** method uses for set the falling
 * @param bool*/
    public void setIsItFalling(boolean bool);

    /** this method test if something can fall
     */
    public boolean isItFalling();
}

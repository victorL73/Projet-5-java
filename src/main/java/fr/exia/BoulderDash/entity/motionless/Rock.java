package fr.exia.BoulderDash.entity.motionless;

import fr.exia.BoulderDash.contract.IGravity;
import fr.exia.BoulderDash.contract.IPermeability;
import fr.exia.BoulderDash.entity.Sprite;



public class Rock extends MotionlessEntity implements IGravity {
    boolean isItFalling = false;

    /** The Constant SPRITE. */
    private static final Sprite SPRITE = new Sprite('R', "Rock.png");

    /**
     * Instantiates a new ditch.
     */
    public Rock() {
        super(SPRITE);
    }




    @Override
    public void fall() {

    }

    @Override
    public void setIsItFalling(boolean bool) {

    }

    @Override
    public boolean isItFalling() {
        return false;
    }
}

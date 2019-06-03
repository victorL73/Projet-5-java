package fr.exia.BoulderDash.entity.motionless;

import fr.exia.BoulderDash.entity.Sprite;


public class UnbreakableWall extends MotionlessEntity {


    private static final Sprite SPRITE = new Sprite('U',"UnbreakableWall.png");


    public UnbreakableWall() {
        super(SPRITE);
    }
}

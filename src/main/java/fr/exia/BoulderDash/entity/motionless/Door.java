package fr.exia.BoulderDash.entity.motionless;

import fr.exia.BoulderDash.entity.Sprite;


public class Door extends MotionlessEntity {


    private static final Sprite SPRITE = new Sprite('P', "Door.png");


    public Door() {

        super(SPRITE);
    }
}

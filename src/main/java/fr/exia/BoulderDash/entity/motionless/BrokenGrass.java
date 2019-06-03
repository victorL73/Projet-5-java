package fr.exia.BoulderDash.entity.motionless;

import fr.exia.BoulderDash.contract.IPermeability;
import fr.exia.BoulderDash.entity.Sprite;


public class BrokenGrass extends MotionlessEntity implements IPermeability {


    private static final Sprite SPRITE = new Sprite('B',"BrokenGrass.png");


    public BrokenGrass() {
        super(SPRITE);
    }
        @Override
        public void permeability(){

    }
}

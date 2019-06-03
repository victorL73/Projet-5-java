package fr.exia.BoulderDash.entity.mobile;

import fr.exia.BoulderDash.contract.IGravity;
import fr.exia.BoulderDash.contract.IPermeability;
import fr.exia.BoulderDash.entity.Sprite;



public class Diamond extends AliveORDead implements IPermeability, IGravity {

    boolean isItFalling = false;


    private static final Sprite SPRITE = new Sprite('D', "Diamond.png");


    public Diamond(){
        super(SPRITE);
    }
    public void permeability(){

    }
    public void fall(){

    }

    @Override
    public void setIsItFalling(boolean isItFalling) {
        this.isItFalling = isItFalling;

    }

    public boolean isItFalling(){
        return this.isItFalling;
    }



    }

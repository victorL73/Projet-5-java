package fr.exia.BoulderDash.entity.mobile;

        import fr.exia.BoulderDash.entity.Sprite;


public class Hero extends Alive {
    private static final Sprite SPRITE = new Sprite('C',"Face4.png");
    public Hero(){
        super(SPRITE);
    }
    @Override
    public void permeability(){

    }
}

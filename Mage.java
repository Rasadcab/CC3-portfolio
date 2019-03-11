package Character;


import Character.Character;


public class Mage extends Character{
 
    int Manapoints;
    int Fireball;
    public int SummonRoll;
    public int intellgence;
    
    public Mage(String n, int s, int d, int i) {
        super(n, s, d, i);
        intelligence = 25;
        Manapoints = 20;
        armor = 2;
    }
    public int Fireball(){  
        if(Manapoints > 0){
            Manapoints-=5;
            Fireball = dice.roll() + super.intelligence;
        }else{
            Fireball = 0;
        }   
        return Fireball;
    }

  
@Override
      public int summonpet(){
      int summonRoll = (dice.roll() -1);
       return SummonRoll;
   }



public void petability(){
if (summonpet()% 2 == 0){
this.intellgence = this.intelligence +5;
System.out.println(this.name +" summon a phoenix! fireball damage is permanently increase by 5");
}else {
System.out.println(this.name+" fails to summon a pet!");
  }
  }

}






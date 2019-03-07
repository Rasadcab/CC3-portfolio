package rpg;

public class TestCharacter {

    public TestCharacter() {
        Character Playerone = new Character("Katakuri ", 2, 4, 6);
        Character Playertwo = new Character("Luffy ", 3, 5, 7);

        for (int i = 1; i <= 100; i++) {
            System.out.println("Round " + i);

            System.out.println(Playerone.getName() + ": " + Playerone.getCurrentLife());
            System.out.println(Playertwo.getName() + ": " + Playertwo.getCurrentLife());

            int oneAttack = Playerone.attack(), twoAttack = Playertwo.attack();

            System.out.println(Playerone.getName() + " attacks " + Playertwo.getName() + " for " + oneAttack);
            System.out.println(Playertwo.getName() + " attacks " + Playerone.getName() + " for " + twoAttack);

            Playertwo.wound(oneAttack);
            Playerone.wound(twoAttack);

            System.out.println(" ");
            if (Playerone.getCurrentLife() <= 0) {
                System.out.println(Playertwo.getName() + " win!");
                break;
            }
            else if (Playertwo.getCurrentLife() <= 0) {
                System.out.println(Playerone.getName() + " win!");
                break;
            }else if(Playerone.getCurrentLife() <= 0 && Playertwo.getCurrentLife() <= 0)
                System.out.println("Draw");
                
        }
    }

}

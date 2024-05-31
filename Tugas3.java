// JoJo.java

class JoJoCharacter {
    void standAbility() {
        System.out.println("Using a Stand ability");
    }

    void catchphrase() {
        System.out.println("Base character catchphrase");
    }
}

class Jotaro extends JoJoCharacter {
    @Override
    void standAbility() {
        System.out.println("Using Star Platinum: ORA ORA ORA!");
    }
}

class Joseph extends JoJoCharacter {
    @Override
    void standAbility() {
        System.out.println("Using Hermit Purple: Overdrive!");
    }
}

class Dio extends JoJoCharacter {
    @Override
    void standAbility() {
        System.out.println("Using The World: ZA WARUDO!");
    }
}

class JoJo {
    public static void main(String[] args) {
        JoJoCharacter[] characters = {new Jotaro(), new Joseph(), new Dio()};

        for (JoJoCharacter character : characters) {
            character.standAbility();
            character.catchphrase(); // calling base class method
        }
        
        // Use the subclasses of CharacterWithCatchphrase
        CharacterWithCatchphrase[] charactersWithCatchphrase = {new JotaroWithCatchphrase(), new JosephWithCatchphrase(), new DioWithCatchphrase()};
        for (CharacterWithCatchphrase character : charactersWithCatchphrase) {
            character.catchphrase();
        }
    }
}

abstract class CharacterWithCatchphrase extends JoJoCharacter {
    @Override
    void catchphrase() {
        System.out.println("This is my new catchphrase!");
    }
}

class JotaroWithCatchphrase extends CharacterWithCatchphrase {
    @Override
    void standAbility() {
        System.out.println("Using Star Platinum: ORA ORA ORA!");
    }
}

class JosephWithCatchphrase extends CharacterWithCatchphrase {
    @Override
    void standAbility() {
        System.out.println("Using Hermit Purple: Overdrive!");
    }
}

class DioWithCatchphrase extends CharacterWithCatchphrase {
    @Override
    void standAbility() {
        System.out.println("Using The World: ZA WARUDO!");
    }
}

interface Vehicle {
    void ride();

    int speed();
}

class SilverChariot implements Vehicle {
    @Override
    public void ride() {
        System.out.println("Riding Silver Chariot");
    }

    @Override
    public int speed() {
        return 300;
    }
}

class RedHotChiliPepper implements Vehicle {
    @Override
    public void ride() {
        System.out.println("Riding Red Hot Chili Pepper");
    }

    @Override
    public int speed() {
        return 250;
    }
          }
  

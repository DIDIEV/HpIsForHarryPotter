import Mages.*;
import Spells.*;
public class Main {
    public static void main(String[] args) {
        Mage harry = new Harry();
        Mage ron = new Ron();

        harry.performSpell(new ExpectoPatronum());
        harry.showSignatureSpell();

        ron.performSpell(new Expelliarmus());
        ron.showSignatureSpell();
        ron.changeSignatureSpell(new OculusReparo());
        ron.showSignatureSpell();

    }
}

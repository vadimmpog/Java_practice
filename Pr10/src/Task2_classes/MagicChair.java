package Task2_classes;

public class MagicChair implements Chair {
    @Override
    public String toString() {
        return "Magic chair";
    }

    public void doMagic(){
        System.out.println("Magic *trhh* *trhh*");
    }
}

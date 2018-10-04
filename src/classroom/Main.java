package classroom;

public class Main {

    public static void main(String[] args) {

        Hund fido = new Hund();
        Hund puli = new Hund();

        fido.setAntalBen(2);

        System.out.println(fido.getAntalBen());

        fido.setAntalBen(2);

        System.out.println(fido.getAntalBen());

        System.out.println(fido.getFarve());
    }

}

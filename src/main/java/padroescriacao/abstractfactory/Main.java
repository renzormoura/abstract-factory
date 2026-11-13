package padroescriacao.abstractfactory;

public class Main {

    public static void main(String[] args) {
        ConjuntoMoveis moderno = new ConjuntoMoveis(new FabricaModerna());
        System.out.println(moderno.descreverMesa() + " + " + moderno.descreverCadeira());

        ConjuntoMoveis classico = new ConjuntoMoveis(new FabricaClassica());
        System.out.println(classico.descreverMesa() + " + " + classico.descreverCadeira());
    }
}

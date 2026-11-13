package padroescriacao.abstractfactory;

public class ConjuntoMoveis {

    private Cadeira cadeira;
    private Mesa mesa;

    public ConjuntoMoveis(FabricaAbstrata fabrica) {
        this.cadeira = fabrica.createCadeira();
        this.mesa = fabrica.createMesa();
    }

    public String descreverCadeira() {
        return this.cadeira.descrever();
    }

    public String descreverMesa() {
        return this.mesa.descrever();
    }
}

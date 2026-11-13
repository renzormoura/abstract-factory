package padroescriacao.abstractfactory;

public class FabricaClassica implements FabricaAbstrata {

    @Override
    public Cadeira createCadeira() {
        return new CadeiraClassica();
    }

    @Override
    public Mesa createMesa() {
        return new MesaClassica();
    }
}

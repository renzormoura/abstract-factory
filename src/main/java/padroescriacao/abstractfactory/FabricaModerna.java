package padroescriacao.abstractfactory;

public class FabricaModerna implements FabricaAbstrata {

    @Override
    public Cadeira createCadeira() {
        return new CadeiraModerna();
    }

    @Override
    public Mesa createMesa() {
        return new MesaModerna();
    }
}

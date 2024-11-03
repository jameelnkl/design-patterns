public class DataAdapterConcrete extends DataAdapterAbstract {
    private DataAdaptee aDataAdaptee;

    public DataAdapterConcrete() {
        aDataAdaptee = new DataAdaptee();
    }

    @Override
    public void print() {
        aDataAdaptee.printAdaptee();
    }
}

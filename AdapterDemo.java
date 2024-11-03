public class AdapterDemo {
    private DataAdapterAbstract aDataTarget;

    public AdapterDemo() {
        aDataTarget = new DataAdapterConcrete();
        aDataTarget.print();
    }

    public static void main(String[] args) {
        new AdapterDemo();
    }
}

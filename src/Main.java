public class Main {
    public static void main(String[] args) {
        AdapterInterface ai1 = new Adapter(new Adaptee());
        ai1.request();
    }
}
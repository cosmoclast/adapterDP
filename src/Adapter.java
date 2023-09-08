public class Adapter implements AdapterInterface{
    Adaptee adaptee;

    public Adapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }

    @Override
    public void request(){
        this.adaptee.specialRequest();
    }
}

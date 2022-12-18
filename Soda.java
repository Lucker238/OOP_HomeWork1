public class Soda extends Product {
    public Soda(String name, double price, String flavor) {
        super(name, price);
    }

    private String flavor;

    public String getFlavor(){
        return flavor;
    }

    private void setFlavor(String flavor){
        this.flavor = flavor;
    }

    @Override
    public String toString() {
        return String.format("%s, Flavor: %s", super.toString(), flavor);
    }

}

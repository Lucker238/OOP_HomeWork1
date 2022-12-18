public class Chips extends Product {
    public Chips(String name, double price, String flavor, double volume) {
        super(name, price);
    }

    private String flavor;
    private double volume;

    public String getFlavor(){
        return flavor;
    }

    private void setFlavor(String flavor){
        this.flavor = flavor;
    }

    public double getVolume(){
        return volume;
    }

    private void setVolume(double volume){
        this.volume = volume;
    }

    @Override
    public String toString() {
        return String.format("%s, Flavor: %s, Volume: %fgr", super.toString(), flavor, volume);
    }

}

public class Choko extends Product{
    public Choko(String name, double price, double volume){
        super(name, price);
    }
    private double volume;

    public double getVolume(){
        return volume;
    }

    private void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return String.format("%s, Volume: %f", super.toString(), volume);
    }

}

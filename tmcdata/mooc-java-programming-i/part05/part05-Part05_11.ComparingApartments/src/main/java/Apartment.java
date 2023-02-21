
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }
    public int getSquares() {
        return this.squares;
    }
    
    public boolean largerThan(Apartment compared) {
        return (this.squares > compared.getSquares()) ;
    }
    
    public int getPriceDifference() {
        return this.pricePerSquare * this.squares;
    }
    
    public int priceDifference(Apartment compared) {
        return Math.abs(this.getPriceDifference() - compared.getPriceDifference()) ;
    }
    
    public boolean moreExpensiveThan(Apartment compared) {
        return this.getPriceDifference() > compared.getPriceDifference();
    }
    
    
    public String toString(){
        return this.rooms + ", " + this.squares + ", " + this.pricePerSquare;
    }

}

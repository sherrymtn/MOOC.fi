
public class Timer {
    private ClockHand seconds;
    private ClockHand milli;
    //private ClockHand limit;
    
    public Timer(){
        this.seconds = new ClockHand(60);
        this.milli = new ClockHand(100);
        //this.limit = new ClockHand(100);
    }
    
    public void advance()  {
        this.milli.advance();
        
        if (this.milli.value() == 0) {
            this.seconds.advance();
//            
//            if (this.seconds.value() == 0) {
//                this.minutes.advance();
//            }
        }
    }
    
    @Override
    public String toString() {
        return this.seconds + ":" + this.milli;
    }
    
}

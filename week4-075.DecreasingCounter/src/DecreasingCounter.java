public class DecreasingCounter {
    private int value;  // instance variable that remembers the value of the counter
    private int initialValue;

    public DecreasingCounter(int valueAtStart) {
        this.value = valueAtStart;
        this.initialValue = valueAtStart;
    }

    public void printValue() {
        // do not touch this!
        System.out.println("value: " + this.value);
    }

    public void decrease() {
        this.value -= 1;
        if(this.value < 0){
            System.out.println("Value cannot be lower than 0");
            this.value = 0;
        }
        
        
    }
    // and here the rest of the methods
    
    public void reset(){
        this.value = 0;
    }
    
    public void setInitial(){
        this.value = initialValue;
    }

    
}

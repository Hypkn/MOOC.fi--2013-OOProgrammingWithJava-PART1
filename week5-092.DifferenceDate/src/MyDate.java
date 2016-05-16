
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    public int differenceInYears(MyDate comparedDate) {
         int compare = 0;
        if(earlier(comparedDate)){
           compare = comparedDate.year - this.year;
            
            if(comparedDate.month < this.month   ){
               compare = (comparedDate.year - this.year )-1;
            }
            if(comparedDate.day < this.day ){
                compare = (comparedDate.year - this.year )-1;
            }
            return compare;
       
        }

            
           compare =  this.year - comparedDate.year;
            
            if(this.month <  comparedDate.month  ){
                    
               compare = (this.year - comparedDate.year )-1;
            }
             if(this.day < comparedDate.day ){
        compare = (this.year - comparedDate.year )-1;
    }
    
            return compare;
    }
}


public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                 this.day < compared.day) {
            return true;
        }

        return false;
    }

    public void advance() {
        // this.day++;

        // if (this.day > 30) {
        //     this.day = 1;
        //     this.month++;
        // }   

        // if (this.month > 12) {
        //     this.month = 1;
        //     this.year++;
        // }
        


        // if (this.day <= 30) {
        //     this.day++;
        // } 

        // if (this.day > 30) {
        //     this.day = 1;
        //     this.month++;
        // } 
        
        // if (this.month > 12) {
        //     this.month = 1;
        //     this.year++;
        // }



        if (this.day < 30) {
            this.day++;
        } else {
            this.day = 1;
            this.month++;
        } 
        
        if (this.month > 12) {
            this.month = 1;
            this.year++;
        }


    }

    public void advance(int howManyDays) {
        
        for (int i = 0; i < howManyDays; i++) {
            this.advance();
         }
        
        
        // if (this.month == 2) {
        //     for (int i = 0; i < 28; i++) {
        //         advance();
        //      }
        // }

        // if (this.month == 4 || month == 6 || month == 9 || month == 11) {
        //     for (int i = 0; i < 30; i++) {
        //         advance();
        //      }
        // // }
        
    }

    public SimpleDate afterNumberOfDays(int days) {
        SimpleDate newDate = new SimpleDate(this.day, this.month, this.year);
        newDate.advance(days);
        return newDate;
    }
}

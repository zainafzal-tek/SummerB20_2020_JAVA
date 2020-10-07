package day59_OOPReview;

import java.time.LocalDate;

public class Encapsulation {

    private int ssn;
    final private LocalDate DOB = LocalDate.of(1994,03, 07); // cannot be modified!!

    public void setSsn(int ssn){    //read only
        this.ssn = ssn;
    }

    public int getSsn(){    //modify only
        return ssn;
    }

    public LocalDate getDOB(){
        return DOB;
    }

}

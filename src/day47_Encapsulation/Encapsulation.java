package day47_Encapsulation;

public class Encapsulation {

    private long ssn;
    private String userName;

    public void setSsn(long ssn){
        this.ssn = ssn;
    }

    public long getSsn(){   //to read only
        return ssn;
    }

}

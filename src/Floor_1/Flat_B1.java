package Floor_1;

public class Flat_B1 {
    public String bankInterestrate(String bankName){
        String rate  = null;
        if(bankName.equals("JPMC")){rate = "6.6%";}
        if(bankName.equals("WellsFargo")){rate = "8.6%";}
        if(bankName.equals("ICICI")){rate = "10.6%";}
        if(bankName.equals("SBI")){rate = "12.6%";}
        if(bankName.equals("HSBC")){rate = "16.6%";}

        return rate;

    }
}

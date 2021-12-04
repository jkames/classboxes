
public class assignment12 {
    static class CreditsNotSufficient extends Exception{
        public CreditsNotSufficient(String s){
           super(s);
        }
    }
    public static void checkCredits(int credit) throws CreditsNotSufficient {
        if(credit < 50)
            throw new CreditsNotSufficient("Less than 50 Credits");
    }
    public static void main(String[] args) {
        int credits = 40;
        try{
            checkCredits(credits);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

public class Football extends Sports{
    public Football(int players, String rules) {
        super(players, rules);
    }
    @Override
    public void ground() {
        System.out.println("need a rectangular ground");
    }
    public void ground(String A){
        System.out.println("has 2 goalkeeping nets");
    }
}

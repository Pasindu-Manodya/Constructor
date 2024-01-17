public class Cricket extends Sports{
    public Cricket(int players, String rules) {
        super(players, rules);
    }
    @Override
    public void ground() {
        System.out.println("need a oval ground");
    }
    public void ground(int boundary){
        for (int i =1; i <= boundary; i++){
            System.out.println("has a boundary line");
        }
    }
}

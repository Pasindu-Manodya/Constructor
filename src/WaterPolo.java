public class WaterPolo extends Sports{
    public WaterPolo(int players, String rules) {
        super(players, rules);
    }

    @Override
    public void ground() {
        System.out.println("need a swimming pool to play");
    }
    public void ground(String players){
        System.out.println("players wear goggles in order to play");
    }
}

public class WaterPolo extends Sports{
    public WaterPolo(int players, String rules) {
        super(players, rules);
    }

    @Override
    public void ground() {
        System.out.println("need a swimming pool to play");
    }
}

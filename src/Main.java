public class Main {
    public static void main(String[] args) {
        Cricket c = new Cricket(11,"always need a wicket keeper");
        Football f = new Football(10, "always need a goal keeper");
        WaterPolo w = new WaterPolo(8,"played in water");

        System.out.println("cricket has " + c.getPlayers() + " players and " + c.getRules());
        System.out.println("football has " + f.getPlayers() + " players and " + f.getRules());
        c.ground();
        c.ground(2);
        f.ground();
        f.ground("goal keeping nets");
        w.ground();
    }
}
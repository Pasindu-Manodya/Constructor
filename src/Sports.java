public class Sports {
    int players;
    String rules;
    public Sports(int players, String rules) {
        this.players = players;
        this.rules = rules;
    }
    public void ground(){
        System.out.println("always need a ground to play");
    }
    public int getPlayers() {
        return players;
    }
    public void setPlayers(int players) {
        this.players = players;
    }
    public String getRules() {
        return rules;
    }
    public void setRules(String rules) {
        this.rules = rules;
    }
}

package bridges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class BasicSocialWeb implements SocialWeb
{

    private DB postgreDB = new PostgreDB();

    private List<String> friends = new ArrayList<>();
    {
        friends.add("Alexey");
        friends.add("Artem");
        friends.add("Nicolay");
    }

    private int money = 0;

    public String getPayed() {
        return payedInRubles.toString() + " " + payedInCurrency.toString();
    }

    private List<Integer> payedInRubles;
    private List<Integer> payedInCurrency;

    private List<String> notifications =
            Arrays.asList("notification1",
                    "notification2",
                    "notification3");

    @Override
    public List<String> getFriends() {
        return postgreDB.getListOfFriends() /*friends*/;
    }

    @Override
    public void pay(int value) {
//        money += value;
        money += postgreDB.getMoney() + value;
        payedInRubles.add(value);
    }

    @Override
    public void payInCurrency(int value) {
        //        money += value;
        int rate = 38;
        money += postgreDB.getMoney() + value*rate;
        payedInCurrency.add(value*rate);
    }

    @Override
    public List<String> wall() {
        return postgreDB.getWall() /*notifications*/;
    }

}

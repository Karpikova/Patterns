package bridges;

import java.util.List;

public interface SocialWeb
{
    List<String> getFriends();

    void pay(int value);
    void payInCurrency(int value);

    List<String> wall();

}

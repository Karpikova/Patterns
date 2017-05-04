package bridges;

import java.util.Arrays;
import java.util.List;


public class FacebookSocialWeb extends BasicSocialWeb
{

    String getHistory(String date)
    {
        return "FacebookSocialWeb history";
    }


    List<Integer> getLikes(int messageId,
                           boolean showNegative,
                           int userId
    )
    {
        return Arrays.asList(7,8,9);
    }

    String getFullFile(int id){
        String res =
                "Friends: " + super.getFriends().toString()
                        + "\n\r Wall: " + super.wall();
        return res;
    }

    String getPayStory(int id){
        return super.getPayed();
    }

}

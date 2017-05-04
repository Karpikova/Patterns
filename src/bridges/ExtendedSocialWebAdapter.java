package bridges;

import java.util.List;


public class ExtendedSocialWebAdapter implements
        ExtendedSocialWeb
{

    private BasicSocialWeb extendedSocialWeb;

    public ExtendedSocialWebAdapter
            (BasicSocialWeb extendedSocialWeb) {
        this.extendedSocialWeb = extendedSocialWeb;
    }

    @Override
    public String getHistory(int userId, String date) {
        if (extendedSocialWeb instanceof VKSocialWeb)
        {
            return new VKSocialWeb().getHistory();
        }
        if (extendedSocialWeb instanceof FacebookSocialWeb)
        {
            return new FacebookSocialWeb()
                    .getHistory(date);
        }
        return null;
    }

    @Override
    public List<Integer> getLikes(int userId,
                                  boolean showNegative,
                                  int messageId) {

        if (extendedSocialWeb instanceof VKSocialWeb)
        {
            return new VKSocialWeb()
                    .getLikes(userId,messageId);
        }
        if (extendedSocialWeb instanceof FacebookSocialWeb)
        {
            return new FacebookSocialWeb()
                    .getLikes(messageId,
                            showNegative,userId);
        }
        return null;
    }

    @Override
    public String getFullFile(int userId) {
        if (extendedSocialWeb instanceof VKSocialWeb)
        {
            //TODO
        }
        if (extendedSocialWeb instanceof FacebookSocialWeb)
        {
            return new FacebookSocialWeb()
                    .getFullFile(userId);
        }
        return null;
    }

    @Override
    public String getPayStory(int userID) {
        if (extendedSocialWeb instanceof VKSocialWeb)
        {
            //TODO
        }
        if (extendedSocialWeb instanceof FacebookSocialWeb)
        {
            return new FacebookSocialWeb()
                    .getPayStory(userID);
        }
        return null;
    }
}

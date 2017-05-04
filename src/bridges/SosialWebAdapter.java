package bridges;

import java.util.List;

/*
 * ${Classname}
 * 
 * Version 1.0 
 * 
 * 04.05.2017
 * 
 * Karpikova
 */
public class SosialWebAdapter implements SocialWeb{

    private SocialWeb socialWeb;

    public SosialWebAdapter(SocialWeb socialWeb) {
        this.socialWeb = socialWeb;
    }

    @Override
    public List<String> getFriends() {
        return null;
    }

    @Override
    public void pay(int value) {

    }

    @Override
    public void payInCurrency(int value) {

    }

    @Override
    public List<String> wall() {
        return null;
    }
}

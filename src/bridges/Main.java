package bridges;

/*
 * ${Classname}
 * 
 * Version 1.0 
 * 
 * 04.05.2017
 * 
 * Karpikova
 */
public class Main {
    public static void main(String[] args) {
        // write your code here

        BasicSocialWeb faceBookSocialWeb =
                new FacebookSocialWeb();
        ExtendedSocialWeb extendedSocialWeb =
                new ExtendedSocialWebAdapter(faceBookSocialWeb);

        System.out.println(
                extendedSocialWeb
                        .getHistory(1, "04.05.2017")
        );

        System.out.println(
                extendedSocialWeb
                        .getLikes(1,
                                true,
                                2)
        );
        System.out.println(extendedSocialWeb.getFullFile(1));
        System.out.println(extendedSocialWeb.getPayStory(1));
    }
}

package india.eva.com.goldenspiral.ui.customui;

/**
 * Created by bhargavagugamsetty on 17/05/16.
 */
public class Typefaces {
    public static final String ROBOTO_REGULAR = "fonts/Roboto-Regular.ttf";

    public static final String ROBOTO_MEDIUM = "fonts/Roboto-Medium.ttf";

    public static final String ROBOTO_LIGHT = "fonts/Roboto-Light.ttf";

    public static final String LATIN_STYLE = "fonts/Latin-Style.ttf";

    public static String getTypeface(final int typefaceCode) {

        switch (typefaceCode) {
            case 0:
                return ROBOTO_REGULAR;

            case 1:
                return ROBOTO_MEDIUM;

            case 2:
                return ROBOTO_LIGHT;

            case 3:
                return LATIN_STYLE;

            default:
                return ROBOTO_REGULAR;
        }
    }
}

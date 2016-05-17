package india.eva.com.goldenspiral.models;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by bhargavagugamsetty on 17/05/16.
 */
public class SharedPreferencesManager {

    public static boolean getBoolean(final Context c, final String key) {

        final SharedPreferences preferences = c.getSharedPreferences(key, Context.MODE_PRIVATE);
        return preferences.getBoolean(key, false);
    }
}

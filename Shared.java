package powerkuy.modmenu;

import android.content.Context;
import android.content.SharedPreferences;

public class Shared {
    public static Context context;
    private static SharedPreferences.Editor editor;

    public static void setstring(String str, String str2) {
        editor = context.getSharedPreferences("mod_menu", 0).edit();
        editor.putString(str, str2).apply();
    }

    public static String getstring(String str, String str2) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("mod_menu", 0);
        editor = sharedPreferences.edit();
        return sharedPreferences.getString(str, str2);
    }

    public Shared() {
    }
}

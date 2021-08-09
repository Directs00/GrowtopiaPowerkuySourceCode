package powerkuy.modmenu;

import android.content.Context;

public class NativeCall {
    public static native String BotName(int i);

    public static native void Custom(String str, String str2, String str3);

    public static native void CustomTile(String str, int i, boolean z);

    public static native void Toggle(Context context, int i, int i2, boolean z, String str);

    public static native String World(int i);

    public static native String[] getaction(String str);

    public static native boolean isonline(int i);

    public static native int whatlol();

    public NativeCall() {
    }
}

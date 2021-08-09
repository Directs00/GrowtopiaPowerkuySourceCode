package powerkuy.modmenu;

import android.os.Build;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.Switch;

/* compiled from: ModernUI */
class ShowModMenu {
    private static LinearLayout finallayout;
    private static WindowManager.LayoutParams float_paramwindow;
    private static Switch handle;
    private static int iparams = (Build.VERSION.SDK_INT >= 26 ? 2038 : 2002);
    private static WindowManager manager;

    static {
        WindowManager.LayoutParams layoutParams;
        new WindowManager.LayoutParams(-1, -1, iparams, 8, -3);
        float_paramwindow = layoutParams;
    }

    public static void Setup(WindowManager windowManager) {
        windowManager.addView(ModMenuUI.menu_all_view, float_paramwindow);
    }

    public ShowModMenu() {
    }
}

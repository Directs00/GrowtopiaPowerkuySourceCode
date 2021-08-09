package powerkuy.modmenu;

import android.content.Context;
import android.os.Build;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;

public class DebugWindow {
    private static WindowManager.LayoutParams float_paramwindow;
    private static int iparams = (Build.VERSION.SDK_INT >= 26 ? 2038 : 2002);
    public TextView ConsoleView;
    public WindowManager window;

    static {
        WindowManager.LayoutParams layoutParams;
        new WindowManager.LayoutParams(-1, -1, iparams, 8, -3);
        float_paramwindow = layoutParams;
    }

    public DebugWindow(Context context) {
        TextView textView;
        LinearLayout linearLayout;
        ViewGroup.LayoutParams layoutParams;
        Context context2 = context;
        this.window = (WindowManager) context2.getSystemService("window");
        float_paramwindow.gravity = 83;
        new TextView(context2);
        this.ConsoleView = textView;
        this.ConsoleView.setTextColor(-16711936);
        new LinearLayout(context2);
        LinearLayout linearLayout2 = linearLayout;
        linearLayout2.setOrientation(1);
        new WindowManager.LayoutParams(-1, -1);
        linearLayout2.setLayoutParams(layoutParams);
        this.window.addView(this.ConsoleView, float_paramwindow);
        this.ConsoleView.setVisibility(4);
    }
}

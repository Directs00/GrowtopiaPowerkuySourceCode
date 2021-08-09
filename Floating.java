package powerkuy.modmenu;

import android.app.ActivityManager;
import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.view.WindowManager;
import android.widget.TextView;

public class Floating extends Service {
    public static int WindowHeight;
    public static int WindowWidth;
    public static DebugWindow debug;
    public static WindowManager window;
    private boolean killed;

    static boolean access$1000002(Floating floating) {
        return floating.isNotInGame();
    }

    static boolean access$L1000000(Floating floating) {
        return floating.killed;
    }

    static void access$S1000000(Floating floating, boolean z) {
        floating.killed = z;
    }

    public static void PrintDebug(String str) {
        StringBuffer stringBuffer;
        StringBuffer stringBuffer2;
        TextView textView = debug.ConsoleView;
        new StringBuffer();
        new StringBuffer();
        textView.setText(stringBuffer.append(stringBuffer2.append(str).append("\n").toString()).append(debug.ConsoleView.getText()).toString());
    }

    public static void DebugEnabled(boolean z) {
        debug.ConsoleView.setVisibility(z ? 0 : 4);
    }

    @Override
    public IBinder onBind(Intent intent) {
        Intent intent2 = intent;
        return null;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onCreate() {
        DebugWindow debugWindow;
        Handler handler;
        Runnable runnable;
        super.onCreate();
        Shared.context = this;
        ModMenuUI.setup(this);
        window = (WindowManager) getSystemService("window");
        WindowWidth = window.getDefaultDisplay().getWidth();
        WindowHeight = window.getDefaultDisplay().getHeight();
        new DebugWindow(this);
        debug = debugWindow;
        PrintDebug("Starting Up Floating Layout");
        ShowModMenu.Setup(window);
        ModMenuList.Initialize(this);
        PrintDebug("Mod Menu Started");
        PrintDebug("Creating Thread");
        this.killed = false;
        new Handler();
        Handler handler2 = handler;
        new Runnable(this, handler2) {
            private final Floating this$0;
            private final Handler val$Hand;

            {
                this.this$0 = r7;
                this.val$Hand = r8;
            }

            static Floating access$0(AnonymousClass100000000 r4) {
                return r4.this$0;
            }

            @Override
            public void run() {
                if (ModMenuUI.menu_all_view != null) {
                    boolean postDelayed = this.val$Hand.postDelayed(this, (long) 1000);
                    if (Floating.access$1000002(this.this$0) && !Floating.access$L1000000(this.this$0)) {
                        Floating.access$S1000000(this.this$0, true);
                        Floating.debug.ConsoleView.setVisibility(8);
                        ModMenuUI.menu_all_view.setVisibility(8);
                        ModMenuList.icon_ke_dua.setVisibility(8);
                    }
                    if (!Floating.access$1000002(this.this$0) && Floating.access$L1000000(this.this$0)) {
                        Floating.access$S1000000(this.this$0, false);
                        Floating.debug.ConsoleView.setVisibility(8);
                        ModMenuUI.menu_all_view.setVisibility(0);
                        ModMenuList.icon_ke_dua.setVisibility(8);
                    }
                }
            }
        };
        boolean post = handler2.post(runnable);
    }

    private boolean isNotInGame() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo;
        new ActivityManager.RunningAppProcessInfo();
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo2 = runningAppProcessInfo;
        ActivityManager.getMyMemoryState(runningAppProcessInfo2);
        return runningAppProcessInfo2.importance != 100;
    }

    public Floating() {
    }
}

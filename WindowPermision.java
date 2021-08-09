package powerkuy.modmenu;

import android.app.AlertDialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Process;
import android.provider.Settings;

public class WindowPermision {
    public static boolean Done;

    public static void Start(Context context) {
        Handler handler;
        Runnable runnable;
        AlertDialog.Builder builder;
        DialogInterface.OnClickListener onClickListener;
        DialogInterface.OnClickListener onClickListener2;
        Context context2 = context;
        if (Build.VERSION.SDK_INT < 23 || Settings.canDrawOverlays(context2)) {
            new Handler();
            System.loadLibrary("PowerKuy");
            new Runnable(context2) {
                private final Context val$context;

                {
                    this.val$context = r6;
                }

                @Override
                public void run() {
                    Throwable th;
                    System.loadLibrary("PowerKuy");
                    if (ModMenuUI.menu_all_view == null) {
                        Context context = this.val$context;
                        Intent intent = r12;
                        try {
                            Intent intent2 = new Intent(this.val$context, Class.forName("powerkuy.modmenu.Floating"));
                            ComponentName startService = context.startService(intent);
                        } catch (ClassNotFoundException e) {
                            ClassNotFoundException classNotFoundException = e;
                            Throwable th2 = th;
                            new NoClassDefFoundError(classNotFoundException.getMessage());
                            throw th2;
                        }
                    }
                }
            };
            boolean postDelayed = handler.postDelayed(runnable, (long) 2000);
            return;
        }
        new AlertDialog.Builder(context2, 1);
        new DialogInterface.OnClickListener(context2) {
            private final Context val$context;

            {
                this.val$context = r6;
            }

            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent intent;
                StringBuffer stringBuffer;
                DialogInterface dialogInterface2 = dialogInterface;
                int i2 = i;
                new StringBuffer();
                new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse(stringBuffer.append("package:").append(this.val$context.getPackageName()).toString()));
                this.val$context.startActivity(intent);
                Process.killProcess(Process.myPid());
            }
        };
        new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
            }
        };
        builder.setTitle("No overlay permission").setMessage("Overlay permission is required in order to display the mod menu on top of the screen. Do you want to open the settings?").setPositiveButton("Yes", onClickListener).setNegativeButton("No", onClickListener2).setCancelable(false).create().show();
    }

    public WindowPermision() {
    }
}

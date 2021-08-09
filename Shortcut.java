package powerkuy.modmenu;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.Switch;
import android.widget.TextView;
import androidx.core.internal.view.SupportMenu;

public class Shortcut {
    private String addname;
    private Context ctx;
    private WindowManager.LayoutParams float_paramwindow;
    private int iparams;
    private TextView toggle;
    private WindowManager window;

    static WindowManager.LayoutParams access$L1000001(Shortcut shortcut) {
        return shortcut.float_paramwindow;
    }

    static TextView access$L1000005(Shortcut shortcut) {
        return shortcut.toggle;
    }

    static void access$S1000001(Shortcut shortcut, WindowManager.LayoutParams layoutParams) {
        shortcut.float_paramwindow = layoutParams;
    }

    static void access$S1000005(Shortcut shortcut, TextView textView) {
        shortcut.toggle = textView;
    }

    public Shortcut(Context context) {
        WindowManager.LayoutParams layoutParams;
        Context context2 = context;
        this.iparams = Build.VERSION.SDK_INT >= 26 ? 2038 : 2002;
        new WindowManager.LayoutParams(-2, -2, this.iparams, 8, -3);
        this.float_paramwindow = layoutParams;
        this.ctx = context2;
        this.window = (WindowManager) context2.getSystemService("window");
        this.float_paramwindow.gravity = 17;
    }

    /* access modifiers changed from: package-private */
    public void RefreshText() {
        GradientDrawable gradientDrawable;
        GradientDrawable gradientDrawable2;
        if (this.toggle.isActivated()) {
            new GradientDrawable();
            GradientDrawable gradientDrawable3 = gradientDrawable2;
            gradientDrawable3.setColor(Warna.Background);
            gradientDrawable3.setStroke(5, Warna.Dasar);
            this.toggle.setBackground(gradientDrawable3);
            return;
        }
        new GradientDrawable();
        GradientDrawable gradientDrawable4 = gradientDrawable;
        gradientDrawable4.setColor(Warna.Background);
        gradientDrawable4.setStroke(5, SupportMenu.CATEGORY_MASK);
        this.toggle.setBackground(gradientDrawable4);
    }

    public void addToggle(Switch switchR, String str) {
        GradientDrawable gradientDrawable;
        TextView textView;
        View.OnTouchListener onTouchListener;
        Handler handler;
        Runnable runnable;
        Switch switchR2 = switchR;
        String str2 = str;
        if (this.addname == str2) {
            RemoveToggle();
            this.addname = "";
            return;
        }
        this.addname = str2;
        new GradientDrawable();
        GradientDrawable gradientDrawable2 = gradientDrawable;
        gradientDrawable2.setColor(Warna.Background);
        gradientDrawable2.setStroke(5, Warna.Dasar);
        new TextView(this.ctx);
        this.toggle = textView;
        this.toggle.setText(str2);
        this.toggle.setPadding(30, 20, 30, 20);
        this.toggle.setTextColor(Warna.Teks);
        this.toggle.setTextSize((float) 12);
        this.toggle.setBackground(gradientDrawable2);
        this.toggle.setTypeface((Typeface) null, 1);
        this.toggle.setActivated(switchR2.isChecked());
        RefreshText();
        new View.OnTouchListener(this, switchR2) {
            private float initialTouchXE;
            private float initialTouchYE;
            private float initialXE;
            private float initialYE;
            private final Shortcut this$0;
            private final Switch val$a;

            {
                this.this$0 = r7;
                this.val$a = r8;
            }

            static Shortcut access$0(AnonymousClass100000000 r4) {
                return r4.this$0;
            }

            public boolean onTouch(View view, MotionEvent motionEvent) {
                View view2 = view;
                MotionEvent motionEvent2 = motionEvent;
                switch (motionEvent2.getAction()) {
                    case 0:
                        this.initialXE = (float) Shortcut.access$L1000001(this.this$0).x;
                        this.initialYE = (float) Shortcut.access$L1000001(this.this$0).y;
                        this.initialTouchXE = motionEvent2.getRawX();
                        this.initialTouchYE = motionEvent2.getRawY();
                        return true;
                    case 1:
                        int rawX = (int) (motionEvent2.getRawX() - this.initialTouchXE);
                        int rawY = (int) (motionEvent2.getRawY() - this.initialTouchYE);
                        if (rawX < 4 && rawY < 4 && rawX > -4 && rawY > -4) {
                            this.val$a.setChecked(!this.val$a.isChecked());
                            Shortcut.access$L1000005(this.this$0).setActivated(this.val$a.isChecked());
                            this.this$0.RefreshText();
                        }
                        return true;
                    case 2:
                        Shortcut.access$L1000001(this.this$0).x = ((int) this.initialXE) + ((int) (motionEvent2.getRawX() - this.initialTouchXE));
                        Shortcut.access$L1000001(this.this$0).y = ((int) this.initialYE) + ((int) (motionEvent2.getRawY() - this.initialTouchYE));
                        Floating.window.updateViewLayout(Shortcut.access$L1000005(this.this$0), Shortcut.access$L1000001(this.this$0));
                        return true;
                    default:
                        return false;
                }
            }
        };
        this.toggle.setOnTouchListener(onTouchListener);
        this.window.addView(this.toggle, this.float_paramwindow);
        new Handler();
        Handler handler2 = handler;
        new Runnable(this, handler2) {
            private final Shortcut this$0;
            private final Handler val$Hand;

            {
                this.this$0 = r7;
                this.val$Hand = r8;
            }

            static Shortcut access$0(AnonymousClass100000001 r4) {
                return r4.this$0;
            }

            @Override
            public void run() {
                if (ModMenuUI.menu_all_view != null) {
                    boolean postDelayed = this.val$Hand.postDelayed(this, (long) 1000);
                    if (ModMenuUI.menu_all_view.getVisibility() == 8 && ModMenuList.icon_ke_dua.getVisibility() == 8) {
                        Shortcut.access$L1000005(this.this$0).setVisibility(8);
                    } else {
                        Shortcut.access$L1000005(this.this$0).setVisibility(0);
                    }
                }
            }
        };
        boolean post = handler2.post(runnable);
    }

    public void Notice(Switch switchR) {
        Switch switchR2 = switchR;
        if (this.toggle != null) {
            this.toggle.setActivated(switchR2.isChecked());
            RefreshText();
        }
    }

    private void RemoveToggle() {
        this.window.removeView(this.toggle);
    }
}

package powerkuy.modmenu;

import android.app.AlertDialog;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import java.util.Objects;
import mehdi.sakout.fancybuttons.FancyButton;

public class SimpleAlert {
    public AlertDialog dialog_alert;

    public void Show(Context context, ScrollView scrollView) {
        AlertDialog.Builder builder;
        LinearLayout linearLayout;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup viewGroup;
        ViewGroup.LayoutParams layoutParams2;
        ScrollView scrollView2;
        ViewGroup.LayoutParams layoutParams3;
        FancyButton fancyButton;
        ViewGroup.LayoutParams layoutParams4;
        View.OnClickListener onClickListener;
        Context context2 = context;
        ScrollView scrollView3 = scrollView;
        new AlertDialog.Builder(context2, 2);
        this.dialog_alert = builder.create();
        Animation loadAnimation = AnimationUtils.loadAnimation(context2, 17432578);
        Animation loadAnimation2 = AnimationUtils.loadAnimation(context2, 17432579);
        if (Build.VERSION.SDK_INT >= 19) {
            ((Window) Objects.requireNonNull(this.dialog_alert.getWindow())).setType(Build.VERSION.SDK_INT >= 26 ? 2038 : 2002);
        }
        new LinearLayout(context2);
        LinearLayout linearLayout2 = linearLayout;
        linearLayout2.setOrientation(1);
        new RelativeLayout.LayoutParams(2000, -2);
        linearLayout2.setLayoutParams(layoutParams);
        new LinearLayout(context2);
        ViewGroup viewGroup2 = viewGroup;
        new RelativeLayout.LayoutParams(-1, -2);
        linearLayout2.setLayoutParams(layoutParams2);
        linearLayout2.setOrientation(1);
        new ScrollView(context2);
        ScrollView scrollView4 = scrollView2;
        new RelativeLayout.LayoutParams(-1, -1);
        scrollView4.setLayoutParams(layoutParams3);
        scrollView4.addView(linearLayout2);
        this.dialog_alert.setView(scrollView4);
        new FancyButton(context2);
        FancyButton fancyButton2 = fancyButton;
        fancyButton2.setIconColor(Warna.Teks);
        fancyButton2.setIconPadding(20, 20, 20, 20);
        fancyButton2.setIconResource("");
        fancyButton2.setBackgroundColor(0);
        fancyButton2.setFocusBackgroundColor(Warna.Dasar);
        fancyButton2.setIconPosition(1);
        fancyButton2.setText("Back");
        fancyButton2.setPadding(10, 10, 10, 10);
        fancyButton2.setClickable(true);
        fancyButton2.setGravity(16);
        new RelativeLayout.LayoutParams(-1, -1);
        fancyButton2.setLayoutParams(layoutParams4);
        new View.OnClickListener(this, linearLayout2) {
            private final SimpleAlert this$0;
            private final LinearLayout val$main;

            {
                this.this$0 = r7;
                this.val$main = r8;
            }

            static SimpleAlert access$0(AnonymousClass100000000 r4) {
                return r4.this$0;
            }

            @Override
            public void onClick(View view) {
                View view2 = view;
                this.this$0.dialog_alert.dismiss();
                this.val$main.removeAllViews();
            }
        };
        fancyButton2.setOnClickListener(onClickListener);
        viewGroup2.addView(fancyButton2);
        linearLayout2.addView(viewGroup2);
        linearLayout2.addView(scrollView3);
        this.dialog_alert.show();
        linearLayout2.startAnimation(loadAnimation);
        this.dialog_alert.setCancelable(false);
        this.dialog_alert.getWindow().setLayout((Floating.WindowWidth * 10) / 15, -2);
        this.dialog_alert.getWindow().setGravity(80);
    }

    public void Show(Context context, LinearLayout linearLayout) {
        AlertDialog.Builder builder;
        LinearLayout linearLayout2;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup viewGroup;
        ViewGroup.LayoutParams layoutParams2;
        FancyButton fancyButton;
        ViewGroup.LayoutParams layoutParams3;
        View.OnClickListener onClickListener;
        ScrollView scrollView;
        ViewGroup.LayoutParams layoutParams4;
        Context context2 = context;
        LinearLayout linearLayout3 = linearLayout;
        new AlertDialog.Builder(context2, 2);
        this.dialog_alert = builder.create();
        Animation loadAnimation = AnimationUtils.loadAnimation(context2, 17432578);
        Animation loadAnimation2 = AnimationUtils.loadAnimation(context2, 17432579);
        if (Build.VERSION.SDK_INT >= 19) {
            ((Window) Objects.requireNonNull(this.dialog_alert.getWindow())).setType(Build.VERSION.SDK_INT >= 26 ? 2038 : 2002);
        }
        new LinearLayout(context2);
        LinearLayout linearLayout4 = linearLayout2;
        linearLayout4.setOrientation(1);
        new RelativeLayout.LayoutParams(2000, -2);
        linearLayout4.setLayoutParams(layoutParams);
        new LinearLayout(context2);
        ViewGroup viewGroup2 = viewGroup;
        new RelativeLayout.LayoutParams(-1, -2);
        linearLayout4.setLayoutParams(layoutParams2);
        linearLayout4.setOrientation(1);
        new FancyButton(context2);
        FancyButton fancyButton2 = fancyButton;
        fancyButton2.setIconColor(Warna.Teks);
        fancyButton2.setIconPadding(20, 20, 20, 20);
        fancyButton2.setIconResource("");
        fancyButton2.setBackgroundColor(0);
        fancyButton2.setFocusBackgroundColor(Warna.Dasar);
        fancyButton2.setIconPosition(1);
        fancyButton2.setText("Back");
        fancyButton2.setPadding(10, 10, 10, 10);
        fancyButton2.setClickable(true);
        fancyButton2.setGravity(16);
        new RelativeLayout.LayoutParams(-1, -1);
        fancyButton2.setLayoutParams(layoutParams3);
        new View.OnClickListener(this, linearLayout4) {
            private final SimpleAlert this$0;
            private final LinearLayout val$main;

            {
                this.this$0 = r7;
                this.val$main = r8;
            }

            static SimpleAlert access$0(AnonymousClass100000001 r4) {
                return r4.this$0;
            }

            @Override
            public void onClick(View view) {
                View view2 = view;
                this.this$0.dialog_alert.dismiss();
                this.val$main.removeAllViews();
            }
        };
        fancyButton2.setOnClickListener(onClickListener);
        viewGroup2.addView(fancyButton2);
        linearLayout4.addView(viewGroup2);
        linearLayout4.addView(linearLayout3);
        new ScrollView(context2);
        ScrollView scrollView2 = scrollView;
        new RelativeLayout.LayoutParams(-1, -1);
        scrollView2.setLayoutParams(layoutParams4);
        scrollView2.addView(linearLayout4);
        this.dialog_alert.setView(scrollView2);
        this.dialog_alert.show();
        linearLayout4.startAnimation(loadAnimation);
        this.dialog_alert.setCancelable(false);
        this.dialog_alert.getWindow().setLayout((Floating.WindowWidth * 10) / 15, -2);
        this.dialog_alert.getWindow().setGravity(80);
    }

    public SimpleAlert() {
    }
}

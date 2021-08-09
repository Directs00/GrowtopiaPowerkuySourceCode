package powerkuy.modmenu;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import mehdi.sakout.fancybuttons.FancyButton;

public class CustomTile {
    public LinearLayout main;

    public CustomTile(Context context, String str) {
        LinearLayout linearLayout;
        ViewGroup.LayoutParams layoutParams;
        LinearLayout linearLayout2;
        ViewGroup.LayoutParams layoutParams2;
        FancyButton fancyButton;
        ViewGroup.LayoutParams layoutParams3;
        View.OnClickListener onClickListener;
        LinearLayout linearLayout3;
        ViewGroup.LayoutParams layoutParams4;
        Context context2 = context;
        String str2 = str;
        new LinearLayout(context2);
        this.main = linearLayout;
        new LinearLayout.LayoutParams(-1, -2);
        this.main.setLayoutParams(layoutParams);
        this.main.setOrientation(1);
        new LinearLayout(context2);
        LinearLayout linearLayout4 = linearLayout2;
        linearLayout4.setOrientation(0);
        new LinearLayout.LayoutParams(-1, -2);
        linearLayout4.setLayoutParams(layoutParams2);
        for (int i = 1; i < 30; i++) {
            new FancyButton(context2);
            FancyButton fancyButton2 = fancyButton;
            fancyButton2.setBackgroundColor(Warna.Background);
            fancyButton2.setFocusBackgroundColor(Warna.Dasar);
            fancyButton2.setPadding(30, 30, 30, 30);
            new LinearLayout.LayoutParams(-2, -2, (float) 1);
            fancyButton2.setLayoutParams(layoutParams3);
            fancyButton2.setText(String.valueOf(i));
            fancyButton2.setTextSize(13);
            fancyButton2.setTextColor(-1);
            fancyButton2.setClickable(true);
            new View.OnClickListener(this, fancyButton2, str2, i) {
                private final CustomTile this$0;
                private final int val$GasText;
                private final String val$save;
                private final FancyButton val$tile;

                {
                    this.this$0 = r9;
                    this.val$tile = r10;
                    this.val$save = r11;
                    this.val$GasText = r12;
                }

                static CustomTile access$0(AnonymousClass100000000 r4) {
                    return r4.this$0;
                }

                @Override
                public void onClick(View view) {
                    View view2 = view;
                    this.val$tile.setActivated(!this.val$tile.isActivated());
                    this.val$tile.getBackground().setTint(this.val$tile.isActivated() ? Warna.Dasar : Warna.Background);
                    NativeCall.CustomTile(this.val$save, this.val$GasText, this.val$tile.isActivated());
                }
            };
            fancyButton2.setOnClickListener(onClickListener);
            linearLayout4.addView(fancyButton2);
            if (i % 5 == 0) {
                this.main.addView(linearLayout4);
                new LinearLayout(context2);
                linearLayout4 = linearLayout3;
                linearLayout4.setOrientation(0);
                new LinearLayout.LayoutParams(-1, -2);
                linearLayout4.setLayoutParams(layoutParams4);
            }
        }
    }

    public CustomTile(Context context, String str, int i, int i2) {
        LinearLayout linearLayout;
        ViewGroup.LayoutParams layoutParams;
        LinearLayout linearLayout2;
        ViewGroup.LayoutParams layoutParams2;
        FancyButton fancyButton;
        ViewGroup.LayoutParams layoutParams3;
        View.OnClickListener onClickListener;
        LinearLayout linearLayout3;
        ViewGroup.LayoutParams layoutParams4;
        Context context2 = context;
        String str2 = str;
        int i3 = i;
        int i4 = i2;
        new LinearLayout(context2);
        this.main = linearLayout;
        new LinearLayout.LayoutParams(-1, -2);
        this.main.setLayoutParams(layoutParams);
        this.main.setOrientation(1);
        new LinearLayout(context2);
        LinearLayout linearLayout4 = linearLayout2;
        linearLayout4.setOrientation(0);
        new LinearLayout.LayoutParams(-1, -2);
        linearLayout4.setLayoutParams(layoutParams2);
        for (int i5 = 1; i5 < i3; i5++) {
            new FancyButton(context2);
            FancyButton fancyButton2 = fancyButton;
            fancyButton2.setBackgroundColor(Warna.Background);
            fancyButton2.setFocusBackgroundColor(Warna.Dasar);
            fancyButton2.setPadding(30, 30, 30, 30);
            new LinearLayout.LayoutParams(-2, -2, (float) 1);
            fancyButton2.setLayoutParams(layoutParams3);
            fancyButton2.setText(String.valueOf(i5));
            fancyButton2.setTextSize(13);
            fancyButton2.setTextColor(-1);
            fancyButton2.setClickable(true);
            new View.OnClickListener(this, fancyButton2, str2, i5) {
                private final CustomTile this$0;
                private final int val$GasText;
                private final String val$save;
                private final FancyButton val$tile;

                {
                    this.this$0 = r9;
                    this.val$tile = r10;
                    this.val$save = r11;
                    this.val$GasText = r12;
                }

                static CustomTile access$0(AnonymousClass100000001 r4) {
                    return r4.this$0;
                }

                @Override
                public void onClick(View view) {
                    View view2 = view;
                    this.val$tile.setActivated(!this.val$tile.isActivated());
                    this.val$tile.getBackground().setTint(this.val$tile.isActivated() ? Warna.Dasar : Warna.Background);
                    NativeCall.CustomTile(this.val$save, this.val$GasText, this.val$tile.isActivated());
                }
            };
            fancyButton2.setOnClickListener(onClickListener);
            linearLayout4.addView(fancyButton2);
            if (i5 % i4 == 0) {
                this.main.addView(linearLayout4);
                new LinearLayout(context2);
                linearLayout4 = linearLayout3;
                linearLayout4.setOrientation(0);
                new LinearLayout.LayoutParams(-1, -2);
                linearLayout4.setLayoutParams(layoutParams4);
            }
        }
    }
}

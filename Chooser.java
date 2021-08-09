package powerkuy.modmenu;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import mehdi.sakout.fancybuttons.FancyButton;

public class Chooser {
    private int Clicked;
    private int Count;
    private String Name_handle;
    private LinearLayout spin_view_listmenu;
    private LinearLayout spin_view_main;

    static LinearLayout access$L1000001(Chooser chooser) {
        return chooser.spin_view_listmenu;
    }

    static void access$S1000001(Chooser chooser, LinearLayout linearLayout) {
        chooser.spin_view_listmenu = linearLayout;
    }

    public void setSpin_view_main(LinearLayout linearLayout) {
        LinearLayout linearLayout2 = linearLayout;
        this.spin_view_main = linearLayout2;
    }

    public LinearLayout getSpin_view_main() {
        return this.spin_view_main;
    }

    public void setSpin_view_listmenu(LinearLayout linearLayout) {
        LinearLayout linearLayout2 = linearLayout;
        this.spin_view_listmenu = linearLayout2;
    }

    public LinearLayout getSpin_view_listmenu() {
        return this.spin_view_listmenu;
    }

    public void setCount(int i) {
        int i2 = i;
        this.Count = i2;
    }

    public int getCount() {
        return this.Count;
    }

    public void setClicked(int i) {
        int i2 = i;
        this.Clicked = i2;
    }

    public int getClicked() {
        return this.Clicked;
    }

    public void Reset() {
        for (int i = 0; i < this.spin_view_listmenu.getChildCount(); i++) {
            this.spin_view_listmenu.getChildAt(i).setBackgroundColor(0);
            FancyButton fancyButton = (FancyButton) this.spin_view_listmenu.getChildAt(i);
            fancyButton.setIconResource("");
            fancyButton.setClickable(true);
        }
    }

    public void SetClicked(int i, String str) {
        int i2 = i;
        this.Clicked = i2;
        this.spin_view_listmenu.getChildAt(i2).setBackgroundColor(Warna.Dasar);
        FancyButton fancyButton = (FancyButton) this.spin_view_listmenu.getChildAt(i2);
        fancyButton.setIconResource("");
        fancyButton.setClickable(true);
        NativeCall.Toggle(ModMenuList.ctx, 0, i2, false, str);
    }

    public void FastSetup(Context context, String str, String[] strArr) {
        TextView textView;
        StringBuffer stringBuffer;
        LinearLayout linearLayout;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        HorizontalScrollView horizontalScrollView;
        ViewGroup.LayoutParams layoutParams3;
        LinearLayout linearLayout2;
        ViewGroup.LayoutParams layoutParams4;
        FancyButton fancyButton;
        View.OnClickListener onClickListener;
        Context context2 = context;
        String str2 = str;
        String[] strArr2 = strArr;
        this.Name_handle = str2;
        new TextView(context2);
        TextView textView2 = textView;
        new StringBuffer();
        textView2.setText(stringBuffer.append(str2).append(" :").toString());
        textView2.setTextColor(-1);
        textView2.setTextSize((float) 12);
        textView2.setPadding(30, 0, 0, 0);
        new LinearLayout(context2);
        this.spin_view_main = linearLayout;
        this.spin_view_main.setOrientation(1);
        this.spin_view_main.setBackgroundColor(0);
        new WindowManager.LayoutParams(-1, -2);
        this.spin_view_main.setLayoutParams(layoutParams);
        this.spin_view_main.addView(textView2);
        this.spin_view_main.setPadding(0, 30, 0, 30);
        new WindowManager.LayoutParams();
        ViewGroup.LayoutParams layoutParams5 = layoutParams2;
        layoutParams5.width = -1;
        layoutParams5.height = -2;
        this.spin_view_main.setLayoutParams(layoutParams5);
        new HorizontalScrollView(context2);
        HorizontalScrollView horizontalScrollView2 = horizontalScrollView;
        new WindowManager.LayoutParams();
        ViewGroup.LayoutParams layoutParams6 = layoutParams3;
        layoutParams6.width = -1;
        layoutParams6.height = -2;
        horizontalScrollView2.setLayoutParams(layoutParams6);
        new LinearLayout(context2);
        this.spin_view_listmenu = linearLayout2;
        horizontalScrollView2.setBackgroundColor(0);
        this.spin_view_listmenu.setOrientation(0);
        new WindowManager.LayoutParams();
        ViewGroup.LayoutParams layoutParams7 = layoutParams4;
        layoutParams7.width = -2;
        layoutParams7.height = -1;
        this.spin_view_listmenu.setLayoutParams(layoutParams7);
        horizontalScrollView2.addView(this.spin_view_listmenu);
        this.spin_view_main.addView(horizontalScrollView2);
        for (int i = 0; i < strArr2.length; i++) {
            new FancyButton(context2);
            FancyButton fancyButton2 = fancyButton;
            fancyButton2.setBackgroundColor(0);
            fancyButton2.setFocusBackgroundColor(Warna.Dasar);
            fancyButton2.setText(strArr2[i]);
            fancyButton2.setPadding(10, 10, 30, 10);
            fancyButton2.setClickable(true);
            fancyButton2.setTextSize(12);
            fancyButton2.setIconPadding(15, 15, 15, 15);
            fancyButton2.setIconPosition(1);
            fancyButton2.setIconResource("");
            fancyButton2.setRadius(100);
            fancyButton2.setGravity(16);
            new View.OnClickListener(this, i, str2) {
                private final Chooser this$0;
                private final String val$Name;
                private final int val$index;

                {
                    this.this$0 = r8;
                    this.val$index = r9;
                    this.val$Name = r10;
                }

                static Chooser access$0(AnonymousClass100000000 r4) {
                    return r4.this$0;
                }

                @Override
                public void onClick(View view) {
                    View view2 = view;
                    this.this$0.Reset();
                    this.this$0.SetClicked(this.val$index, this.val$Name);
                    Chooser.access$L1000001(this.this$0).getChildAt(this.val$index).setClickable(true);
                }
            };
            fancyButton2.setOnClickListener(onClickListener);
            this.spin_view_listmenu.addView(fancyButton2);
        }
        SetClicked(0, str2);
    }

    public Chooser() {
    }
}

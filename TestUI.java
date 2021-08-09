package powerkuy.modmenu;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/* compiled from: ModernUI */
class TestUI {
    public static LinearLayout simple_dialog_main;
    public static TextView text;

    public static void setup(Context context) {
        LinearLayout linearLayout;
        ViewGroup.LayoutParams layoutParams;
        LinearLayout linearLayout2;
        LinearLayout.LayoutParams layoutParams2;
        LinearLayout linearLayout3;
        LinearLayout.LayoutParams layoutParams3;
        LinearLayout linearLayout4;
        LinearLayout.LayoutParams layoutParams4;
        Context context2 = context;
        new LinearLayout(context2);
        simple_dialog_main = linearLayout;
        simple_dialog_main.setGravity(81);
        simple_dialog_main.setOrientation(0);
        new LinearLayout.LayoutParams(0, 0);
        ViewGroup.LayoutParams layoutParams5 = layoutParams;
        layoutParams5.width = -1;
        layoutParams5.height = -1;
        simple_dialog_main.setLayoutParams(layoutParams5);
        new LinearLayout(context2);
        LinearLayout linearLayout5 = linearLayout2;
        linearLayout5.setOrientation(1);
        new LinearLayout.LayoutParams(0, 0);
        LinearLayout.LayoutParams layoutParams6 = layoutParams2;
        layoutParams6.width = -2;
        layoutParams6.height = -1;
        layoutParams6.weight = (float) 2;
        linearLayout5.setLayoutParams(layoutParams6);
        simple_dialog_main.addView(linearLayout5);
        new LinearLayout(context2);
        LinearLayout linearLayout6 = linearLayout3;
        linearLayout6.setOrientation(1);
        new LinearLayout.LayoutParams(0, 0);
        LinearLayout.LayoutParams layoutParams7 = layoutParams3;
        layoutParams7.width = -2;
        layoutParams7.height = -1;
        layoutParams7.weight = (float) 5;
        linearLayout6.setLayoutParams(layoutParams7);
        simple_dialog_main.addView(linearLayout6);
        new LinearLayout(context2);
        LinearLayout linearLayout7 = linearLayout4;
        linearLayout7.setOrientation(1);
        new LinearLayout.LayoutParams(0, 0);
        LinearLayout.LayoutParams layoutParams8 = layoutParams4;
        layoutParams8.width = -2;
        layoutParams8.height = -1;
        layoutParams8.weight = (float) 2;
        linearLayout7.setLayoutParams(layoutParams8);
        simple_dialog_main.addView(linearLayout7);
    }

    public TestUI() {
    }
}

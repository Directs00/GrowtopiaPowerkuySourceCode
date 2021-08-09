package powerkuy.modmenu;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;

/* compiled from: ModernUI */
class ModMenuUI {
    public static LinearLayout menu_all_view;
    public static ScrollView menu_kanan;
    public static ScrollView menu_kiri;
    public static LinearLayout menu_tengah;

    public static void setup(Context context) {
        LinearLayout linearLayout;
        ViewGroup.LayoutParams layoutParams;
        ScrollView scrollView;
        LinearLayout.LayoutParams layoutParams2;
        LinearLayout linearLayout2;
        View.OnClickListener onClickListener;
        LinearLayout.LayoutParams layoutParams3;
        ScrollView scrollView2;
        LinearLayout.LayoutParams layoutParams4;
        Context context2 = context;
        new LinearLayout(context2);
        menu_all_view = linearLayout;
        menu_all_view.setOrientation(0);
        new LinearLayout.LayoutParams(0, 0);
        ViewGroup.LayoutParams layoutParams5 = layoutParams;
        layoutParams5.width = -1;
        layoutParams5.height = -1;
        menu_all_view.setLayoutParams(layoutParams5);
        new ScrollView(context2);
        menu_kiri = scrollView;
        menu_kiri.setBackgroundColor(Warna.Menu_Color);
        new LinearLayout.LayoutParams(0, 0);
        LinearLayout.LayoutParams layoutParams6 = layoutParams2;
        layoutParams6.width = 0;
        layoutParams6.height = -1;
        layoutParams6.weight = (float) 20;
        menu_kiri.setLayoutParams(layoutParams6);
        menu_all_view.addView(menu_kiri);
        new LinearLayout(context2);
        menu_tengah = linearLayout2;
        menu_tengah.setOrientation(1);
        new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                View view2 = view;
                ModMenuUI.menu_all_view.setVisibility(8);
                ModMenuList.icon_ke_dua.setVisibility(0);
            }
        };
        menu_tengah.setOnClickListener(onClickListener);
        new LinearLayout.LayoutParams(0, 0);
        LinearLayout.LayoutParams layoutParams7 = layoutParams3;
        layoutParams7.width = -2;
        layoutParams7.height = -1;
        layoutParams7.weight = (float) 30;
        menu_tengah.setLayoutParams(layoutParams7);
        menu_all_view.addView(menu_tengah);
        new ScrollView(context2);
        menu_kanan = scrollView2;
        menu_kanan.setBackgroundColor(Warna.Menu_Color);
        new LinearLayout.LayoutParams(0, 0);
        LinearLayout.LayoutParams layoutParams8 = layoutParams4;
        layoutParams8.width = 0;
        layoutParams8.height = -1;
        layoutParams8.weight = (float) 25;
        menu_kanan.setLayoutParams(layoutParams8);
        menu_all_view.addView(menu_kanan);
    }

    public ModMenuUI() {
    }
}

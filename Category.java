package powerkuy.modmenu;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import mehdi.sakout.fancybuttons.FancyButton;

/* compiled from: ModMenuList */
class Category extends FancyButton {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Category(Context context) {
        super(context);
        ViewGroup.LayoutParams layoutParams;
        setBackgroundColor(0);
        setFocusBackgroundColor(Warna.Dasar);
        setTextColor(Warna.Teks);
        setIconColor(Warna.Teks);
        setIconPosition(1);
        setIconPadding(20, 20, 20, 20);
        setPadding(10, 10, 25, 10);
        setTextSize(13);
        setGravity(16);
        new LinearLayout.LayoutParams(-1, -2);
        setLayoutParams(layoutParams);
        setClickable(true);
        setRadius(new int[]{0, 100, 0, 100});
    }
}

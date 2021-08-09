package powerkuy.modmenu;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.view.ViewCompat;
import mehdi.sakout.fancybuttons.FancyButton;

/* compiled from: MultibotManager */
class FancyPower extends FancyButton {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FancyPower(Context context) {
        super(context);
        ViewGroup.LayoutParams layoutParams;
        setBackgroundColor(Warna.Dasar);
        setFocusBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        setPadding(20, 20, 20, 20);
        setRadius(100);
        setTextSize(14);
        setTextColor(-1);
        setIconPosition(1);
        setIconPadding(10, 10, 10, 10);
        new LinearLayout.LayoutParams(-1, -2);
        setLayoutParams(layoutParams);
        setClickable(true);
    }
}

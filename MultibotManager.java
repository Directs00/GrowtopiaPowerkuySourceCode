package powerkuy.modmenu;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.Toast;
import androidx.core.internal.view.SupportMenu;

public class MultibotManager {
    public LinearLayout BotListButton;
    public LinearLayout BotManager;
    private Handler loop;

    static Handler access$L1000000(MultibotManager multibotManager) {
        return multibotManager.loop;
    }

    static void access$S1000000(MultibotManager multibotManager, Handler handler) {
        multibotManager.loop = handler;
    }

    public MultibotManager(Context context) {
        Handler handler;
        LinearLayout linearLayout;
        ViewGroup.LayoutParams layoutParams;
        LinearLayout linearLayout2;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup.LayoutParams layoutParams3;
        ScrollView scrollView;
        ViewGroup.LayoutParams layoutParams4;
        LinearLayout linearLayout3;
        ViewGroup.LayoutParams layoutParams5;
        Runnable runnable;
        FancyPower fancyPower;
        StringBuffer stringBuffer;
        StringBuffer stringBuffer2;
        View.OnClickListener onClickListener;
        Context context2 = context;
        new Handler();
        this.loop = handler;
        new LinearLayout(context2);
        this.BotManager = linearLayout;
        this.BotManager.setOrientation(1);
        new RelativeLayout.LayoutParams(0, 0);
        ViewGroup.LayoutParams layoutParams6 = layoutParams;
        layoutParams6.width = -1;
        layoutParams6.height = -1;
        this.BotManager.setLayoutParams(layoutParams6);
        new LinearLayout(context2);
        LinearLayout linearLayout4 = linearLayout2;
        linearLayout4.setOrientation(0);
        new RelativeLayout.LayoutParams(0, 0);
        ViewGroup.LayoutParams layoutParams7 = layoutParams2;
        layoutParams7.width = -1;
        layoutParams7.height = -2;
        linearLayout4.setLayoutParams(layoutParams7);
        new RelativeLayout.LayoutParams(0, 0);
        ViewGroup.LayoutParams layoutParams8 = layoutParams3;
        layoutParams8.width = -1;
        layoutParams8.height = -2;
        this.BotManager.addView(linearLayout4);
        new ScrollView(context2);
        ScrollView scrollView2 = scrollView;
        new RelativeLayout.LayoutParams(0, 0);
        ViewGroup.LayoutParams layoutParams9 = layoutParams4;
        layoutParams9.width = -1;
        layoutParams9.height = -1;
        scrollView2.setLayoutParams(layoutParams9);
        new LinearLayout(context2);
        this.BotListButton = linearLayout3;
        this.BotListButton.setOrientation(1);
        new RelativeLayout.LayoutParams(0, 0);
        ViewGroup.LayoutParams layoutParams10 = layoutParams5;
        layoutParams10.width = -1;
        layoutParams10.height = -2;
        this.BotListButton.setLayoutParams(layoutParams10);
        scrollView2.addView(this.BotListButton);
        this.BotManager.addView(scrollView2);
        this.BotManager.setPadding(20, 10, 20, 0);
        for (int i = 0; i < 5; i++) {
            new FancyPower(ModMenuList.ctx);
            FancyPower fancyPower2 = fancyPower;
            new StringBuffer();
            new StringBuffer();
            fancyPower2.setText(stringBuffer.append(stringBuffer2.append("Bot ").append(String.valueOf(i + 1)).toString()).append(" ( Exit )").toString());
            fancyPower2.setIconResource("");
            fancyPower2.setIconColor(SupportMenu.CATEGORY_MASK);
            fancyPower2.setTextGravity(16);
            fancyPower2.setGravity(16);
            fancyPower2.setBackgroundColor(0);
            fancyPower2.setFocusBackgroundColor(Warna.Dasar);
            fancyPower2.setRadius(0);
            this.BotListButton.addView(fancyPower2);
            new View.OnClickListener(this, 8 + i, fancyPower2) {
                private final MultibotManager this$0;
                private final int val$index;
                private final FancyPower val$kon;

                {
                    this.this$0 = r8;
                    this.val$index = r9;
                    this.val$kon = r10;
                }

                static MultibotManager access$0(AnonymousClass100000001 r4) {
                    return r4.this$0;
                }

                @Override
                public void onClick(View view) {
                    Handler handler;
                    Runnable runnable;
                    SimpleAlert simpleAlert;
                    View view2 = view;
                    try {
                        new SimpleAlert();
                        simpleAlert.Show(ModMenuList.ctx, ModMenuList.ActionPower.Main_Layout);
                        ModMenuList.ActionPower.Show(this.val$index);
                    } catch (Exception e) {
                        Toast.makeText(ModMenuList.ctx, e.getMessage(), 0).show();
                    }
                    this.val$kon.setClickable(false);
                    new Handler();
                    new Runnable(this, this.val$kon) {
                        private final AnonymousClass100000001 this$0;
                        private final FancyPower val$kon;

                        {
                            this.this$0 = r7;
                            this.val$kon = r8;
                        }

                        static AnonymousClass100000001 access$0(AnonymousClass100000000 r4) {
                            return r4.this$0;
                        }

                        @Override
                        public void run() {
                            this.val$kon.setClickable(true);
                        }
                    };
                    boolean postDelayed = handler.postDelayed(runnable, (long) 500);
                }
            };
            fancyPower2.setOnClickListener(onClickListener);
        }
        new Runnable(this) {
            private final MultibotManager this$0;

            {
                this.this$0 = r6;
            }

            static MultibotManager access$0(AnonymousClass100000002 r4) {
                return r4.this$0;
            }

            @Override
            public void run() {
                StringBuffer stringBuffer;
                StringBuffer stringBuffer2;
                StringBuffer stringBuffer3;
                for (int i = 0; i < this.this$0.BotListButton.getChildCount(); i++) {
                    FancyPower fancyPower = (FancyPower) this.this$0.BotListButton.getChildAt(i);
                    new StringBuffer();
                    new StringBuffer();
                    new StringBuffer();
                    fancyPower.setText(stringBuffer.append(stringBuffer2.append(stringBuffer3.append(NativeCall.BotName(i)).append(" (").toString()).append(NativeCall.World(i)).toString()).append(")").toString());
                    fancyPower.setIconColor(!NativeCall.isonline(i) ? SupportMenu.CATEGORY_MASK : -16711936);
                }
                boolean postDelayed = MultibotManager.access$L1000000(this.this$0).postDelayed(this, (long) 500);
            }
        };
        boolean post = this.loop.post(runnable);
    }
}

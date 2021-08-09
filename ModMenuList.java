package powerkuy.modmenu;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Handler;
import android.text.Editable;
import android.text.Html;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.Base64;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ViewCompat;
import mehdi.sakout.fancybuttons.FancyButton;

public class ModMenuList {
    public static ActionManager ActionPower;
    private static LinearLayout Action_View;
    private static int CategoryIndex = 0;
    private static LinearLayout Category_list;
    private static LinearLayout Extended;
    private static LinearLayout Last_Category;
    private static LinearLayout Layout;
    private static LinearLayout Menu_List;
    public static MultibotManager MultibotLayout;
    public static Context ctx;
    private static WindowManager.LayoutParams float_paramwindow;
    private static LinearLayout gaje;
    public static ImageView icon_ke_dua;
    private static int iparams = (Build.VERSION.SDK_INT >= 26 ? 2038 : 2002);
    private static Category lol;

    static {
        WindowManager.LayoutParams layoutParams;
        new WindowManager.LayoutParams(100, 100, iparams, 8, -3);
        float_paramwindow = layoutParams;
    }

    public static native String Icon();

    static WindowManager.LayoutParams access$L1000011() {
        return float_paramwindow;
    }

    static void access$S1000011(WindowManager.LayoutParams layoutParams) {
        float_paramwindow = layoutParams;
    }

    public static void callaction(String str) {
    }

    public static native String[] getFeatureList();

    public static int getScreenWidth() {
        return Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    public static int getScreenHeight() {
        return Resources.getSystem().getDisplayMetrics().heightPixels;
    }

    public static void Reset_Kanan() {
        try {
            ModMenuUI.menu_kanan.removeAllViews();
        } catch (Exception e) {
            Exception exc = e;
        }
    }

    public static void Reset_Kiri() {
        try {
            ModMenuUI.menu_kiri.removeAllViews();
        } catch (Exception e) {
            Exception exc = e;
        }
    }

    public static void Reset_Category() {
        int i = 0;
        while (i < Layout.getChildCount()) {
            try {
                Layout.getChildAt(i).setBackgroundColor(0);
                i++;
            } catch (Exception e) {
                Toast.makeText(ctx, e.getMessage(), 1).show();
                return;
            }
        }
    }

    public static void ShowCategory(int i) {
        int i2 = i;
        int i3 = 0;
        while (i3 < Menu_List.getChildCount()) {
            try {
                Menu_List.getChildAt(i3).setVisibility(8);
                i3++;
            } catch (Exception e) {
                Exception exc = e;
                return;
            }
        }
        Menu_List.getChildAt(i2).setVisibility(0);
    }

    private static int convertDipToPixels(int i) {
        return (int) ((((float) i) * ctx.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static void Initialize(Context context) {
        String icon;
        ImageView imageView;
        ViewGroup.LayoutParams layoutParams;
        View.OnTouchListener onTouchListener;
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        LinearLayout linearLayout3;
        LinearLayout linearLayout4;
        LinearLayout linearLayout5;
        ActionManager actionManager;
        AsyncTask asyncTask;
        LinearLayout linearLayout6;
        MultibotManager multibotManager;
        LinearLayout linearLayout7;
        Context context2 = context;
        ctx = context2;
        try {
            icon = Icon();
        } catch (UnsatisfiedLinkError e) {
            UnsatisfiedLinkError unsatisfiedLinkError = e;
            icon = IconManager.icon();
        }
        float_paramwindow.gravity = 51;
        ModMenuUI.menu_all_view.setVisibility(8);
        new ImageView(context2);
        icon_ke_dua = imageView;
        new RelativeLayout.LayoutParams(-2, -2);
        icon_ke_dua.setLayoutParams(layoutParams);
        int applyDimension = (int) TypedValue.applyDimension(1, (float) 50, context2.getResources().getDisplayMetrics());
        icon_ke_dua.getLayoutParams().height = applyDimension;
        icon_ke_dua.getLayoutParams().width = applyDimension;
        icon_ke_dua.requestLayout();
        icon_ke_dua.setScaleType(ImageView.ScaleType.FIT_XY);
        byte[] decode = Base64.decode(icon, 0);
        icon_ke_dua.setImageBitmap(BitmapFactory.decodeByteArray(decode, 0, decode.length));
        ((ViewGroup.MarginLayoutParams) icon_ke_dua.getLayoutParams()).topMargin = convertDipToPixels(10);
        new View.OnTouchListener() {
            private float initialTouchXE;
            private float initialTouchYE;
            private float initialXE;
            private float initialYE;

            public boolean onTouch(View view, MotionEvent motionEvent) {
                View view2 = view;
                MotionEvent motionEvent2 = motionEvent;
                switch (motionEvent2.getAction()) {
                    case 0:
                        this.initialXE = (float) ModMenuList.access$L1000011().x;
                        this.initialYE = (float) ModMenuList.access$L1000011().y;
                        this.initialTouchXE = motionEvent2.getRawX();
                        this.initialTouchYE = motionEvent2.getRawY();
                        return true;
                    case 1:
                        int rawX = (int) (motionEvent2.getRawX() - this.initialTouchXE);
                        int rawY = (int) (motionEvent2.getRawY() - this.initialTouchYE);
                        if (rawX < 4 && rawY < 4 && rawX > -4 && rawY > -4 && ModMenuList.icon_ke_dua.getVisibility() == 0) {
                            ModMenuUI.menu_all_view.setVisibility(0);
                            ModMenuList.icon_ke_dua.setVisibility(8);
                        }
                        return true;
                    case 2:
                        ModMenuList.access$L1000011().x = ((int) this.initialXE) + ((int) (motionEvent2.getRawX() - this.initialTouchXE));
                        ModMenuList.access$L1000011().y = ((int) this.initialYE) + ((int) (motionEvent2.getRawY() - this.initialTouchYE));
                        Floating.window.updateViewLayout(ModMenuList.icon_ke_dua, ModMenuList.access$L1000011());
                        return true;
                    default:
                        return false;
                }
            }
        };
        icon_ke_dua.setOnTouchListener(onTouchListener);
        Floating.window.addView(icon_ke_dua, float_paramwindow);
        Reset_Kiri();
        Reset_Kanan();
        new LinearLayout(context2);
        Layout = linearLayout;
        Layout.setPadding(0, 30, 20, 0);
        Layout.setOrientation(1);
        new LinearLayout(context2);
        Menu_List = linearLayout2;
        Menu_List.setOrientation(1);
        new LinearLayout(ctx);
        Category_list = linearLayout3;
        new LinearLayout(ctx);
        Extended = linearLayout4;
        new LinearLayout(ctx);
        Last_Category = linearLayout5;
        String[] strArr = {""};
        try {
            strArr = getFeatureList();
        } catch (UnsatisfiedLinkError e2) {
            UnsatisfiedLinkError unsatisfiedLinkError2 = e2;
        }
        for (int i = 0; i < strArr.length; i++) {
            int i2 = i;
            try {
                String str = strArr[i];
                if (str.contains("addcategory_")) {
                    String[] split = str.split("_");
                    addCategory(split[1], split[2], Layout);
                    new LinearLayout(context2);
                    Category_list = linearLayout7;
                    Category_list.setOrientation(1);
                } else if (str.contains("endcategory")) {
                    Menu_List.addView(Category_list);
                } else if (!str.contains("addcategoryD_")) {
                    if (!str.contains("endcategoryD")) {
                        if (str.contains("label_")) {
                            addlabel(str.replace("label_", ""), Category_list);
                        } else if (!str.contains("labelD_")) {
                            if (str.contains("Toggle_")) {
                                addtoggle(str.replace("Toggle_", ""), Category_list);
                            } else if (!str.contains("ToggleD_")) {
                                if (str.contains("action_")) {
                                    String[] split2 = str.split("_");
                                    addaction(split2[1], split2[2], Category_list);
                                } else if (str.contains("Spinner_")) {
                                    String[] split3 = str.split("_");
                                    addspinner(split3[1], split3[2], Category_list);
                                } else if (str.contains("ButtonIcon_")) {
                                    String[] split4 = str.split("_");
                                    addbutton(split4[1], split4[2], Category_list);
                                } else if (str.contains("Button_")) {
                                    addbutton(str.split("_")[1], "", Category_list);
                                } else if (str.contains("SeekBar_")) {
                                    String[] split5 = str.split("_");
                                    addSeekBar(0, split5[1], Integer.parseInt(split5[2]), Integer.parseInt(split5[3]), Category_list);
                                } else if (str.contains("ButtonOnOff_")) {
                                    String[] split6 = str.split("_");
                                    addbuttononoff(split6[1], "", split6[2], "", Category_list);
                                } else if (str.contains("Edit_")) {
                                    String[] split7 = str.split("_");
                                    addedit(split7[1], Category_list, split7[2]);
                                } else if (str.contains("Multibotinfo_")) {
                                    new MultibotManager(ctx);
                                    MultibotLayout = multibotManager;
                                    Category_list.addView(MultibotLayout.BotManager);
                                } else if (str.contains("ButtonE_")) {
                                    String[] split8 = str.split("_");
                                    new LinearLayout(ctx);
                                    Extended = linearLayout6;
                                    Extended.setOrientation(1);
                                    Extended.setVisibility(8);
                                    Extended.setPadding(30, 0, 0, 0);
                                    Last_Category = Category_list;
                                    Category_list = Extended;
                                    addEtoggle(split8[1], Category_list, Last_Category, Integer.parseInt(split8[2]));
                                } else if (str.contains("endex")) {
                                    Last_Category.addView(Category_list);
                                    Category_list = Last_Category;
                                }
                            }
                        }
                    }
                }
            } catch (Exception e3) {
                Toast.makeText(context2, e3.getMessage(), 1).show();
            }
        }
        String[] strArr2 = {""};
        try {
            String[] strArr3 = NativeCall.getaction("");
        } catch (UnsatisfiedLinkError e4) {
            UnsatisfiedLinkError unsatisfiedLinkError3 = e4;
        }
        new ActionManager(ctx, NativeCall.getaction(""));
        ActionPower = actionManager;
        ModMenuUI.menu_kiri.addView(Layout);
        ModMenuUI.menu_kanan.addView(Menu_List);
        ShowCategory(0);
        Layout.getChildAt(0).setBackgroundColor(Warna.Dasar);
        new GetStringUrl("https://raw.githubusercontent.com/PowerKuy/OnlineUpdaterPowerkuy/main/powerkuy.cpp");
        AsyncTask execute = asyncTask.execute(new Void[0]);
    }

    public static void addEtoggle(String str, LinearLayout linearLayout, LinearLayout linearLayout2, int i) {
        Switch switchR;
        ViewGroup.LayoutParams layoutParams;
        ColorStateList colorStateList;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        String str2 = str;
        LinearLayout linearLayout3 = linearLayout;
        LinearLayout linearLayout4 = linearLayout2;
        int i2 = i;
        new Switch(ctx);
        Switch switchR2 = switchR;
        switchR2.setText(str2);
        switchR2.setTextSize((float) 14);
        switchR2.setPadding(20, 20, 10, 20);
        switchR2.setTextColor(-1);
        new LinearLayout.LayoutParams(-1, -2);
        switchR2.setLayoutParams(layoutParams);
        ColorStateList colorStateList2 = colorStateList;
        int[][] iArr = new int[3][];
        iArr[0] = new int[]{-16842910};
        int[][] iArr2 = iArr;
        iArr2[1] = new int[]{16842912};
        int[][] iArr3 = iArr2;
        iArr3[2] = new int[0];
        new ColorStateList(iArr3, new int[]{-16776961, -16711936, -7829368});
        ColorStateList colorStateList3 = colorStateList2;
        if (Build.VERSION.SDK_INT >= 21) {
            switchR2.getThumbDrawable().setTintList(colorStateList3);
            switchR2.getTrackDrawable().setTintList(colorStateList3);
        }
        new CompoundButton.OnCheckedChangeListener(linearLayout3, switchR2, str2) {
            private final LinearLayout val$extended;
            private final Switch val$lol;
            private final String val$str;

            {
                this.val$extended = r8;
                this.val$lol = r9;
                this.val$str = r10;
            }

            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                CompoundButton compoundButton2 = compoundButton;
                boolean z2 = z;
                this.val$extended.setVisibility(this.val$lol.isChecked() ? 0 : 8);
                Animation loadAnimation = AnimationUtils.loadAnimation(ModMenuList.ctx, 17432578);
                if (this.val$lol.isChecked()) {
                    this.val$extended.startAnimation(loadAnimation);
                }
                NativeCall.Toggle(ModMenuList.ctx, 0, 0, this.val$lol.isChecked(), this.val$str);
            }
        };
        switchR2.setOnCheckedChangeListener(onCheckedChangeListener);
        switchR2.setChecked(i2 == 1);
        linearLayout4.addView(switchR2);
    }

    public static void addedit(String str, LinearLayout linearLayout, String str2) {
        LinearLayout linearLayout2;
        ViewGroup.LayoutParams layoutParams;
        TextView textView;
        StringBuffer stringBuffer;
        ViewGroup.LayoutParams layoutParams2;
        EditText editText;
        ViewGroup.LayoutParams layoutParams3;
        TextWatcher textWatcher;
        TransformationMethod transformationMethod;
        String str3 = str;
        LinearLayout linearLayout3 = linearLayout;
        int parseInt = Integer.parseInt(str2);
        new LinearLayout(ctx);
        LinearLayout linearLayout4 = linearLayout2;
        linearLayout4.setOrientation(1);
        new LinearLayout.LayoutParams(0, 0);
        ViewGroup.LayoutParams layoutParams4 = layoutParams;
        layoutParams4.width = -1;
        layoutParams4.height = -2;
        linearLayout4.setLayoutParams(layoutParams4);
        new PowerText(ctx);
        TextView textView2 = textView;
        new StringBuffer();
        textView2.setText(stringBuffer.append(str3).append(" :").toString());
        textView2.setTextSize((float) 12);
        textView2.setTextColor(-1);
        new LinearLayout.LayoutParams(0, 0);
        ViewGroup.LayoutParams layoutParams5 = layoutParams2;
        layoutParams5.width = -2;
        layoutParams5.height = -2;
        textView2.setLayoutParams(layoutParams5);
        linearLayout4.addView(textView2);
        new EditText(ctx);
        EditText editText2 = editText;
        editText2.setText("");
        Shared.setstring(str3, "");
        editText2.setTextSize((float) 12);
        editText2.setTextColor(-1);
        editText2.setPadding(0, 20, 0, 20);
        editText2.getBackground().setTint(Warna.Menu_Color);
        editText2.setClickable(true);
        if (parseInt == 1) {
            editText2.setInputType(2);
        }
        if (parseInt == 2) {
            new PasswordTransformationMethod();
            editText2.setTransformationMethod(transformationMethod);
            editText2.setInputType(129);
        }
        editText2.setHintTextColor(Color.parseColor("#607D8B"));
        new LinearLayout.LayoutParams(0, 0);
        ViewGroup.LayoutParams layoutParams6 = layoutParams3;
        layoutParams6.width = -1;
        layoutParams6.height = -2;
        editText2.setLayoutParams(layoutParams6);
        new TextWatcher(str3, editText2) {
            private final EditText val$edittext1;
            private final String val$str;

            {
                this.val$str = r7;
                this.val$edittext1 = r8;
            }

            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override
            public void afterTextChanged(Editable editable) {
                Editable editable2 = editable;
                Shared.setstring(this.val$str, this.val$edittext1.getText().toString());
                NativeCall.Custom("", this.val$str, this.val$edittext1.getText().toString());
            }
        };
        editText2.addTextChangedListener(textWatcher);
        linearLayout4.addView(editText2);
        linearLayout3.addView(linearLayout4);
    }

    public static void addbuttononoff(String str, String str2, String str3, String str4, LinearLayout linearLayout) {
        FancyButton fancyButton;
        ViewGroup.LayoutParams layoutParams;
        View.OnClickListener onClickListener;
        ViewGroup viewGroup;
        ViewGroup.LayoutParams layoutParams2;
        String str5 = str;
        String str6 = str2;
        new FancyButton(ctx);
        FancyButton fancyButton2 = fancyButton;
        fancyButton2.setBackgroundColor(SupportMenu.CATEGORY_MASK);
        fancyButton2.setFocusBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        fancyButton2.setElevation((float) 20);
        fancyButton2.setRadius(100);
        fancyButton2.setText(str5);
        fancyButton2.setPadding(20, 20, 20, 20);
        fancyButton2.setTextColor(Warna.Teks);
        fancyButton2.setIconColor(Warna.Teks);
        fancyButton2.setIconPadding(10, 10, 10, 10);
        fancyButton2.setIconPosition(1);
        fancyButton2.setClickable(true);
        fancyButton2.setTextSize(12);
        new LinearLayout.LayoutParams(-1, -2);
        fancyButton2.setLayoutParams(layoutParams);
        fancyButton2.setIconResource(str6);
        new View.OnClickListener(fancyButton2, str3, str4, str5, str6) {
            private final String val$NameHack;
            private final String val$NameKe2;
            private final String val$icon;
            private final String val$iconkedua;
            private final FancyButton val$lolz;

            {
                this.val$lolz = r10;
                this.val$NameKe2 = r11;
                this.val$iconkedua = r12;
                this.val$NameHack = r13;
                this.val$icon = r14;
            }

            @Override
            public void onClick(View view) {
                View view2 = view;
                this.val$lolz.setActivated(!this.val$lolz.isActivated());
                if (this.val$lolz.isActivated()) {
                    this.val$lolz.setText(this.val$NameKe2);
                    this.val$lolz.setIconResource(this.val$iconkedua);
                    this.val$lolz.getBackground().setTint(Warna.Dasar);
                } else {
                    this.val$lolz.setText(this.val$NameHack);
                    this.val$lolz.setIconResource(this.val$icon);
                    this.val$lolz.getBackground().setTint(SupportMenu.CATEGORY_MASK);
                }
                NativeCall.Toggle(ModMenuList.ctx, 0, 0, this.val$lolz.isActivated(), this.val$NameHack);
            }
        };
        fancyButton2.setOnClickListener(onClickListener);
        new LinearLayout(ctx);
        ViewGroup viewGroup2 = viewGroup;
        new LinearLayout.LayoutParams(-1, -2);
        viewGroup2.setLayoutParams(layoutParams2);
        viewGroup2.setPadding(20, 10, 20, 10);
        viewGroup2.addView(fancyButton2);
        linearLayout.addView(viewGroup2);
    }

    public static void addSeekBar(int i, String str, int i2, int i3, LinearLayout linearLayout) {
        LinearLayout linearLayout2;
        SeekBar seekBar;
        PowerText powerText;
        StringBuffer stringBuffer;
        StringBuffer stringBuffer2;
        StringBuffer stringBuffer3;
        StringBuffer stringBuffer4;
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener;
        int i4 = i;
        String str2 = str;
        int i5 = i2;
        new LinearLayout(ctx);
        LinearLayout linearLayout3 = linearLayout2;
        linearLayout3.setPadding(10, 5, 0, 5);
        linearLayout3.setOrientation(1);
        linearLayout3.setGravity(17);
        new SeekBar(ctx);
        SeekBar seekBar2 = seekBar;
        seekBar2.setPadding(25, 10, 35, 10);
        seekBar2.setMax(i3);
        seekBar2.setProgress(i5);
        new PowerText(ctx);
        PowerText powerText2 = powerText;
        new StringBuffer();
        new StringBuffer();
        new StringBuffer();
        new StringBuffer();
        powerText2.setText(Html.fromHtml(stringBuffer.append(stringBuffer2.append(stringBuffer3.append(stringBuffer4.append("<font face='roboto'>").append(str2).toString()).append(": <font color='#41c300'>").toString()).append(seekBar2.getProgress()).toString()).append("</font>").toString()));
        powerText2.setTextColor(-1);
        powerText2.setTextSize((float) 12);
        new SeekBar.OnSeekBarChangeListener(i4, str2, i5, powerText2) {
            int l;
            private final String val$featureName;
            private final int val$featureNum;
            private final int val$min;
            private final PowerText val$textView;

            {
                this.val$featureNum = r9;
                this.val$featureName = r10;
                this.val$min = r11;
                this.val$textView = r12;
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            public void onStopTrackingTouch(SeekBar seekBar) {
            }

            public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                StringBuffer stringBuffer;
                StringBuffer stringBuffer2;
                StringBuffer stringBuffer3;
                StringBuffer stringBuffer4;
                SeekBar seekBar2 = seekBar;
                int i2 = i;
                boolean z2 = z;
                NativeCall.Toggle(ModMenuList.ctx, this.val$featureNum, seekBar2.getProgress(), false, this.val$featureName);
                seekBar2.setProgress(i2 < this.val$min ? this.val$min : i2);
                PowerText powerText = this.val$textView;
                StringBuffer stringBuffer5 = stringBuffer;
                new StringBuffer();
                new StringBuffer();
                new StringBuffer();
                new StringBuffer();
                powerText.setText(Html.fromHtml(stringBuffer5.append(stringBuffer2.append(stringBuffer3.append(stringBuffer4.append("<font face='roboto'>").append(this.val$featureName).toString()).append(": <font color='#41c300'>").toString()).append(i2 < this.val$min ? this.val$min : i2).toString()).append("</font>").toString()));
            }
        };
        seekBar2.setOnSeekBarChangeListener(onSeekBarChangeListener);
        NativeCall.Toggle(ctx, i4, seekBar2.getProgress(), false, str2);
        linearLayout3.addView(powerText2);
        linearLayout3.addView(seekBar2);
        linearLayout.addView(linearLayout3);
    }

    public static void addbutton(String str, String str2, LinearLayout linearLayout) {
        FancyButton fancyButton;
        ViewGroup.LayoutParams layoutParams;
        View.OnClickListener onClickListener;
        ViewGroup viewGroup;
        ViewGroup.LayoutParams layoutParams2;
        String str3 = str;
        new FancyButton(ctx);
        FancyButton fancyButton2 = fancyButton;
        fancyButton2.setBackgroundColor(Warna.Dasar);
        fancyButton2.setFocusBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        fancyButton2.setElevation((float) 20);
        fancyButton2.setRadius(100);
        fancyButton2.setText(str3);
        fancyButton2.setPadding(20, 20, 20, 20);
        fancyButton2.setTextColor(Warna.Teks);
        fancyButton2.setIconColor(Warna.Teks);
        fancyButton2.setIconPadding(10, 10, 10, 10);
        fancyButton2.setIconPosition(1);
        fancyButton2.setClickable(true);
        fancyButton2.setTextSize(12);
        new LinearLayout.LayoutParams(-1, -2);
        fancyButton2.setLayoutParams(layoutParams);
        fancyButton2.setIconResource(str2);
        new View.OnClickListener(str3) {
            private final String val$NameHack;

            {
                this.val$NameHack = r6;
            }

            @Override
            public void onClick(View view) {
                View view2 = view;
                NativeCall.Toggle(ModMenuList.ctx, 0, 0, true, this.val$NameHack);
            }
        };
        fancyButton2.setOnClickListener(onClickListener);
        new LinearLayout(ctx);
        ViewGroup viewGroup2 = viewGroup;
        new LinearLayout.LayoutParams(-1, -2);
        viewGroup2.setLayoutParams(layoutParams2);
        viewGroup2.setPadding(20, 10, 20, 10);
        viewGroup2.addView(fancyButton2);
        linearLayout.addView(viewGroup2);
    }

    public static void addspinner(String str, String str2, LinearLayout linearLayout) {
        Chooser chooser;
        new Chooser();
        Chooser chooser2 = chooser;
        chooser2.FastSetup(ctx, str, str2.split(","));
        linearLayout.addView(chooser2.getSpin_view_main());
    }

    public static void addaction(String str, String str2, LinearLayout linearLayout) {
        FancyButton fancyButton;
        ViewGroup.LayoutParams layoutParams;
        LinearLayout linearLayout2;
        LinearLayout linearLayout3;
        StringBuffer stringBuffer;
        View.OnClickListener onClickListener;
        String str3 = str;
        int parseInt = Integer.parseInt(str2);
        new FancyButton(ctx);
        FancyButton fancyButton2 = fancyButton;
        fancyButton2.setText(str3);
        fancyButton2.setTextSize(14);
        fancyButton2.setIconColor(-1);
        fancyButton2.setTextColor(-1);
        fancyButton2.setIconResource("");
        fancyButton2.setIconPadding(20, 20, 20, 20);
        new LinearLayout.LayoutParams(-1, -2);
        fancyButton2.setLayoutParams(layoutParams);
        fancyButton2.setPadding(20, 10, 10, 10);
        fancyButton2.setIconPosition(2);
        fancyButton2.setBackgroundColor(0);
        fancyButton2.setFocusBackgroundColor(Warna.Dasar);
        fancyButton2.setClickable(true);
        new LinearLayout(ctx);
        gaje = linearLayout2;
        new LinearLayout(ctx);
        Action_View = linearLayout3;
        new StringBuffer();
        Shared.setstring(stringBuffer.append("action").append(str3).toString(), "");
        new View.OnClickListener(parseInt, fancyButton2) {
            private final int val$Index;
            private final FancyButton val$lol;

            {
                this.val$Index = r7;
                this.val$lol = r8;
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
                    ModMenuList.ActionPower.Show(this.val$Index);
                } catch (Exception e) {
                    Toast.makeText(ModMenuList.ctx, e.getMessage(), 0).show();
                }
                this.val$lol.setTextSize(14);
                this.val$lol.setClickable(false);
                new Handler();
                new Runnable(this, this.val$lol) {
                    private final AnonymousClass100000007 this$0;
                    private final FancyButton val$lol;

                    {
                        this.this$0 = r7;
                        this.val$lol = r8;
                    }

                    static AnonymousClass100000007 access$0(AnonymousClass100000006 r4) {
                        return r4.this$0;
                    }

                    @Override
                    public void run() {
                        this.val$lol.setClickable(true);
                    }
                };
                boolean postDelayed = handler.postDelayed(runnable, (long) 500);
            }
        };
        fancyButton2.setOnClickListener(onClickListener);
        fancyButton2.setGravity(16);
        linearLayout.addView(fancyButton2);
    }

    public static void addtoggle(String str, LinearLayout linearLayout) {
        Switch switchR;
        ViewGroup.LayoutParams layoutParams;
        ColorStateList colorStateList;
        Shortcut shortcut;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        View.OnLongClickListener onLongClickListener;
        String str2 = str;
        LinearLayout linearLayout2 = linearLayout;
        new Switch(ctx);
        Switch switchR2 = switchR;
        switchR2.setText(str2);
        switchR2.setTextSize((float) 14);
        switchR2.setPadding(20, 20, 10, 20);
        switchR2.setTextColor(-1);
        new LinearLayout.LayoutParams(-1, -2);
        switchR2.setLayoutParams(layoutParams);
        ColorStateList colorStateList2 = colorStateList;
        int[][] iArr = new int[3][];
        int[][] iArr2 = iArr;
        iArr[0] = new int[]{-16842910};
        int[][] iArr3 = iArr2;
        int[][] iArr4 = iArr3;
        iArr3[1] = new int[]{16842912};
        int[][] iArr5 = iArr4;
        iArr5[2] = new int[0];
        new ColorStateList(iArr5, new int[]{-16776961, -16711936, -7829368});
        ColorStateList colorStateList3 = colorStateList2;
        if (Build.VERSION.SDK_INT >= 21) {
            switchR2.getThumbDrawable().setTintList(colorStateList3);
            switchR2.getTrackDrawable().setTintList(colorStateList3);
        }
        new Shortcut(ctx);
        Shortcut shortcut2 = shortcut;
        new CompoundButton.OnCheckedChangeListener(shortcut2, switchR2, str2) {
            private final Switch val$lol;
            private final Shortcut val$shortcut;
            private final String val$str;

            {
                this.val$shortcut = r8;
                this.val$lol = r9;
                this.val$str = r10;
            }

            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                CompoundButton compoundButton2 = compoundButton;
                boolean z2 = z;
                this.val$shortcut.Notice(this.val$lol);
                NativeCall.Toggle(ModMenuList.ctx, 0, 0, this.val$lol.isChecked(), this.val$str);
            }
        };
        switchR2.setOnCheckedChangeListener(onCheckedChangeListener);
        new View.OnLongClickListener(shortcut2, switchR2, str2) {
            private final Switch val$lol;
            private final Shortcut val$shortcut;
            private final String val$str;

            {
                this.val$shortcut = r8;
                this.val$lol = r9;
                this.val$str = r10;
            }

            @Override
            public boolean onLongClick(View view) {
                View view2 = view;
                this.val$shortcut.addToggle(this.val$lol, this.val$str);
                return false;
            }
        };
        switchR2.setOnLongClickListener(onLongClickListener);
        linearLayout2.addView(switchR2);
    }

    public static void addlabel(String str, LinearLayout linearLayout) {
        Category category;
        new Category(ctx);
        lol = category;
        lol.setText(str);
        lol.setIconResource("");
        lol.setGravity(16);
        lol.setRadius(new int[]{0, 0, 0, 0});
        linearLayout.addView(lol);
    }

    public static void addCategory(String str, String str2, LinearLayout linearLayout) {
        Category category;
        View.OnClickListener onClickListener;
        new Category(ctx);
        Category category2 = category;
        category2.setText(str);
        category2.setIconResource(str2);
        category2.setGravity(16);
        new View.OnClickListener(CategoryIndex, category2) {
            private final int val$index;
            private final Category val$lol;

            {
                this.val$index = r7;
                this.val$lol = r8;
            }

            @Override
            public void onClick(View view) {
                View view2 = view;
                ModMenuList.Reset_Category();
                ModMenuList.ShowCategory(this.val$index);
                this.val$lol.setBackgroundColor(Warna.Dasar);
            }
        };
        category2.setOnClickListener(onClickListener);
        CategoryIndex++;
        linearLayout.addView(category2);
    }

    public ModMenuList() {
    }
}

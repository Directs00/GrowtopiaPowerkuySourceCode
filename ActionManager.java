package powerkuy.modmenu;

import android.content.Context;
import android.widget.LinearLayout;

public class ActionManager {
    private LinearLayout Category_list;
    private LinearLayout Extended;
    private LinearLayout Last_Category;
    public LinearLayout Main_Layout;

    public ActionManager(Context context, String[] strArr) {
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        CustomTile customTile;
        CustomTile customTile2;
        LinearLayout linearLayout3;
        Context context2 = context;
        String[] strArr2 = strArr;
        new LinearLayout(context2);
        this.Main_Layout = linearLayout;
        this.Main_Layout.setOrientation(1);
        this.Main_Layout.setPadding(30, 0, 30, 0);
        for (int i = 0; i < strArr2.length; i++) {
            String str = strArr2[i];
            if (str.contains("action_")) {
                new LinearLayout(context2);
                this.Category_list = linearLayout3;
                this.Category_list.setOrientation(1);
            } else if (str.contains("endaction")) {
                this.Main_Layout.addView(this.Category_list);
            }
            if (str.contains("label_")) {
                ModMenuList.addlabel(str.replace("label_", ""), this.Category_list);
            } else if (str.contains("Toggle_")) {
                ModMenuList.addtoggle(str.replace("Toggle_", ""), this.Category_list);
            } else if (str.contains("Spinner_")) {
                String[] split = str.split("_");
                ModMenuList.addspinner(split[1], split[2], this.Category_list);
            } else if (str.contains("ButtonIcon_")) {
                String[] split2 = str.split("_");
                ModMenuList.addbutton(split2[1], split2[2], this.Category_list);
            } else if (str.contains("Button_")) {
                ModMenuList.addbutton(str.split("_")[1], "", this.Category_list);
            } else if (str.contains("SeekBar_")) {
                String[] split3 = str.split("_");
                ModMenuList.addSeekBar(0, split3[1], Integer.parseInt(split3[2]), Integer.parseInt(split3[3]), this.Category_list);
            } else if (str.contains("ButtonOnOff_")) {
                String[] split4 = str.split("_");
                ModMenuList.addbuttononoff(split4[1], "", split4[2], "", this.Category_list);
            } else if (str.contains("Edit_")) {
                String[] split5 = str.split("_");
                ModMenuList.addedit(split5[1], this.Category_list, split5[2]);
            } else if (str.contains("CustomTile_")) {
                new CustomTile(context2, str.replace("CustomTile_", ""));
                this.Category_list.addView(customTile2.main);
            } else if (str.contains("CustomTileAdd_")) {
                String[] split6 = str.split("_");
                new CustomTile(context2, split6[1], Integer.parseInt(split6[2]), Integer.parseInt(split6[3]));
                this.Category_list.addView(customTile.main);
            } else if (str.contains("ButtonE_")) {
                String[] split7 = str.split("_");
                new LinearLayout(context2);
                this.Extended = linearLayout2;
                this.Extended.setOrientation(1);
                this.Extended.setVisibility(8);
                this.Extended.setPadding(30, 0, 0, 0);
                this.Last_Category = this.Category_list;
                this.Category_list = this.Extended;
                ModMenuList.addEtoggle(split7[1], this.Category_list, this.Last_Category, Integer.parseInt(split7[2]));
            } else if (str.contains("endex")) {
                this.Last_Category.addView(this.Category_list);
                this.Category_list = this.Last_Category;
            }
        }
    }

    public LinearLayout GetActionByIndex(int i) {
        return (LinearLayout) this.Main_Layout.getChildAt(i);
    }

    public void Show(int i) {
        int i2 = i;
        for (int i3 = 0; i3 < this.Main_Layout.getChildCount(); i3++) {
            this.Main_Layout.getChildAt(i3).setVisibility(8);
        }
        this.Main_Layout.getChildAt(i2).setVisibility(0);
    }
}

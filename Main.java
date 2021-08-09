package powerkuy.modmenu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Main extends Activity {
    public static String GameActivity = "com.rtsoft.growtopia.Main";
    public static boolean game = false;

    /* access modifiers changed from: protected */
    @Override
    public void onCreate(Bundle bundle) {
        Intent intent;
        super.onCreate(bundle);
        WindowPermision.Start(this);
        if (!game) {
            try {
                if (ModMenuUI.menu_all_view == null) {
                    new Intent(this, Class.forName(GameActivity));
                    startActivity(intent);
                    game = true;
                }
            } catch (ClassNotFoundException e) {
                ClassNotFoundException classNotFoundException = e;
                game = false;
                boolean requestWindowFeature = requestWindowFeature(1);
                getWindow().setFlags(1024, 1024);
            }
        }
    }

    @Override
    public void onActivityReenter(int i, Intent intent) {
        super.onActivityReenter(i, intent);
        game = true;
    }

    /* access modifiers changed from: protected */
    @Override
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        finish();
    }

    public Main() {
    }
}

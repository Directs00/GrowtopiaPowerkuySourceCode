package powerkuy.modmenu;

import android.os.AsyncTask;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/* compiled from: PowerJson */
class GetStringUrl extends AsyncTask<Void, Void, Void> {
    String Data_Result = "";
    public boolean Done = false;
    String data = "";
    String dataParsed = "";
    String singleParsed = "";
    String target_url = "";

    /* access modifiers changed from: protected */
    public Object doInBackground(Object[] objArr) {
        return doInBackground((Void[]) objArr);
    }

    /* access modifiers changed from: protected */
    public void onPostExecute(Object obj) {
        onPostExecute((Void) obj);
    }

    public String GetData() {
        return this.data;
    }

    public GetStringUrl(String str) {
        this.target_url = str;
    }

    /* access modifiers changed from: protected */
    @Override
    public Void doInBackground(Void[] voidArr) {
        URL url;
        BufferedReader bufferedReader;
        Reader reader;
        StringBuffer stringBuffer;
        Void[] voidArr2 = voidArr;
        try {
            new URL(this.target_url);
            new InputStreamReader(((HttpURLConnection) url.openConnection()).getInputStream());
            new BufferedReader(reader);
            BufferedReader bufferedReader2 = bufferedReader;
            String str = "";
            while (str != null) {
                str = bufferedReader2.readLine();
                new StringBuffer();
                this.data = stringBuffer.append(this.data).append(str).toString();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v53, resolved type: android.widget.ScrollView} */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    @java.lang.Override
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onPostExecute(java.lang.Void r25) {
        /*
            r24 = this;
            r1 = r24
            r2 = r25
            r15 = r1
            r16 = r2
            super.onPostExecute(r16)
            org.json.JSONObject r15 = new org.json.JSONObject     // Catch:{ JSONException -> 0x024d }
            r23 = r15
            r15 = r23
            r16 = r23
            r17 = r1
            r0 = r17
            java.lang.String r0 = r0.data     // Catch:{ JSONException -> 0x024d }
            r17 = r0
            r16.<init>(r17)     // Catch:{ JSONException -> 0x024d }
            r4 = r15
            r15 = r4
            java.lang.String r16 = "Version"
            int r15 = r15.getInt(r16)     // Catch:{ JSONException -> 0x024d }
            int r16 = powerkuy.modmenu.NativeCall.whatlol()     // Catch:{ JSONException -> 0x024d }
            r0 = r16
            if (r15 <= r0) goto L_0x024c
            powerkuy.modmenu.SimpleAlert r15 = new powerkuy.modmenu.SimpleAlert     // Catch:{ JSONException -> 0x024d }
            r23 = r15
            r15 = r23
            r16 = r23
            r16.<init>()     // Catch:{ JSONException -> 0x024d }
            r5 = r15
            android.widget.LinearLayout r15 = new android.widget.LinearLayout     // Catch:{ JSONException -> 0x024d }
            r23 = r15
            r15 = r23
            r16 = r23
            android.content.Context r17 = powerkuy.modmenu.ModMenuList.ctx     // Catch:{ JSONException -> 0x024d }
            r16.<init>(r17)     // Catch:{ JSONException -> 0x024d }
            r6 = r15
            r15 = r6
            r16 = 1
            r15.setOrientation(r16)     // Catch:{ JSONException -> 0x024d }
            android.widget.Toolbar$LayoutParams r15 = new android.widget.Toolbar$LayoutParams     // Catch:{ JSONException -> 0x024d }
            r23 = r15
            r15 = r23
            r16 = r23
            r17 = 0
            r18 = 0
            r16.<init>(r17, r18)     // Catch:{ JSONException -> 0x024d }
            r7 = r15
            r15 = r7
            r16 = -1
            r0 = r16
            r15.width = r0     // Catch:{ JSONException -> 0x024d }
            r15 = r7
            r16 = -1
            r0 = r16
            r15.height = r0     // Catch:{ JSONException -> 0x024d }
            r15 = r6
            r16 = r7
            r15.setLayoutParams(r16)     // Catch:{ JSONException -> 0x024d }
            android.widget.ScrollView r15 = new android.widget.ScrollView     // Catch:{ JSONException -> 0x024d }
            r23 = r15
            r15 = r23
            r16 = r23
            android.content.Context r17 = powerkuy.modmenu.ModMenuList.ctx     // Catch:{ JSONException -> 0x024d }
            r16.<init>(r17)     // Catch:{ JSONException -> 0x024d }
            r8 = r15
            android.widget.Toolbar$LayoutParams r15 = new android.widget.Toolbar$LayoutParams     // Catch:{ JSONException -> 0x024d }
            r23 = r15
            r15 = r23
            r16 = r23
            r17 = 0
            r18 = 0
            r16.<init>(r17, r18)     // Catch:{ JSONException -> 0x024d }
            r9 = r15
            r15 = r9
            r16 = -1
            r0 = r16
            r15.width = r0     // Catch:{ JSONException -> 0x024d }
            r15 = r9
            r16 = -1
            r0 = r16
            r15.height = r0     // Catch:{ JSONException -> 0x024d }
            r15 = r8
            r16 = r9
            r15.setLayoutParams(r16)     // Catch:{ JSONException -> 0x024d }
            android.widget.TextView r15 = new android.widget.TextView     // Catch:{ JSONException -> 0x024d }
            r23 = r15
            r15 = r23
            r16 = r23
            android.content.Context r17 = powerkuy.modmenu.ModMenuList.ctx     // Catch:{ JSONException -> 0x024d }
            r16.<init>(r17)     // Catch:{ JSONException -> 0x024d }
            r10 = r15
            r15 = r10
            java.lang.StringBuffer r16 = new java.lang.StringBuffer     // Catch:{ JSONException -> 0x024d }
            r23 = r16
            r16 = r23
            r17 = r23
            r17.<init>()     // Catch:{ JSONException -> 0x024d }
            java.lang.StringBuffer r17 = new java.lang.StringBuffer     // Catch:{ JSONException -> 0x024d }
            r23 = r17
            r17 = r23
            r18 = r23
            r18.<init>()     // Catch:{ JSONException -> 0x024d }
            java.lang.StringBuffer r18 = new java.lang.StringBuffer     // Catch:{ JSONException -> 0x024d }
            r23 = r18
            r18 = r23
            r19 = r23
            r19.<init>()     // Catch:{ JSONException -> 0x024d }
            java.lang.StringBuffer r19 = new java.lang.StringBuffer     // Catch:{ JSONException -> 0x024d }
            r23 = r19
            r19 = r23
            r20 = r23
            r20.<init>()     // Catch:{ JSONException -> 0x024d }
            java.lang.StringBuffer r20 = new java.lang.StringBuffer     // Catch:{ JSONException -> 0x024d }
            r23 = r20
            r20 = r23
            r21 = r23
            r21.<init>()     // Catch:{ JSONException -> 0x024d }
            r21 = r4
            java.lang.String r22 = "Title"
            java.lang.String r21 = r21.getString(r22)     // Catch:{ JSONException -> 0x024d }
            java.lang.StringBuffer r20 = r20.append(r21)     // Catch:{ JSONException -> 0x024d }
            java.lang.String r21 = "\n\n"
            java.lang.StringBuffer r20 = r20.append(r21)     // Catch:{ JSONException -> 0x024d }
            java.lang.String r20 = r20.toString()     // Catch:{ JSONException -> 0x024d }
            java.lang.StringBuffer r19 = r19.append(r20)     // Catch:{ JSONException -> 0x024d }
            r20 = r4
            java.lang.String r21 = "Info"
            java.lang.String r20 = r20.getString(r21)     // Catch:{ JSONException -> 0x024d }
            java.lang.StringBuffer r19 = r19.append(r20)     // Catch:{ JSONException -> 0x024d }
            java.lang.String r19 = r19.toString()     // Catch:{ JSONException -> 0x024d }
            java.lang.StringBuffer r18 = r18.append(r19)     // Catch:{ JSONException -> 0x024d }
            java.lang.String r19 = "\n\n"
            java.lang.StringBuffer r18 = r18.append(r19)     // Catch:{ JSONException -> 0x024d }
            java.lang.String r18 = r18.toString()     // Catch:{ JSONException -> 0x024d }
            java.lang.StringBuffer r17 = r17.append(r18)     // Catch:{ JSONException -> 0x024d }
            r18 = r4
            java.lang.String r19 = "Changelogs"
            java.lang.String r18 = r18.getString(r19)     // Catch:{ JSONException -> 0x024d }
            java.lang.StringBuffer r17 = r17.append(r18)     // Catch:{ JSONException -> 0x024d }
            java.lang.String r17 = r17.toString()     // Catch:{ JSONException -> 0x024d }
            java.lang.StringBuffer r16 = r16.append(r17)     // Catch:{ JSONException -> 0x024d }
            java.lang.String r17 = "\n\n"
            java.lang.StringBuffer r16 = r16.append(r17)     // Catch:{ JSONException -> 0x024d }
            java.lang.String r16 = r16.toString()     // Catch:{ JSONException -> 0x024d }
            r15.setText(r16)     // Catch:{ JSONException -> 0x024d }
            r15 = r10
            r16 = 14
            r0 = r16
            float r0 = (float) r0     // Catch:{ JSONException -> 0x024d }
            r16 = r0
            r15.setTextSize(r16)     // Catch:{ JSONException -> 0x024d }
            r15 = r10
            r16 = -1
            r15.setTextColor(r16)     // Catch:{ JSONException -> 0x024d }
            android.widget.Toolbar$LayoutParams r15 = new android.widget.Toolbar$LayoutParams     // Catch:{ JSONException -> 0x024d }
            r23 = r15
            r15 = r23
            r16 = r23
            r17 = 0
            r18 = 0
            r16.<init>(r17, r18)     // Catch:{ JSONException -> 0x024d }
            r11 = r15
            r15 = r11
            r16 = -1
            r0 = r16
            r15.width = r0     // Catch:{ JSONException -> 0x024d }
            r15 = r11
            r16 = -2
            r0 = r16
            r15.height = r0     // Catch:{ JSONException -> 0x024d }
            r15 = r10
            r16 = r11
            r15.setLayoutParams(r16)     // Catch:{ JSONException -> 0x024d }
            mehdi.sakout.fancybuttons.FancyButton r15 = new mehdi.sakout.fancybuttons.FancyButton     // Catch:{ JSONException -> 0x024d }
            r23 = r15
            r15 = r23
            r16 = r23
            android.content.Context r17 = powerkuy.modmenu.ModMenuList.ctx     // Catch:{ JSONException -> 0x024d }
            r16.<init>(r17)     // Catch:{ JSONException -> 0x024d }
            r12 = r15
            r15 = r12
            java.lang.String r16 = "Download"
            r15.setText(r16)     // Catch:{ JSONException -> 0x024d }
            r15 = r12
            int r16 = powerkuy.modmenu.Warna.Dasar     // Catch:{ JSONException -> 0x024d }
            r15.setBackgroundColor(r16)     // Catch:{ JSONException -> 0x024d }
            r15 = r12
            r16 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r15.setFocusBackgroundColor(r16)     // Catch:{ JSONException -> 0x024d }
            r15 = r12
            int r16 = powerkuy.modmenu.Warna.Teks     // Catch:{ JSONException -> 0x024d }
            r15.setTextColor(r16)     // Catch:{ JSONException -> 0x024d }
            r15 = r12
            r16 = 14
            r15.setTextSize(r16)     // Catch:{ JSONException -> 0x024d }
            r15 = r12
            int r16 = powerkuy.modmenu.Warna.Teks     // Catch:{ JSONException -> 0x024d }
            r15.setIconColor(r16)     // Catch:{ JSONException -> 0x024d }
            r15 = r12
            r16 = 10
            r17 = 10
            r18 = 10
            r19 = 10
            r15.setIconPadding(r16, r17, r18, r19)     // Catch:{ JSONException -> 0x024d }
            r15 = r12
            r16 = 15
            r17 = 15
            r18 = 15
            r19 = 15
            r15.setPadding(r16, r17, r18, r19)     // Catch:{ JSONException -> 0x024d }
            r15 = r12
            android.widget.Toolbar$LayoutParams r16 = new android.widget.Toolbar$LayoutParams     // Catch:{ JSONException -> 0x024d }
            r23 = r16
            r16 = r23
            r17 = r23
            r18 = -1
            r19 = -2
            r17.<init>(r18, r19)     // Catch:{ JSONException -> 0x024d }
            r15.setLayoutParams(r16)     // Catch:{ JSONException -> 0x024d }
            r15 = r12
            java.lang.String r16 = ""
            r15.setIconResource((java.lang.String) r16)     // Catch:{ JSONException -> 0x024d }
            r15 = r12
            r16 = 1
            r15.setClickable(r16)     // Catch:{ JSONException -> 0x024d }
            r15 = r12
            powerkuy.modmenu.GetStringUrl$100000000 r16 = new powerkuy.modmenu.GetStringUrl$100000000     // Catch:{ JSONException -> 0x024d }
            r23 = r16
            r16 = r23
            r17 = r23
            r18 = r1
            r19 = r5
            r20 = r4
            r17.<init>(r18, r19, r20)     // Catch:{ JSONException -> 0x024d }
            r15.setOnClickListener(r16)     // Catch:{ JSONException -> 0x024d }
            android.widget.LinearLayout r15 = new android.widget.LinearLayout     // Catch:{ JSONException -> 0x024d }
            r23 = r15
            r15 = r23
            r16 = r23
            android.content.Context r17 = powerkuy.modmenu.ModMenuList.ctx     // Catch:{ JSONException -> 0x024d }
            r16.<init>(r17)     // Catch:{ JSONException -> 0x024d }
            r13 = r15
            r15 = r13
            r16 = 1
            r15.setOrientation(r16)     // Catch:{ JSONException -> 0x024d }
            r15 = r13
            android.widget.Toolbar$LayoutParams r16 = new android.widget.Toolbar$LayoutParams     // Catch:{ JSONException -> 0x024d }
            r23 = r16
            r16 = r23
            r17 = r23
            r18 = -1
            r19 = -1
            r17.<init>(r18, r19)     // Catch:{ JSONException -> 0x024d }
            r15.setLayoutParams(r16)     // Catch:{ JSONException -> 0x024d }
            r15 = r13
            r16 = r10
            r15.addView(r16)     // Catch:{ JSONException -> 0x024d }
            r15 = r13
            r16 = r12
            r15.addView(r16)     // Catch:{ JSONException -> 0x024d }
            r15 = r8
            r16 = r13
            r15.addView(r16)     // Catch:{ JSONException -> 0x024d }
            r15 = r6
            r16 = r8
            r15.addView(r16)     // Catch:{ JSONException -> 0x024d }
            r15 = r6
            r16 = 30
            r17 = 30
            r18 = 30
            r19 = 30
            r15.setPadding(r16, r17, r18, r19)     // Catch:{ JSONException -> 0x024d }
            r15 = r5
            android.content.Context r16 = powerkuy.modmenu.ModMenuList.ctx     // Catch:{ JSONException -> 0x024d }
            r17 = r6
            r15.Show((android.content.Context) r16, (android.widget.LinearLayout) r17)     // Catch:{ JSONException -> 0x024d }
        L_0x024c:
            return
        L_0x024d:
            r15 = move-exception
            r4 = r15
            goto L_0x024c
        */
        throw new UnsupportedOperationException("Method not decompiled: powerkuy.modmenu.GetStringUrl.onPostExecute(java.lang.Void):void");
    }
}

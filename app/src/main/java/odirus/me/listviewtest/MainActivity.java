package odirus.me.listviewtest;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by hangjing on 2016/3/8.
 */
public class MainActivity extends Activity {
    private String[] infoNames = {"huangjing", "odirus", "huangjingscnc"};
    private String[] infoPhones = {"111111", "111111", "111111"};
    private String[] infoRegions = {"sichuan", "chengdu", "nanchong"};

    private ArrayList<Map <String, Object>> mInfoList = new ArrayList<>();
    private ListView mListView;


    @Override
    public void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        mListView = new ListView(this);

        for (int i = 0; i < infoNames.length; i++) {
            Map<String, Object> item = new HashMap<>();
            item.put("img", R.drawable.apple);
            item.put("name", infoNames[i]);
            item.put("phone", infoPhones[i]);
            item.put("region", infoRegions[i]);
            mInfoList.add(item);
        }

        SimpleAdapter adapter = new SimpleAdapter(
                this,
                mInfoList,
                R.layout.info,
                new String[]{"img", "name", "phone", "region"},
                new int[]{R.id.info_img, R.id.info_name, R.id.info_phone, R.id.info_region});
        mListView.setAdapter(adapter);
        setContentView(mListView);
    }
}

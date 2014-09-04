package me.wyu.searchcrad.ui;

import me.wyu.searchcrad.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;

import com.amap.api.maps2d.MapView;

public class AddCardActivity extends Activity {

	private MapView mapView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_addcard);

		mapView = (MapView) findViewById(R.id.activity_addcard_map);
		mapView.onCreate(savedInstanceState);// 此方法必须重写
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
	}

	public static final void startActivity(Fragment fragment) {
		if (fragment == null) {
			return;
		}

		Intent intent = new Intent(fragment.getActivity(),
				AddCardActivity.class);
		fragment.startActivity(intent);
	}
}

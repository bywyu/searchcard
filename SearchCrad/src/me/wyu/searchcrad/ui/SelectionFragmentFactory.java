package me.wyu.searchcrad.ui;

import android.os.Bundle;

public class SelectionFragmentFactory {

	public static <T extends BaseFragment> T createFragment(Class<T> c,
			Bundle args) {
		T fragment = null;
		try {
			fragment = (T) Class.forName(c.getName()).newInstance();
			if (args != null)
				fragment.setArguments(args);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return fragment;
	}

	public static <T extends BaseFragment> T createFragment(Class<T> c) {
		return createFragment(c, null);
	}
}

package me.wyu.searchcrad.ui;

public enum FragmentType {

	MAINFRAGMENT(MainFragment.class);

	private Class<? extends BaseFragment> mClass;

	private FragmentType(Class<? extends BaseFragment> fragment) {
		mClass = fragment;
	}

	public Class<?> getFragmentClass() {
		return mClass;
	}
}

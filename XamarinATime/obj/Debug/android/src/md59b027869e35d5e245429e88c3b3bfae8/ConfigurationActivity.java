package md59b027869e35d5e245429e88c3b3bfae8;


public class ConfigurationActivity
	extends android.app.Activity
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCreate:(Landroid/os/Bundle;)V:GetOnCreate_Landroid_os_Bundle_Handler\n" +
			"";
		mono.android.Runtime.register ("XamarinATime.ConfigurationActivity, XamarinATime, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", ConfigurationActivity.class, __md_methods);
	}


	public ConfigurationActivity () throws java.lang.Throwable
	{
		super ();
		if (getClass () == ConfigurationActivity.class)
			mono.android.TypeManager.Activate ("XamarinATime.ConfigurationActivity, XamarinATime, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onCreate (android.os.Bundle p0)
	{
		n_onCreate (p0);
	}

	private native void n_onCreate (android.os.Bundle p0);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
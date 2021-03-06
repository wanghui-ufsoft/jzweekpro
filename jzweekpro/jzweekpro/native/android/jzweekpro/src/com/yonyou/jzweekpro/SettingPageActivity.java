package com.yonyou.jzweekpro;

import com.yonyou.uap.um.application.ApplicationContext;
import com.yonyou.uap.um.base.*;
import com.yonyou.uap.um.common.*;
import com.yonyou.uap.um.third.*;
import com.yonyou.uap.um.control.*;
import com.yonyou.uap.um.core.*;
import com.yonyou.uap.um.binder.*;
import com.yonyou.uap.um.runtime.*;
import com.yonyou.uap.um.lexer.*;
import com.yonyou.uap.um.widget.*;
import com.yonyou.uap.um.widget.UmpSlidingLayout.SlidingViewType;
import com.yonyou.uap.um.log.ULog;
import java.util.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import android.webkit.*;
import android.content.*;
import android.graphics.*;
import android.widget.ImageView.ScaleType;

public abstract class SettingPageActivity extends UMWindowActivity {

	protected UMWindow SettingPage = null;
protected XVerticalLayout viewPage0 = null;
protected XVerticalLayout panel0 = null;
protected XHorizontalLayout navigatorbar0 = null;
protected UMButton button0 = null;
protected UMListViewBase listviewdefine0 = null;
protected XRelativeLayout panel1 = null;
protected UMLabel label1 = null;
protected UMLabel label0 = null;
protected UMImage image0 = null;

	
	protected final static int ID_SETTINGPAGE = 1696959338;
protected final static int ID_VIEWPAGE0 = 1860909885;
protected final static int ID_PANEL0 = 680251;
protected final static int ID_NAVIGATORBAR0 = 1769943003;
protected final static int ID_BUTTON0 = 1521585974;
protected final static int ID_LISTVIEWDEFINE0 = 1338982218;
protected final static int ID_PANEL1 = 93532575;
protected final static int ID_LABEL1 = 1654334352;
protected final static int ID_LABEL0 = 1816239899;
protected final static int ID_IMAGE0 = 1290926114;

	
	
	@Override
	public String getControllerName() {
		return "SettingPageController";
	}
	
	@Override
	public String getContextName() {
		return "";
	}

	@Override
	public String getNameSpace() {
		return "com.yonyou.jzweekpro";
	}

	protected void onCreate(Bundle savedInstanceState) {
		ULog.logLC("onCreate", this);
		super.onCreate(savedInstanceState);
        onInit(savedInstanceState);
        
	}
	
	@Override
	protected void onStart() {
		ULog.logLC("onStart", this);
		
		super.onStart();
	}

	@Override
	protected void onRestart() {
		ULog.logLC("onRestart", this);
		
		super.onRestart();
	}

	@Override
	protected void onResume() {
		ULog.logLC("onResume", this);
		
		super.onResume();
	}

	@Override
	protected void onPause() {
		ULog.logLC("onPause", this);
		
		super.onPause();
	}

	@Override
	protected void onStop() {
		ULog.logLC("onStop", this);
		
		super.onStop();
	}

	@Override
	protected void onDestroy() {
		ULog.logLC("onDestroy", this);
		
		super.onDestroy();
	}
	
	public  void onInit(Bundle savedInstanceState) {
		ULog.logLC("onInit", this);
		UMActivity context = this;
		registerControl();
		this.getContainer();
		
		/*
		 new Thread() {
			 public void run() {
				 UMPDebugClient.startServer();
			 }
		 }.start();
		*/
		String sys_debug = ApplicationContext.getCurrent(this).getValue("sys_debug");
		if (sys_debug != null && sys_debug.equalsIgnoreCase("true")) {
			UMPDebugClient.waitForDebug();
		}

		IBinderGroup binderGroup = this;
		currentPage = getCurrentWindow(context, binderGroup);
super.setContentView(currentPage);

		
	}
	
	private void registerControl() {
		  idmap.put("SettingPage",ID_SETTINGPAGE);
  idmap.put("viewPage0",ID_VIEWPAGE0);
  idmap.put("panel0",ID_PANEL0);
  idmap.put("navigatorbar0",ID_NAVIGATORBAR0);
  idmap.put("button0",ID_BUTTON0);
  idmap.put("listviewdefine0",ID_LISTVIEWDEFINE0);
  idmap.put("panel1",ID_PANEL1);
  idmap.put("label1",ID_LABEL1);
  idmap.put("label0",ID_LABEL0);
  idmap.put("image0",ID_IMAGE0);

	}
	
	public void onLoad() {
		ULog.logLC("onLoad", this);
		if(currentPage!=null) {
			currentPage.onLoad();
		}
	
		{ //listviewdefine0 - action:listviewdefine0_onload
    UMEventArgs args = new UMEventArgs(SettingPageActivity.this);
    actionListviewdefine0_onload(listviewdefine0,args);

}
{ //panel1 - action:panel1_onload
    UMEventArgs args = new UMEventArgs(SettingPageActivity.this);
    actionPanel1_onload(panel1,args);

}

	}
	
	public void onDatabinding() {
		ULog.logLC("onDatabinding", this);
		super.onDatabinding();
		
	}
	
	@Override
	public void onReturn(String methodName, Object returnValue) {
		
	}

	@Override
	public void onAfterInit() {
		ULog.logLC("onAfterInit", this);
		
		onLoad();
	}
	
		@Override
	public Map<String,String> getPlugout(String id) {
		XJSON from = this.getUMContext();
		Map<String,String> r = super.getPlugout(id);
		
		return r;	
	}
	
	
	
	public View getNavigatorbar0View(final UMActivity context,IBinderGroup binderGroup) {
navigatorbar0 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_NAVIGATORBAR0
,"padding-left","8"
,"padding-right","8"
,"halign","LEFT"
,"width","fill"
,"title","设置"
,"height","44.0"
,"color","#323232"
,"layout-type","vbox"
,"font-size","14"
,"font-family","default"
,"valign","center"
,"background-image","navbar_login.png"
);
button0 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTON0
,"padding-left","20"
,"halign","left"
,"pressed-image","btn_back_touch"
,"width","88"
,"font-pressed-color","#f2adb2"
,"height","44"
,"color","#e50011"
,"layout-type","hbox"
,"font-size","18"
,"value","返回"
,"onclick","tohome"
,"font-family","default"
,"valign","center"
,"background-image","btn_back"
);
navigatorbar0.addView(button0);

return navigatorbar0;
}
public View getPanel1View(final UMActivity context,IBinderGroup binderGroup) {
panel1 = (XRelativeLayout)ThirdControl.createControl(new XRelativeLayout(context),ID_PANEL1
,"border-bottom-width","1"
,"halign","LEFT"
,"height","44"
,"onload","action:panel1_onload"
,"layout-type","vbox"
,"background","#FFFFFF"
,"width","fill"
,"valign","center"
,"border-bottom-color","#C7C7C7"
);
label1 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL1
,"bindfield","oth"
,"halign","center"
,"widthwrap","32.0"
,"width","wrap"
,"height","wrap"
,"color","#c0c0c0"
,"heightwrap","20.0"
,"layout-type","relative"
,"font-size","14"
,"left","240.0"
,"font-family","default"
,"valign","center"
,"top","10.0"
);
panel1.addView(label1);
label0 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL0
,"bindfield","labelname"
,"halign","center"
,"widthwrap","34.0"
,"width","wrap"
,"height","wrap"
,"color","#000000"
,"heightwrap","20.0"
,"layout-type","relative"
,"font-size","14"
,"margin-left","20"
,"font-family","default"
,"left","50.0"
,"valign","center"
,"top","10.0"
);
panel1.addView(label0);
image0 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_IMAGE0
,"bindfield","picturepath"
,"errimage","icon_refresh.png"
,"padding-top","30"
,"height","30"
,"layout-type","relative"
,"width","30"
,"left","10.0"
,"scaletype","fitcenter"
,"src","icon_refresh.png"
,"top","10.0"
);
panel1.addView(image0);

return panel1;
}
public View getListviewdefine0View(final UMActivity context,IBinderGroup binderGroup) {
listviewdefine0 = (UMListViewBase)ThirdControl.createControl(new UMListViewBase(context),ID_LISTVIEWDEFINE0
,"bindfield","setparams"
,"halign","center"
,"height","320"
,"onload","action:listviewdefine0_onload"
,"layout-type","vbox"
,"layout","vbox"
,"width","fill"
,"valign","TOP"
);
listviewdefine0.addListItemView("getPanel1View");

return listviewdefine0;
}
public View getPanel0View(final UMActivity context,IBinderGroup binderGroup) {
panel0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL0
,"halign","center"
,"height","0"
,"weight","1"
,"layout-type","vbox"
,"width","fill"
,"valign","TOP"
);
View navigatorbar0 = (View) getNavigatorbar0View((UMActivity)context,binderGroup);
panel0.addView(navigatorbar0);
View listviewdefine0 = (View) getListviewdefine0View((UMActivity)context,binderGroup);
panel0.addView(listviewdefine0);

return panel0;
}
public View getViewPage0View(final UMActivity context,IBinderGroup binderGroup) {
viewPage0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_VIEWPAGE0
,"halign","center"
,"height","fill"
,"layout-type","vbox"
,"background","#F5F5F5"
,"width","fill"
,"valign","TOP"
);
View panel0 = (View) getPanel0View((UMActivity)context,binderGroup);
viewPage0.addView(panel0);

return viewPage0;
}
public UMWindow getCurrentWindow(final UMActivity context,IBinderGroup binderGroup) {
SettingPage = (UMWindow)ThirdControl.createControl(new UMWindow(context),ID_SETTINGPAGE
,"halign","center"
,"height","fill"
,"layout-type","linear"
,"layout","vbox"
,"width","fill"
,"controller","SettingPageController"
,"valign","TOP"
,"namespace","com.yonyou.jzweekpro"
);
View viewPage0 = (View) getViewPage0View((UMActivity)context,binderGroup);
SettingPage.addView(viewPage0);

return (UMWindow)SettingPage;
}

	
	public void actionTohome(View control, UMEventArgs args) {
    String actionid = "tohome";
    args.put("viewid","com.yonyou.jzweekpro.Home");
    args.put("iskeep","false");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}
public void actionPanel1_onload(View control, UMEventArgs args) {
    String actionid = "panel1_onload";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "this.panel1_onload()",UMActivity.getViewId(control),args);
}
public void actionListviewdefine0_onload(View control, UMEventArgs args) {
    String actionid = "listviewdefine0_onload";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "this.listviewdefine0_onload()",UMActivity.getViewId(control),args);
}


}

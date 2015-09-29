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

public abstract class WeekContentSActivity extends UMWindowActivity {

	protected UMWindow WeekContentS = null;
protected XVerticalLayout viewPage0 = null;
protected XVerticalLayout panel0 = null;
protected XHorizontalLayout navigatorbar0 = null;
protected UMButton button0 = null;
protected UMWebView webview0 = null;

	
	protected final static int ID_WEEKCONTENTS = 673945716;
protected final static int ID_VIEWPAGE0 = 1203731025;
protected final static int ID_PANEL0 = 807049858;
protected final static int ID_NAVIGATORBAR0 = 22456623;
protected final static int ID_BUTTON0 = 357246489;
protected final static int ID_WEBVIEW0 = 1863216610;

	
	
	@Override
	public String getControllerName() {
		return "WeekContentSController";
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
		  idmap.put("WeekContentS",ID_WEEKCONTENTS);
  idmap.put("viewPage0",ID_VIEWPAGE0);
  idmap.put("panel0",ID_PANEL0);
  idmap.put("navigatorbar0",ID_NAVIGATORBAR0);
  idmap.put("button0",ID_BUTTON0);
  idmap.put("webview0",ID_WEBVIEW0);

	}
	
	public void onLoad() {
		ULog.logLC("onLoad", this);
		if(currentPage!=null) {
			currentPage.onLoad();
		}
	
		{ //webview0 - action:webview0_onload
    UMEventArgs args = new UMEventArgs(WeekContentSActivity.this);
    actionWebview0_onload(webview0,args);

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
,"height","44.0"
,"color","#323232"
,"width","fill"
,"font-size","17"
,"layout-type","vbox"
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
,"onclick","action:button0_onclick"
,"font-family","default"
,"valign","center"
,"background-image","btn_back"
);
navigatorbar0.addView(button0);

return navigatorbar0;
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
webview0 = (UMWebView)ThirdControl.createControl(new UMWebView(context),ID_WEBVIEW0
,"bindfield","id"
,"halign","center"
,"height","0"
,"weight","1"
,"onload","action:webview0_onload"
,"layout-type","vbox"
,"layout","vbox"
,"width","fill"
,"valign","TOP"
);
panel0.addView(webview0);

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
WeekContentS = (UMWindow)ThirdControl.createControl(new UMWindow(context),ID_WEEKCONTENTS
,"halign","center"
,"height","fill"
,"layout-type","linear"
,"layout","vbox"
,"width","fill"
,"controller","WeekContentSController"
,"valign","TOP"
,"namespace","com.yonyou.jzweekpro"
);
View viewPage0 = (View) getViewPage0View((UMActivity)context,binderGroup);
WeekContentS.addView(viewPage0);

return (UMWindow)WeekContentS;
}

	
	public void actionButton0_onclick(View control, UMEventArgs args) {
    String actionid = "button0_onclick";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "this.backList()",UMActivity.getViewId(control),args);
}
public void actionWebview0_onload(View control, UMEventArgs args) {
    String actionid = "webview0_onload";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "this.webview0_onload()",UMActivity.getViewId(control),args);
}


}

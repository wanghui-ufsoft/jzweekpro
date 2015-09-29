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

public abstract class WeekListSActivity extends UMWindowActivity {

	protected UMWindow WeekListS = null;
protected XVerticalLayout viewPage0 = null;
protected XVerticalLayout panel0 = null;
protected XHorizontalLayout navigatorbar0 = null;
protected UMButton button0 = null;
protected UMListViewBase listviewdefine0 = null;
protected XHorizontalLayout panel1 = null;
protected XRelativeLayout panel2 = null;
protected UMLabel label2 = null;
protected UMLabel label0 = null;

	
	protected final static int ID_WEEKLISTS = 265893850;
protected final static int ID_VIEWPAGE0 = 204472321;
protected final static int ID_PANEL0 = 823500458;
protected final static int ID_NAVIGATORBAR0 = 656637367;
protected final static int ID_BUTTON0 = 2098258977;
protected final static int ID_LISTVIEWDEFINE0 = 1809920146;
protected final static int ID_PANEL1 = 464450321;
protected final static int ID_PANEL2 = 1118556556;
protected final static int ID_LABEL2 = 502857500;
protected final static int ID_LABEL0 = 1574643560;

	
	
	@Override
	public String getControllerName() {
		return "WeekListSController";
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
		  idmap.put("WeekListS",ID_WEEKLISTS);
  idmap.put("viewPage0",ID_VIEWPAGE0);
  idmap.put("panel0",ID_PANEL0);
  idmap.put("navigatorbar0",ID_NAVIGATORBAR0);
  idmap.put("button0",ID_BUTTON0);
  idmap.put("listviewdefine0",ID_LISTVIEWDEFINE0);
  idmap.put("panel1",ID_PANEL1);
  idmap.put("panel2",ID_PANEL2);
  idmap.put("label2",ID_LABEL2);
  idmap.put("label0",ID_LABEL0);

	}
	
	public void onLoad() {
		ULog.logLC("onLoad", this);
		if(currentPage!=null) {
			currentPage.onLoad();
		}
	
		{ //listviewdefine0 - action:listviewdefine0_onload
    UMEventArgs args = new UMEventArgs(WeekListSActivity.this);
    actionListviewdefine0_onload(listviewdefine0,args);

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
,"title","本期周刊内容"
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
public View getPanel2View(final UMActivity context,IBinderGroup binderGroup) {
panel2 = (XRelativeLayout)ThirdControl.createControl(new XRelativeLayout(context),ID_PANEL2
,"halign","CENTER"
,"height","60.0"
,"weight","1"
,"layout-type","hbox"
,"width","0"
,"onclick","action:panel2_onclick"
,"valign","TOP"
);
label2 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL2
,"bindfield","publishdate"
,"halign","center"
,"widthwrap","34.0"
,"width","wrap"
,"height","wrap"
,"color","#000000"
,"heightwrap","15.0"
,"layout-type","relative"
,"font-size","10"
,"left","230.0"
,"font-family","default"
,"valign","center"
,"top","30.0"
);
panel2.addView(label2);
label0 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL0
,"bindfield","title"
,"halign","center"
,"widthwrap","32.0"
,"width","wrap"
,"height","wrap"
,"color","#000000"
,"heightwrap","20.0"
,"layout-type","relative"
,"font-size","14"
,"left","40.0"
,"font-family","default"
,"valign","center"
,"top","0.0"
);
panel2.addView(label0);

return panel2;
}
public View getPanel1View(final UMActivity context,IBinderGroup binderGroup) {
panel1 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL1
,"border-bottom-width","1"
,"halign","LEFT"
,"height","60.0"
,"layout-type","vbox"
,"background","#FFFFFF"
,"width","fill"
,"valign","center"
,"border-bottom-color","#C7C7C7"
);
View panel2 = (View) getPanel2View((UMActivity)context,binderGroup);
panel1.addView(panel2);

return panel1;
}
public View getListviewdefine0View(final UMActivity context,IBinderGroup binderGroup) {
listviewdefine0 = (UMListViewBase)ThirdControl.createControl(new UMListViewBase(context),ID_LISTVIEWDEFINE0
,"bindfield","articles"
,"halign","center"
,"height","0"
,"weight","1"
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
,"weight","1"
,"height","0"
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
WeekListS = (UMWindow)ThirdControl.createControl(new UMWindow(context),ID_WEEKLISTS
,"halign","center"
,"height","fill"
,"layout-type","linear"
,"layout","vbox"
,"width","fill"
,"controller","WeekListSController"
,"valign","TOP"
,"namespace","com.yonyou.jzweekpro"
);
View viewPage0 = (View) getViewPage0View((UMActivity)context,binderGroup);
WeekListS.addView(viewPage0);

return (UMWindow)WeekListS;
}

	
	public void actionTohome(View control, UMEventArgs args) {
    String actionid = "tohome";
    args.put("viewid","com.yonyou.jzweekpro.Home");
    args.put("iskeep","false");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
UMView.open(args);
}
public void actionListviewdefine0_onload(View control, UMEventArgs args) {
    String actionid = "listviewdefine0_onload";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "this.listviewdefine0_onload()",UMActivity.getViewId(control),args);
}
public void actionPanel2_onclick(View control, UMEventArgs args) {
    String actionid = "panel2_onclick";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "this.tocontentPage()",UMActivity.getViewId(control),args);
}


}

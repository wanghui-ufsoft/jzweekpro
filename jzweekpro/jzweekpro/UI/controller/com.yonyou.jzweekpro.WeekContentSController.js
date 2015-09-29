//JavaScript Framework 2.0 Code
try{
Type.registerNamespace('com.yonyou.jzweekpro.WeekContentSController');
com.yonyou.jzweekpro.WeekContentSController = function() {
    com.yonyou.jzweekpro.WeekContentSController.initializeBase(this);
    this.initialize();
}
function com$yonyou$jzweekpro$WeekContentSController$initialize(){
}
    
function com$yonyou$jzweekpro$WeekContentSController$evaljs(js){
    eval(js)
}
function com$yonyou$jzweekpro$WeekContentSController$webview0_onload(sender, args){
   var json = $param.getJSONObject("data");
   $ctx.push(json);
   $cache.write("jzweekpro/cache.txt", ""+json.weekid);
   var oldjson = $cache.read("cachearticels");
   if(oldjson != null ){
   var newjsonstr = oldjson+","+$jsonToString(json);
   $cache.write("cachearticels", newjsonstr);
   }else if(oldjson == null){
   $cache.write("cachearticels", $jsonToString(json));
   }
   var url ="http://1.202.248.51:8088/api/v1/showarticle/"+json.id;
   $id("webview0").set("url",url);
}
function com$yonyou$jzweekpro$WeekContentSController$backList(sender, args){
    var indexid = $cache.read("jzweekpro/cache.txt");
    $view.open({
    "viewid" : "com.yonyou.jzweekpro.WeekListS",//目标页面（首字母大写）全名，
    "isKeep" : "true",
     "data" : {id:indexid}
    });
}
com.yonyou.jzweekpro.WeekContentSController.prototype = {
    backList : com$yonyou$jzweekpro$WeekContentSController$backList,
    webview0_onload : com$yonyou$jzweekpro$WeekContentSController$webview0_onload,
    initialize : com$yonyou$jzweekpro$WeekContentSController$initialize,
    evaljs : com$yonyou$jzweekpro$WeekContentSController$evaljs
};
com.yonyou.jzweekpro.WeekContentSController.registerClass('com.yonyou.jzweekpro.WeekContentSController',UMP.UI.Mvc.Controller);
}catch(e){$e(e);}

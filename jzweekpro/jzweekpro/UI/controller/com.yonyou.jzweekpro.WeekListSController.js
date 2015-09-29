//JavaScript Framework 2.0 Code
try{
Type.registerNamespace('com.yonyou.jzweekpro.WeekListSController');
com.yonyou.jzweekpro.WeekListSController = function() {
    com.yonyou.jzweekpro.WeekListSController.initializeBase(this);
    this.initialize();
}
function com$yonyou$jzweekpro$WeekListSController$initialize(){
    //you can programing by $ctx API
    //get the context data through $ctx.get()
    //set the context data through $ctx.push(json)
    //set the field of the context through $ctx.put(fieldName, fieldValue)
    //get the parameter of the context through $ctx.param(parameterName)
    //Demo Code:
    //    var str = $ctx.getString();      //获取当前Context对应的字符串
    //    alert($ctx.getString())          //alert当前Context对应的字符串
    //    var json = $ctx.getJSONObject(); //获取当前Context，返回值为json
    //    json["x"] = "a";        //为当前json增加字段
    //    json["y"] = [];           //为当前json增加数组
    //    $ctx.push(json);            //设置context，并自动调用数据绑定
    //    
    //    put方法需手动调用databind()
    //    var x = $ctx.get("x");    //获取x字段值
    //    $ctx.put("x", "b");     //设置x字段值
    //    $ctx.put("x", "b");     //设置x字段值
    //    $ctx.databind();            //调用数据绑定才能将修改的字段绑定到控件上
    //    var p1 = $param.getString("p1");   //获取参数p2的值，返回一个字符串
    //    var p2 = $param.getJSONObject("p2");   //获取参数p3的值，返回一个JSON对象
    //    var p3 = $param.getJSONArray("p3");   //获取参数p1的值，返回一个数组
    
    //your initialize code below...
    
}
    
function com$yonyou$jzweekpro$WeekListSController$evaljs(js){
    eval(js)
}
function com$yonyou$jzweekpro$WeekListSController$listviewdefine0_onload(sender, args){
        var json = $param.getJSONObject("data");
        var jsonnew = $stringToJSON(json);
        $ctx.push(json);
        var url = "http://1.202.248.51:8088/api/v1/articles/"+jsonnew.id;
        var result  = $service.get({
       "url" :  url,
       "callback" : "jsFunction()",
       "timeout" : "5"//可选参数，超时时间，单位为秒
     })
}
 function    jsFunction(){
    var resultfin =$ctx.param("result");
    var jsonresultfin = $stringToJSON(resultfin);
    jsonresultfin.forEach(function(res){
       if(!res.summary || res.summary===null){
           res.summary="";
       } 
    });
    var json ={
        articles : jsonresultfin
    }
    $ctx.push(json);
 }
function com$yonyou$jzweekpro$WeekListSController$tocontentPage(sender, args){
    var rowindex =$id("listviewdefine0").get("row");
    var jsonstr=$stringToJSON(rowindex);
    $view.open({
    "viewid" : "com.yonyou.jzweekpro.WeekContentS",//目标页面（首字母大写）全名，
    "isKeep" : "true",
    "data" :jsonstr
    });
}
com.yonyou.jzweekpro.WeekListSController.prototype = {
    tocontentPage : com$yonyou$jzweekpro$WeekListSController$tocontentPage,
    listviewdefine0_onload : com$yonyou$jzweekpro$WeekListSController$listviewdefine0_onload,
    initialize : com$yonyou$jzweekpro$WeekListSController$initialize,
    evaljs : com$yonyou$jzweekpro$WeekListSController$evaljs
};
com.yonyou.jzweekpro.WeekListSController.registerClass('com.yonyou.jzweekpro.WeekListSController',UMP.UI.Mvc.Controller);
}catch(e){$e(e);}
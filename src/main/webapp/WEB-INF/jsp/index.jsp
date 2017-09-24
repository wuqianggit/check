<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>主页</title>
    <%@include file="/easyUILib.jsp" %>
</head>

<body class="easyui-layout">
<div data-options="region:'north',border:false" style="height:60px;background:#B3DFDA;padding:10px">

</div>
<div data-options="region:'west',split:true,title:'West'" style="width:300px;padding:10px;">
    west content
</div>
<div data-options="region:'east',split:true,collapsed:true,title:'East'" style="width:100px;padding:10px;">
    east region
</div>
<div data-options="region:'south',border:false" style="height:50px;background:#A9FACD;padding:10px;">
    south region
</div>
<div data-options="region:'center',title:'Center'">

</div>
</body>
</html>

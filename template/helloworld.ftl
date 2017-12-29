<html>
<head>
  <title>Welcome!</title>
</head>
<body>
  <h1>Welcome ${user}!</h1>
  <p>Our latest product:
  <a href="${latestProduct.url}">${latestProduct.name}</a>!
  <#if sex='1'>男
	  <#else>女
  </#if>
  输出结果:
  <#list str as s>
  <#if (s_index+1)%2=0 >
  <font color=red>	${s}---${s_index}</font>
  <#else>
  	<font color=green>	${s}---${s_index}</font>
  </#if>
  	${s}---${s_index}
  	<#if s_has_next>
  ,
  </#if>
  <#if s='3'>
  <#break>
  </#if>
  </#list>
 输出集合
  <#list userlist as user>
  	${user.id}---------${user.name}
  </#list>
  <#-- list 循环标记 数组或者集合  as 临时变量
  	临时变量_index  获取当前的索引 从0开始
  	break标记用于退出标记
  -->
</body>
</html>  

















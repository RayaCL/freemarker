<html>
<head>
  <title>Welcome!</title>
</head>
<body>
  <h1>Welcome ${user}!</h1>
  <p>Our latest product:
  <a href="${latestProduct.url}">${latestProduct.name}</a>!
  <#if sex='1'>��
	  <#else>Ů
  </#if>
  ������:
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
 �������
  <#list userlist as user>
  	${user.id}---------${user.name}
  </#list>
  <#-- list ѭ����� ������߼���  as ��ʱ����
  	��ʱ����_index  ��ȡ��ǰ������ ��0��ʼ
  	break��������˳����
  -->
</body>
</html>  

















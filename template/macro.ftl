<#macro mymacro p1 p2>
${p1+p2}
<#local str='nihao'>
${str}
</#macro>
<@mymacro p1=14 p2=45 />

<#assign str='              hello  java              '>
--${str?upper_case}--


<#if aaa?exists>
${aaa}
</#if>

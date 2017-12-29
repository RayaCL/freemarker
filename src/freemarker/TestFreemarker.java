package freemarker;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.DefaultObjectWrapper;
import freemarker.template.Template;
import freemarker.template.TemplateException;

public class TestFreemarker {
	public static void main(String[] args) throws IOException, TemplateException {
		//设置ftl查找目录
		Configuration cfg = new Configuration();
		//设置数据的抓取模式
		cfg.setDirectoryForTemplateLoading(
		        new File("template"));
		
		cfg.setObjectWrapper(new DefaultObjectWrapper());  
		//构建数据
		Map root = new HashMap();
		root.put("user", "Big Joe");
		root.put("sex", "1");
		String[] str=new String[]{"1","2","3","4"};
		root.put("str", str);
		Map latest = new HashMap();
		root.put("latestProduct", latest);
		latest.put("url", "products/greenmouse.html");
		latest.put("name", "green mouse"); 
		List list=new ArrayList();
		User user=new User("1","zd");
		User user1=new User("2","ls");
		list.add(user);
		list.add(user1);
		root.put("userlist", list);
		//实例化模板对象
		Template temp = cfg.getTemplate("helloworld.ftl"); 
		FileOutputStream fos=new FileOutputStream("C:\\html\\hello.html");
		//生成html输出到目标
		Writer out =new OutputStreamWriter(fos);
		temp.process(root, out);
		out.flush();
	}
}

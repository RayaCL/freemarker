package freemarker;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.DefaultObjectWrapper;
import freemarker.template.Template;
import freemarker.template.TemplateException;

public class TestMapFreemarker {
	public static void main(String[] args) throws IOException, TemplateException {
		//设置ftl查找目录
		Configuration cfg = new Configuration();
		//设置数据的抓取模式
		cfg.setDirectoryForTemplateLoading(
		        new File("template"));
		
		cfg.setObjectWrapper(new DefaultObjectWrapper());  
		//构建数据
		
		Map latest=new HashMap();
		latest.put("id_1", "10");
		latest.put("id_2", "12");
		latest.put("id_3", "3");
		Map root = new HashMap();
		root.put("myid", latest);
		//实例化模板对象
		Template temp = cfg.getTemplate("map.ftl"); 
		FileOutputStream fos=new FileOutputStream("C:\\html\\hello.html");
		//生成html输出到目标
		Writer out =new OutputStreamWriter(System.out);
		temp.process(root, out);
		out.flush();
	}
}

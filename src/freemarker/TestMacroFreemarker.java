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

public class TestMacroFreemarker {
	public static void main(String[] args) throws IOException, TemplateException {
		//设置ftl查找目录
		Configuration cfg = new Configuration();
		//设置数据的抓取模式
		cfg.setDirectoryForTemplateLoading(
		        new File("template"));
		
		cfg.setObjectWrapper(new DefaultObjectWrapper());  
		//构建数据
		Map root = new HashMap();
		
		//实例化模板对象
		Template temp = cfg.getTemplate("macro.ftl"); 
		FileOutputStream fos=new FileOutputStream("C:\\html\\hello.html");
		//生成html输出到目标
		Writer out =new OutputStreamWriter(System.out);
		temp.process(root, out);
		out.flush();
	}
}

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
		//����ftl����Ŀ¼
		Configuration cfg = new Configuration();
		//�������ݵ�ץȡģʽ
		cfg.setDirectoryForTemplateLoading(
		        new File("template"));
		
		cfg.setObjectWrapper(new DefaultObjectWrapper());  
		//��������
		Map root = new HashMap();
		
		//ʵ����ģ�����
		Template temp = cfg.getTemplate("macro.ftl"); 
		FileOutputStream fos=new FileOutputStream("C:\\html\\hello.html");
		//����html�����Ŀ��
		Writer out =new OutputStreamWriter(System.out);
		temp.process(root, out);
		out.flush();
	}
}

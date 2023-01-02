package org.example;

import freemarker.template.Configuration;
import freemarker.template.Template;

import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;

public class DynamicPage {
    public static void createPage(String filename) throws Exception {
        FileWriter catWriter = new FileWriter(filename, false);

        String resourcesPath = App.class.getClassLoader().getResources("templates").nextElement().getPath();
        Configuration config = new Configuration(Configuration.VERSION_2_3_31);
        config.setDirectoryForTemplateLoading(new File(resourcesPath));
        config.setDefaultEncoding("UTF-8");

        Map root = new HashMap<>();
        root.put("title", "Кот");
        Cat cat = new Cat("Мурзик",5,true);
        root.put("cat", cat);

        Template catTemplate = config.getTemplate("catTemplate.html");
        catTemplate.process(root, catWriter);

        catWriter.flush();
        catWriter.close();

    }
}

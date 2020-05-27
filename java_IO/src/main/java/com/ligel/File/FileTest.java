package com.ligel.File;

import java.io.File;
import java.io.FilenameFilter;

/**
 * @version v1.0
 * @ProjectName: learning
 * @ClassName: test
 * @Description:
 * @Author: LIGEL
 * @Date: 2020/5/26 8:56
 */
public class FileTest {
    public static void main(String[] args) {
        /*
         *遇见函数式接口，就可以用用lambda表达式来初始化
         * 另一种玩法
         * 这里就是用lambda表达式进行初始化的，很方便
         * */
        FilenameFilter filenameFilter = (File dir, String name) -> {
            String f = new File(name).getName();
            return f.indexOf(name) != -1;
        };
        try {
            File path = new File(".");
            String[] list;
            if (args.length == 0)
                list = path.list();
            else
                list = path.list(filenameFilter);
            for (int i = 0; i < list.length; i++)
                System.out.println(list[i]);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 检查一个File对象是目录还是文件
        File file = new File("D:\\programing\\openItem");
        FileTest.printAllFile(file);
        if (file.isFile()) {
            // 注意这里打印文件名会把文件类型都可以打印出来。我们可以根据猴嘴把文件按类型进行分类
            System.out.println("是文件！" + file.getName());
        }
    }

    // 答应某个目录下的所有文件，会递归到最底层
    public static void printAllFile(File file){
        if (file.isDirectory()) {
            String fileNames[];
            fileNames = file.list();
            String absoPath = file.getAbsolutePath();
            for (String f : fileNames) {
                File file1= new File(absoPath + "\\" + f);
                if (file1.isFile()) {

                    System.out.println("文件名称：" + f);
                    // 这里的绝对路径文件，就是加上绝对路径的文件
                    //System.out.println("AbsoluteFile是啥啊"+file1.getAbsoluteFile());
                }else if (file1.isDirectory()){
                    System.out.println(file.getName()+":是文件！");
                    printAllFile(file1);
                }
            }
        }else return;
    }
}


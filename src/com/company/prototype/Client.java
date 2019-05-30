package com.company.prototype;

public class Client {
    public static void main(String[] args) {
//        WordDocument originDoc =new WordDocument();
        WordDocument2 originDoc = new WordDocument2();
        originDoc.setText("这是一篇文档");
        originDoc.addImage("图片1");
        originDoc.addImage("图片2");
        originDoc.addImage("图片3");
        originDoc.showDocument();

//        WordDocument doc2 = originDoc.clone();
        WordDocument2 doc2 = originDoc.clone();
        doc2.showDocument();

        doc2.setText("这是修改过的文档");
        doc2.addImage("哈哈.png");
        doc2.showDocument();

        originDoc.showDocument();
    }
}

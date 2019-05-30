package com.company.prototype;

import java.util.ArrayList;

/**
 * 文档类型，代表ConcretePrototype   Cloneable代表prototype角色，生命具备clone的能力
 */
public class WordDocument2 implements Cloneable {
    private String text;//文本
    private ArrayList<String> images = new ArrayList<>();//图片

    public WordDocument2() {
        System.out.println("--------WordDocument的构造函数--------");
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public ArrayList<String> getImages() {
        return images;
    }

    public void addImage(String image) {
        this.images.add(image);
    }

    @Override
    protected WordDocument2 clone() {
        try {
            WordDocument2 wordDocument = (WordDocument2) super.clone();//返回新的对象
            wordDocument.text = this.text;
//            对对象的引用数据类型，采用clone（），进行深拷贝
            wordDocument.images = (ArrayList<String>) this.images.clone();
            return wordDocument;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public void showDocument() {
        System.out.println("--------Word Content Start--------");
        System.out.println("Text: " + text);
        System.out.println("Image lists");
        for (String imageName : images) {
            System.out.println("Image name: " + imageName);
        }
        System.out.println("--------Word Content End--------");
    }
}

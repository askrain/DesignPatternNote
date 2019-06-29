package com.company.composite.model;


import java.util.ArrayList;
import java.util.List;

//具体的枝干节点
public class Composite extends Component {
    //   存储节点的容器
    private List<Component> components = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    /**
     * 添加子节点
     *
     * @param child
     */
    public void addChild(Component child) {
        components.add(child);
    }

    /**
     * 移除子节点
     *
     * @param child
     */
    public void removeChild(Component child) {
        components.remove(child);
    }

    /**
     * 获取子节点
     *
     * @param index
     * @return
     */
    public Component getChildren(int index) {
        return components.get(index);
    }

    @Override
    public void doSomething() {
        System.out.println(name);
        if (null != components) {
            for (Component component :
                    components) {
                component.doSomething();
            }
        }

    }
}

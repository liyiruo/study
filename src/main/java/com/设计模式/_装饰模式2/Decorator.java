package com.设计模式._装饰模式2;

/**
 * @author liyiruo
 */
public abstract class Decorator extends Component{
    private Component component;
    public Decorator(Component component) {
        this.component = component;
    }
    @Override
    public void operation() {
        if (component != null) {
            component.operation();
        }
    }
}

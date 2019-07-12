# design_pattern_imooc
### 慕课网设计模式精讲  
#### 一、6大设计原则

* 1、[开闭原则](https://github.com/szjzszjz/design_pattern_imooc/tree/master/src/main/java/com/szjz/design_pattern_imooc/design/principle/openClose)  
`定义:` 一个软件实体，模块和函数应该对扩展开放，对修改关闭。  
`核心思想:` 用抽象构建框架，用实现扩展细节  
`优点:` 提高软件系统的可复用性及可维护性  
![UML](https://github.com/szjzszjz/design_pattern_imooc/blob/master/src/main/java/com/szjz/design_pattern_imooc/design/principle/openClose/Package%20openClose.png)  

* 2、[依赖倒置原则](https://github.com/szjzszjz/design_pattern_imooc/tree/master/src/main/java/com/szjz/design_pattern_imooc/design/principle/dependenceInversion)  
`定义：`高层模块不应该依赖底层模块，二者都应该依赖其抽象  
抽象不应该依赖细节，细节应该依赖抽象  
针对接口编程，不要针对实现编程  
`优点：`可以减少类间的耦合性，提高系统稳定性，提高代码的可读性和可维护性，可降低修改程序所造成的的风险  
![UML](https://github.com/szjzszjz/design_pattern_imooc/blob/master/src/main/java/com/szjz/design_pattern_imooc/design/principle/dependenceInversion/Package%20dependenceInversion.png)  

* 3、[单一职责原则](https://github.com/szjzszjz/design_pattern_imooc/tree/master/src/main/java/com/szjz/design_pattern_imooc/design/principle/singleResponsibility)  
`定义：`不要存在多于一个导致类变更的原因  
一个类、接口、方法只负责一项职责  
`优点：`降低类的复杂度、提高类的可读性、提高系统的可维护性、降低变更引起的风险  
![UML](https://github.com/szjzszjz/design_pattern_imooc/blob/master/src/main/java/com/szjz/design_pattern_imooc/design/principle/singleResponsibility/Package%20singleResponsibility.png)  

* 4、[接口隔离原则](https://github.com/szjzszjz/design_pattern_imooc/tree/master/src/main/java/com/szjz/design_pattern_imooc/design/principle/interfaceSegregation)  
`定义：`用多个专门的接口，而不使用单一的总接口，客户端不应该依赖他不需要的接口。一个类对一个类的依赖应该建立在最小的接口上，建立单一接口，不需要建立庞大臃肿的接口，尽量细化接口，接口中的方法应该适度少量。  
`注意：`一定要适度  
`优点：` 符合我们常说的高内聚低耦合的设计思想，从而使得类具有很好的可读性，可扩展性和可维护性  
![UML](https://github.com/szjzszjz/design_pattern_imooc/blob/master/src/main/java/com/szjz/design_pattern_imooc/design/principle/interfaceSegregation/Package%20interfaceSegregation.png)  

* 5、[迪米特原则](https://github.com/szjzszjz/design_pattern_imooc/tree/master/src/main/java/com/szjz/design_pattern_imooc/design/principle/interfaceSegregation)  
`定义：`一个对象应该对其他的对象保持最少的了解，又叫最少知道原则。  
尽量降低类与类之间的耦合  
`优点：`降低类之间的耦合  
强调只和朋友交流，不和陌生人说话  
`朋友：`出现在成员变量，方法的输入，输出参数中的类称为成员朋友类，而出现在方法体内部的类不属于朋友类。  
![UML](https://github.com/szjzszjz/design_pattern_imooc/blob/master/src/main/java/com/szjz/design_pattern_imooc/design/principle/interfaceSegregation/Package%20interfaceSegregation.png)  

#### 二、设计模式  
* 1、[简单工厂（创建型）](https://github.com/szjzszjz/design_pattern_imooc/tree/master/src/main/java/com/szjz/design_pattern_imooc/design/creational/simpleFactory)  
![UML](https://github.com/szjzszjz/design_pattern_imooc/blob/master/src/main/java/com/szjz/design_pattern_imooc/design/creational/simpleFactory/Package%20simpleFactory.png)  

* 2、[工厂方法（创建型）](https://github.com/szjzszjz/design_pattern_imooc/tree/master/src/main/java/com/szjz/design_pattern_imooc/design/creational/factoryMethod)  
针对的是产品等级  
`类型：`创建型  
`定义：`  
定义一个创建对象的接口，但让实现这个接口的类来决定实例化哪个类  
工厂方法让类的实例化推迟到子类中进行  
`适用场景：`  
创建对象需要大量重复代码  
客户端不依赖于产品实例如何被创建，实现等细节  
一个类通过其子类来指定创建哪个对象  
`优点：`  
用户只需要关心所需产品对应的工厂，无需关心创建细节  
加入新产品符合开闭和原则，提高可扩展性  
`缺点：`  
类的个数容易过多，增加复杂度  
增加了系统的抽象性和理解难度  
![UML](https://github.com/szjzszjz/design_pattern_imooc/blob/master/src/main/java/com/szjz/design_pattern_imooc/design/creational/factoryMethod/Package%20factoryMethod.png)  

* 3、[抽象工厂（创建型）](https://github.com/szjzszjz/design_pattern_imooc/tree/master/src/main/java/com/szjz/design_pattern_imooc/design/creational/abstractFactory)  
针对的是产品族  
`类型：`创建型  
`定义：`抽象工厂模式提供一个创建一系列相关或相互依赖对象的接口，无需指定他们的类  
`适用场景：`  
客户端不依赖于产品类实例如何被创建，实现等细节。  
强调一系列相关的产品对象（属于同一产品族）一起使用创建对象需要大量重复的代码  
提供一个产品类的库，所有的产品以同样的接口出现，从而使客户端不依赖于具体的实现  
`优点：`  
具体产品在应用层代码隔离，无需关心创建细节。  
将一个系列的产品族统一到一起创建。  
`缺点：`  
规定了所有可能被创建的产品集合，产品族中扩展新的产品困难，需要修改抽象工厂接口  
增加了系统的抽象度和理解难度  
![UML](https://github.com/szjzszjz/design_pattern_imooc/blob/master/src/main/java/com/szjz/design_pattern_imooc/design/creational/abstractFactory/Package%20abstractFactory.png)

* 4、建造者（创建型）  
[普通式](https://github.com/szjzszjz/design_pattern_imooc/tree/master/src/main/java/com/szjz/design_pattern_imooc/design/creational/builder)  
[建造者V2升级版（链式调用）](https://github.com/szjzszjz/design_pattern_imooc/tree/master/src/main/java/com/szjz/design_pattern_imooc/design/creational/builder/V2)  
类型：创建型  
定义：讲一个复杂对象的构建与它的表示分离，市的同样的构建过程可以创建不同的表示 ，用户只需要指定需要构建的类型就可以得到它们，建造过程及细节不要知道  
适用场景：  
如果一个对象有非常复杂的内部结构（很多属性）  
想法复杂对象的创建和使用分离  
`优点：`  
封装性好，创建和使用分离  
扩展性好，建造类之间独立，一点程度上解耦  
`缺点：`  
产生多余的builder对象  
产品内部发生变化，建造者都要修改，成本较大  
`建造者和工厂模式的区别：`  
建造者更注重创建产品的顺序，当对象内部复杂时适合使用  
工厂注重于创建产品，当创建简单产品时适合使用    
`创建者`  
![创建者](https://github.com/szjzszjz/design_pattern_imooc/blob/master/src/main/java/com/szjz/design_pattern_imooc/design/creational/builder/Package%20builder.png)  
`建造者V2升级版`  
![建造者V2升级版](https://github.com/szjzszjz/design_pattern_imooc/blob/master/src/main/java/com/szjz/design_pattern_imooc/design/creational/builder/V2/Package%20V2.png)

* 5、单例（创建型）  
[懒汉式](https://github.com/szjzszjz/design_pattern_imooc/tree/master/src/main/java/com/szjz/design_pattern_imooc/design/creational/singleton/lazy)  
[饿汉式](https://github.com/szjzszjz/design_pattern_imooc/tree/master/src/main/java/com/szjz/design_pattern_imooc/design/creational/singleton/hungary)  
[枚举式](https://github.com/szjzszjz/design_pattern_imooc/tree/master/src/main/java/com/szjz/design_pattern_imooc/design/creational/singleton/enumSingleton)  
[线程式](https://github.com/szjzszjz/design_pattern_imooc/tree/master/src/main/java/com/szjz/design_pattern_imooc/design/creational/singleton/threadLocalSingleton)  
类型：创建型  
定义：保证一个类仅有一个实例，并提供一个全局的访问点  
适用场景：想确保任何情况下都绝对只有一个实例  
优点：  
在内存里只有一个实例，减少了内存开销  
可以避免对资源的多重占用  
设置全局访问点，严格控制访问  
`缺点：`没有接口，扩展困难  
`重点：`  
私有构造器  
线程安全  
延迟加载  
序列化和反序列化安全  
反射  
`实用技能：`  
反编译  
内存原理  
多线程debug  
***
* 6、[原型模式(创建型)](https://github.com/szjzszjz/design_pattern_imooc/tree/master/src/main/java/com/szjz/design_pattern_imooc/design/creational/prototype)  
`类型：`创建型   
`定义：`原型实例指定创建的对象的实例，并通过拷贝这些原型创建新的对象，不需要知道任何的创建细节，不调用构造函数。  
`适用场景：`   
类初始化消耗较多资源  
new产生一个对象需要非常繁琐的过程（数据准备，访问权限等）  
构造函数比较复杂  
循环体中生产大量对象时  
`优点：`  
原型模式性能比直接new一个对象性能要高  
简化创建过程  
`缺点：`  
必须配备克隆方法  
对克隆复杂对象和克隆出的对象进行复杂改造时，容易引入风险  
深拷贝，浅拷贝要运用得当  
`原型-扩展`  深克隆，浅克隆  



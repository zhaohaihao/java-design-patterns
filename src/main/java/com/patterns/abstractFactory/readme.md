### 抽象工厂模式
说明:<br /><br />
有关于抽象工厂模式, 需要理清两个概念
* **产品层次结构:**<br />
　　产品层次结构就是产品的继承结构。比如我们有一个抽象类或者接口是手机，它的子类有苹果手机、小米手机、华为手机等具体的手机，那么抽象的手机和具体的手机这便构成了一个产品层次结构。抽象手机作为父类或者父接口，而具体品牌的手机则作为其子类。
* **产品族:**<br />
　　在抽象工厂模式中，产品族是指由同一个工厂生产的，位于不同产品层次结构中的一组产品。比如苹果电子工厂生产的苹果手机、苹果电脑，苹果手机位于手机产品层次结构中，苹果电脑位于电脑产品层次结构中，那么苹果手机和苹果电脑就构成了一个产品族。
<br /><br />
实现步骤(查看顺序)：
 1. [创建产品抽象类/接口 Phone](https://github.com/zhaohaihao/Java-Design-Patterns/blob/master/src/main/java/com/patterns/abstractFactory/Phone.java)
 2. [创建具体产品实现类 IPhone](https://github.com/zhaohaihao/Java-Design-Patterns/blob/master/src/main/java/com/patterns/abstractFactory/IPhone.java)
 3. [创建具体产品实现类 MiPhone](https://github.com/zhaohaihao/Java-Design-Patterns/blob/master/src/main/java/com/patterns/abstractFactory/MiPhone.java)
 4. [创建产品抽象类/接口 Computer](https://github.com/zhaohaihao/Java-Design-Patterns/blob/master/src/main/java/com/patterns/abstractFactory/Computer.java)
 5. [创建具体产品实现类 IComputer](https://github.com/zhaohaihao/Java-Design-Patterns/blob/master/src/main/java/com/patterns/abstractFactory/IComputer.java)
 6. [创建具体产品实现类 MiComputer](https://github.com/zhaohaihao/Java-Design-Patterns/blob/master/src/main/java/com/patterns/abstractFactory/MiComputer.java)
----------
 7. [创建一个抽象工厂 Factory](https://github.com/zhaohaihao/Java-Design-Patterns/blob/master/src/main/java/com/patterns/abstractFactory/Factory.java)
 8. [创建实现Factory接口具体工厂类 IFactory](https://github.com/zhaohaihao/Java-Design-Patterns/blob/master/src/main/java/com/patterns/abstractFactory/IFactory.java)
 9. [创建实现Factory接口具体工厂类 MiFactory](https://github.com/zhaohaihao/Java-Design-Patterns/blob/master/src/main/java/com/patterns/abstractFactory/MiFactory.java)
10. [创建抽象工厂测试类 AbstractFactoryTest](https://github.com/zhaohaihao/Java-Design-Patterns/blob/master/src/main/java/com/patterns/abstractFactory/AbstractFactoryTest.java)
----------
　　但凡我们需要增加新的产品层次结构,比如：手表抽象类Watch, 那么相应的我们需要增加对应的IWatch, MiWatch, 同时对应的所有工厂中都需要增加创建Watch对应的工厂方法, 这样大批量的做修改显然是不合适的。<br /><br />
　　以下我们用简单工厂和反射相结合的方式来改进抽象工厂(此处步骤7、8替换上述步骤7-10)：<br />

----------
 7. [利用反射的方式来改进抽象工厂 Factory](https://github.com/zhaohaihao/Java-Design-Patterns/blob/master/src/main/java/com/patterns/abstractFactory/Factory1.java)
 8. [反射抽象工厂测试类 IFactory](https://github.com/zhaohaihao/Java-Design-Patterns/blob/master/src/main/java/com/patterns/abstractFactory/AbstractFactoryTest1.java)
----------


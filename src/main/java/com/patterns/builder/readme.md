### 简单工厂模式
四个要素:<br />
* **产品类:** 既可以是具体实现，也可以是抽象类与其具体实现组成。
* **抽象建造者:** 抽象接口或者类，将具体实现过程交给子类，易扩展。
* **具体建造者:** 实现抽象接口（抽象建造者），构建产品。
* **指挥者:** 调用合适的建造者来构建产品。
<br />
实现步骤(查看顺序)：<br />
 1. [创建产品类 MacPro](https://github.com/zhaohaihao/Java-Design-Patterns/blob/master/src/main/java/com/patterns/builder/MacPro.java)
 2. [创建抽象建造者 Builder](https://github.com/zhaohaihao/Java-Design-Patterns/blob/master/src/main/java/com/patterns/builder/Builder.java)
 3. [创建具体建造者类 MacProFirstBuilder](https://github.com/zhaohaihao/Java-Design-Patterns/blob/master/src/main/java/com/patterns/builder/MacProFirstBuilder.java)
 3. [创建具体建造者类 MacProSecondBuilder](https://github.com/zhaohaihao/Java-Design-Patterns/blob/master/src/main/java/com/patterns/builder/MacProSecondBuilder.java)
 4. [创建指挥者类 Director](https://github.com/zhaohaihao/Java-Design-Patterns/blob/master/src/main/java/com/patterns/builder/Director.java)
 5. [创建建造者测试类 BuilderTest](https://github.com/zhaohaihao/Java-Design-Patterns/blob/master/src/main/java/com/patterns/builder/BuilderTest.java)
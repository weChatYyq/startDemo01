# startDemo01
subscription number read record
## java技术栈
### 开发工具
eclipse [吃内存、卡顿、莫名其妙异常]
IntelliJ idea [IntelliJ IDEA 从入门到上瘾教程，2019图文版！](https://mp.weixin.qq.com/s/PgSB9gMAVOgY7rPfF1ht-g)
[2019 最新 Java 开发工具教程，都在这了！](https://mp.weixin.qq.com/s/K2nbzDQmharfYhkBDvwQdw)
## 目录规范
### 包名
  根据很多 Java 程序员的”经验”来看，一个数据库表则对应着一个 domain 对象，所以很多程序员在写代码时，
  包名则使用：com.xxx.domain ，这样写好像已经成为了行业的一种约束，数据库映射对象就应该是 domain。
  但是你错了，domain 是一个领域对象，往往我们再做传统 Java 软件 Web 开发中，这些 domain 都是贫血模型，
  是没有行为的，或是没有足够的领域模型的行为的，所以，以这个理论来讲，这些 domain 都应该是一个普通的 entity 对象，
  并非领域对象，所以请把包名改为:com.xxx.entity。  
  如果你还不理解我说的话，请看一下 Vaughn Vernon 出的一本叫做《IMPLEMENTING DOMAIN-DRIVEN DESIGN》(实现领域驱动设计)这本书，书中讲解了贫血模型与领域模型的区别，相信你会受益匪浅。
### POJO、PO、DTO、DAO、BO、VO
只要是用于网络传输的对象，我们都认为他们可以当做是 DTO 对象。
你必需要搞清楚的概念：[POJO、PO、DTO、DAO、BO、VO。](https://mp.weixin.qq.com/s/sF7NEGLwhvZQ3nf9eBCZEg)
我们约定某对象如果是 DTO 对象，就将名称改为 XXDTO，比如订单下发OMS：OMSOrderInputDTO。
## Java 工具类！
[排名前 16 的 Java 工具类！](https://mp.weixin.qq.com/s/wFySsUgzAa_eDP8kS113Yw)
## 代码重构
 在写代码时，我们应该尽量把语义层次差不多的放到一个方法中    
## 书籍
《IMPLEMENTING DOMAIN-DRIVEN DESIGN》(实现领域驱动设计)
 Martin Fowler 的《Refactoring Imporving the Design of Existing Code》(重构 改善既有代码的设计) 这本书中的 Extract Method 重构方式。
### 代码的整洁clean code 
 Robert C. Martin 出版的《Clean Code》（代码整洁之道）
 可以参考美团文章[聊聊clean code](http://tech.meituan.com/clean-code.html)
 阿里的 Java 编码规范
### 设计模式
 《Head First》 
 
## 异常处理
[优雅的处理异常](http://lrwinx.github.io/2016/04/28/%E5%A6%82%E4%BD%95%E4%BC%98%E9%9B%85%E7%9A%84%E8%AE%BE%E8%AE%A1java%E5%BC%82%E5%B8%B8/)
##参数校验
[Spring Boot 如何做参数校验？](https://mp.weixin.qq.com/s/EaZxYKyC4L_EofWdtyBCpw)
## linux 命令
 [Linux私房菜](http://linux.vbird.org/)
## UML
  不想多讨论 UML 相关的知识，但是我觉得你如果真的会写 Java，请先学会表达自己，UML 就是你说话的语言，做一名优秀的 Java 程序员，请至少学会这两种 UML 图：
###类图
###时序图
 
## 重构
多看成熟框架的源码

多回头看自己的代码

勤于重构
(结对编程)国外流行一种编程方式，叫做结对编程
## 设计模式
  状态模式 转换为 策略模式(一直在做 Java 后端的项目，经常会有一些变动，我相信大家也都遇到过。
比如当我们写一段代码的时候，我们考虑将需求映射成代码的状态模式，突然有一天，状态模式里边又添加了很多行为变化的东西，这时候你就挠头了，你硬生生的将状态模式中添加过多行为和变化。
慢慢的你会发现这些状态模式，其实更像是一簇算法，应该使用策略模式，这时你应该已经晕头转向了。
说了这么多，我的意思是，只要你觉得合理，就请将状态模式改为策略模式吧，所有的模式并不是凭空想象出来的，都是基于重构。
Java 编程中没有银弹，请拥抱业务变化，一直思考重构，你就有一个更好的代码设计!)
  业务驱动技术 or 技术驱动业务
 [详解 Java 中的三种代理模式](https://mp.weixin.qq.com/s/nBmbNP2mR7ei-lDsuOxjWg) 
## lombok
 [lombok](https://mp.weixin.qq.com/s/vggC_MdTZqfbgfmhB5IYmw)
 ## 静态构造方法
 List<String> list = Lists.newArrayList();
 HashMap<String, String> objectObjectHashMap = Maps.newHashMap();
 Collections.newSetFromMap(new HashMap<>());
 Arrays.asList("111","333");
 

  

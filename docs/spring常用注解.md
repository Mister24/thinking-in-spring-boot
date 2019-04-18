*** 
#MVC注解
***

##@Controller
    作用于controller类上，声明是一个controller类。
##@RequestMapping
    既可以作用于类上，也可以作用于方法上
    1. 类上，用于标注请求的路径；
    2. 方法上，进一步映射特定的url到某个具体的方法上；
##@PathVariable
    作用于方法上，用于表示参数的值来自url参数，于@RequestMapping一起使用。
##@GetMapping
    是一个组合注解，是@RequestMapping(method = RequestMethod.GET)的缩写；
##@PostMapping
    是一个组合注解，是@RequestMapping(method = RequestMethod.POST)的缩写；
##@responseBody
    作用是将controller的方法返回的对象通过适当的转换器转换为指定的格式之后，
    写入到response对象的body区，通常用来返回JSON数据或者是XML
##@InitBinder
    @InitBinder用于在@Controller中标注于方法上，表示为当前控制器注册一个属性编辑器，
    只对当前的Controller有效。@InitBinder标注的方法必须有一个参数WebDataBinder。
    所谓的属性编辑器可以理解就是帮助我们完成参数绑定。
##@Configuration启动容器 + @Bean注册Bean
    用于定义配置类，可替换xml配置文件，被注解的类内部包含有一个或多个被@Bean注解的方法，
    这些方法将会被AnnotationConfigApplicationContext或AnnotationConfigWebApplicationContext类
    进行扫描，并用于构建bean定义，初始化Spring容器。
##@Entity 
    表明该类 (UserEntity) 为一个实体类，它默认对应数据库中的表名是user_entity。
    这里也可以写成@Entity(name = "123_user")
   
---
#JPA注解
---

##@Entity
    标注用于实体类声明语句之前，指出该Java 类为实体类，将映射到指定的数据库表。
    如声明一个实体类 Customer，它将映射到数据库中的 customer 表上。

##@Table
    当实体类与其映射的数据库表名不同名时需要使用 @Table 标注说明，该标注与 @Entity 标注并列使用，
    置于实体类声明语句之前，可写于单独语句行，也可与声明语句同行。
```
@Table(name="JPA_CUSTOMERS")//主要是映射表名对应的数据库表名JPA_CUSTOMER默认情况下可以不写表名与持久化类名相同
@Entity //表明这是一个持久化类
    
public class Customer 
```

##@Id
    标注用于声明一个实体类的属性映射为数据库的主键列。该属性通常置于属性声明语句之前，
    可与声明语句同行，也可写在单独行上。 @Id标注也可置于属性的getter方法之前。
    
##@GeneratedValue
    @GeneratedValue 用于标注主键的生成策略，通过 strategy 属性指定。
    默认情况下，JPA 自动选择一个最适合底层数据库的主键生成策略：
    SqlServer 对应 identity，MySQL 对应 auto increment。 
    
    在 javax.persistence.GenerationType 中定义了以下几种可供选择的策略：
    
    1. IDENTITY：采用数据库 ID自增长的方式来自增主键字段，Oracle不支持这种方式；
    2. AUTO：    JPA自动选择合适的策略，是默认选项；
    3. SEQUENCE：通过序列产生主键，通过 @SequenceGenerator注解指定序列名，MySql 不支持这种方式；
    4. TABLE：   通过表产生主键，框架借由表模拟序列产生主键，使用该策略可以使应用更易于数据库移植。

##@ManyToOne + @JoinColum，用于多对一
    @ManyToOne，Many指的是定义此属性的实体，如Department和User的映射，Many指的是定义此属性的实体，即User实体。
    @JoinColum的name属性说明外键字段。

##@OneToMany + mappedBy，用于一对多
    
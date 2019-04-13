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

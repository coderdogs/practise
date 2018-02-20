### java共有几种类型的方法？每种有撒作用？
- 普通方法：
- 构造方法：有参构造，无参构造
- 静态方法：可以直接使用类名来调用，不用再次创造对象。

###为撒静态方法可以直接使用类名来调用？
-静态数据成员是在类装载的时候就分配了内存空间，而类的成员变量是在生成对象时分配内存空间。
-所以只要类装载了，就可以用类名访问静态数据成员。
-事实上，该类的所有对象都只保存类静态数据成员的引用，他们都指向同一块内存区域。

### this代表什么？静态方法中为何不能用this？
-
###System.out.println()分别代表啥？System是啥？out是啥？
-Java中的System类  System类代表系统，系统级的很多属性和控制方法都放置在该类的内部。该类位于java.lang包。
-由于该类的构造方法是private的，所以无法创建该类的对象，也就是无法实例化该类。
其内部的成员变量和成员方法都是static的，所以也可以很方便的进行调用。
System成员变量：
System类内部包含in、out和err三个成员变量，分别代表标准输入流(键盘输入)，标准输出流(显示器)和标准错误输出流(显示器)。

System成员方法：
a、arraycopy方法  public static void arraycopy(Object src, int srcPos,
Object dest, int destPos, int length)  该方法的作用是数组拷贝，也就是将一个
数组中的内容复制到另外一个数组中的指定位置，由于该方法是native方法，所以性能上
比使用循环高效。
使用示例：int[] a = {1,2,3,4};int[] b = new int[5];System.arraycopy(a,1,b,3,2);
该代码的作用是将数组a中，从下标为1开始，复制到数组b从下标3开始的位置，总共复制2个
。也就是将a[1]复制给b[3]，将a[2]复制给b[4]，这样经过复制以后数组a中的值不发生变化，
而数组b中的值将变成{0,0,0,2,3}。

b、currentTimeMillis方法
public static long currentTimeMillis()该方法的作用是返回当前的计算机时间，
时间的表达格式为当前计算机时间和GMT时间(格林威治时间)1970年1月1号0时0分0秒所差的毫秒数。例如：
long l = System. currentTimeMillis();  则获得的将是一个长整型的数字，该数字就是以差值表达的当前时间。
使用该方法获得的时间不够直观，但是却很方便时间的计算。例如，计算程序运行需要的时间则可以使用如下的代码：
long start = System. currentTimeMillis();
for(int i = 0;i < 100000000;i++){
    int a = 0;
}
long end = System. currentTimeMillis();
long  time = end – start;
则这里变量time的值就代表该代码中间的for循环执行需要的毫秒数，
使用这种方式可以测试不同算法的程序的执行效率高低，也可以用于后期线程控制时的精确延时实现。

c、exit方法
public static void exit(int status) 该方法的作用是退出程序。
其中status的值为0代表正常退出，非零代表异常退出。使用该方法可以在图形界面编程中实现程序的退出功能等。

d、gc方法
public static void gc()
该方法的作用是请求系统进行垃圾回收。至于系统是否立刻回收，则取决于系统中垃圾回收算法的实现以及系统执行时的情况。

e、getProperty方法
public static String getProperty(String key)
该方法的作用是获得系统中属性名为key的属性对应的值。系统中常见的属性名以及属性的作用如下表所示
属性名列表 属性名 属性说明  java.version Java 运行时环境版本
java.home Java 安装目录 os.name 操作系统的名称
os.version 操作系统的版本 user.name 用户的账户名称
user.home 用户的主目录 user.dir  用户的当前工作目录
例如：String osName = System.getProperty(“os.name”);
String user = System.getProperty(“user.name”);
System.out.println(“当前操作系统是：” + osName);
System.out.println(“当前用户是：” + user);
使用该方法可以获得很多系统级的参数以及对应的值。

### java的可变参数如何定义？
-方法的重载，
 语法是：
 访问修饰符（public） 方法类型（void等） 方法名（参数1，参数21·····）{ 方法主体}
 方法类型和方法名一致 根据参数类型和个数的不同 自动选择相应的方法


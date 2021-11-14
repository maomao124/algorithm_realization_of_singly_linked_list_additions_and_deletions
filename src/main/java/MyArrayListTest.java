/**
 * Project name(项目名称)：算法_单链表的实现之增删功能
 * Package(包名): PACKAGE_NAME
 * Class(类名): MyArrayListTest
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/11/14
 * Time(创建时间)： 19:30
 * Version(版本): 1.0
 * Description(描述)：
 * 预期输出:
 * 3
 * 1
 * 4
 * 5
 * 7
 * -1
 * 33
 */

public class MyArrayListTest
{
    public static void main(String[] args)
    {
        MyLinkedList list = new MyLinkedList();
        list.add(0, 1);
        list.display();
        list.add(5);
        list.display();
        list.add(7);
        list.display();
        list.add(-1);
        list.display();
        list.add(0, 3);
        list.display();
        list.add(2, 4);
        list.display();
        list.add(-6);
        list.display();
        list.remove(6);
        list.display();
        list.add(33);
        list.display();
        while (list.size() > 0)
        {
            System.out.println(list.remove(0));
        }

    }
}

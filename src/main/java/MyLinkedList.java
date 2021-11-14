/**
 * Project name(项目名称)：算法_单链表的实现之增删功能
 * Package(包名): PACKAGE_NAME
 * Class(类名): MyLinkedList
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/11/14
 * Time(创建时间)： 19:29
 * Version(版本): 1.0
 * Description(描述)：
 * 向链表中添加元素，补全add(int item)方法；
 * 向链表中指定位置添加元素，补全add(int index, int item)方法；
 * 删除链表指定位置的元素并返回其值，补全remove(int index)方法。
 * 平台将创建用户补全后的MyLinkedList类的对象；
 * 调用对象的add(int item)方法，向表中添加测试数据；
 * 调用对象的add(int index, int item)方法，向表中指定位置添加测试数据；
 * 调用对象的size()方法返回表的大小；
 * 调用对象的remove(int index)方法删除指定位置的数据；
 * 根据输出结果判断程序是否正确。
 */

public class MyLinkedList
{
    private Node first;//头结点，不存数据
    private Node last;//指向链表的最后一个节点
    private int size;

    public MyLinkedList()
    {
        size = 0;
        first = new Node(0, null);
        last = null;
    }

    /**
     * 添加到链表尾部
     *
     * @param item
     */
    public void add(int item)
    {
        /********** Begin *********/
        Node node = first;
        while (node.next != null)
        {
            node = node.next;
        }
        Node node1 = new Node(item, null);
        node.next = node1;
        last = node1;
        size++;

        /********** End *********/
    }

    /**
     * 添加数据item到指定位置index
     * index从0开始
     *
     * @param index
     * @param item
     */
    public void add(int index, int item)
    {
        checkPosIndex(index);

        /********** Begin *********/
        Node node = first;
        for (int i = 0; i < index; i++)
        {
            node = node.next;
        }
        Node node1 = new Node(item, node.next);
        node.next = node1;
        size++;

        /********** End *********/
    }

    /**
     * 删除指定位置index处的元素并返回, index从0开始
     *
     * @param index
     * @return
     */
    public int remove(int index)
    {
        checkPosIndex(index);

        /********** Begin *********/
        Node node = first;
        if (index == 0)
        {
            int result = node.next.item;
            node.next = node.next.next;
            size--;
            return result;
        }
        node = node.next;
        for (int i = 0; i < index - 1; i++)
        {
            node = node.next;
        }
        int result = node.next.item;
        node.next = node.next.next;
        size--;
        return result;

        /********** End *********/
    }

    public int remove()
    {
        if (size == 0)
        {
            System.out.println("删除失败！！！链表元素为空");
            return -3692547;
        }
        int index = size - 1;
        Node node = first;
        if (index == 0)
        {
            int result = node.next.item;
            node.next = node.next.next;
            size--;
            return result;
        }
        node = node.next;
        for (int i = 0; i < index - 1; i++)
        {
            node = node.next;
        }
        int result = node.next.item;
        node.next = node.next.next;
        size--;
        return result;
    }

    public int size()
    {
        return size;
    }

    private void checkPosIndex(int index)
    {
        if (index < 0 || index > size)
        {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

    public void display()
    {
        System.out.println("数量：" + size);
        Node node = first;
        node = node.next;
        for (int i = 0; i < size; i++)
        {
            System.out.print(node.item + " ");
            node = node.next;
        }
        System.out.println();
    }

    //结点内部类
    private static class Node
    {
        int item;            //数据
        Node next;           //下一节点

        Node(int item, Node next)
        {
            this.item = item;
            this.next = next;
        }
    }
}


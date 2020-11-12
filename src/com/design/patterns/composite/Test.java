package com.design.patterns.composite;

public class Test {
	
	/**
	 * 组合模式：将对象组合成树状层次结构，使用户对单个对象和组合对象具有一致的访问性
	 * 一、定义与特点
  		组合（Composite）模式的定义：有时又叫作部分-整体模式，它是一种将对象组合成树状的层次结构的模式，用来表示“部分-整体”的关系，使用户对单个对象和组合对象具有一致的访问性。
  		组合模式（Composite Pattern），又叫部分整体模式，是用于把一组相似的对象当作一个单一的对象。组合模式依据树形结构来组合对象，用来表示部分以及整体层次。这种类型的设计模式属于结构型模式，它创建了对象组的树形结构。
  		这种模式创建了一个包含自己对象组的类。该类提供了修改相同对象组的方式。

		组合模式适用场景
		1、在需要表示一个对象整体与部分的层次结构的场合。
		2、要求对用户隐藏组合对象与单个对象的不同，用户可以用统一的接口使用组合结构中的所有对象的场合。
		
		优缺点
		1、高层模块调用简单。
		2、节点自由增加。
		3、在使用组合模式时，其叶子和树枝的声明都是实现类，而不是接口，违反了依赖倒置原则。
		4、设计较复杂，客户端需要花更多时间理清类之间的层次关系。
		5、不容易限制容器中的构件。
		6、不容易用继承的方法来增加构件的新功能。
		
		模式结构
		1、抽象构件（Component）角色：它的主要作用是为树叶构件和树枝构件声明公共接口，并实现它们的默认行为。在透明式的组合模式中抽象构件还声明访问和管理子类的接口；在安全式的组合模式中不声明访问和管理子类的接口，管理工作由树枝构件完成。
		2、树叶构件（Leaf）角色：是组合中的叶节点对象，它没有子节点，用于实现抽象构件角色中声明的公共接口。
		3、树枝构件（Composite）角色：是组合中的分支节点对象，它有子节点。它实现了抽象构件角色中声明的接口，它的主要作用是存储和管理子部件，通常包含 add()、remove()、get() 等方法。

	 */
	public static void main(String[] args) {
		University university = new University("XXX大学");
        University c1 = new University("物理学院");
        University c11 = new University("大学物理1");
        University c12 = new University("大学物理2");
        
        University c2 = new University("化学学院");
        University c21 = new University("大学化学1");
        University c22 = new University("大学化学2");
        
        university.add(c1);
        university.add(c2);
        
        c1.add(c11);
        c1.add(c12);
        
        c2.add(c21);
        c2.add(c22);
        
        System.out.println(university);
        System.out.println();
        
        for (University university2 : university.getColleges()) {
            System.out.println(university2);
            for (University university3 : university2.getColleges()) {
                System.out.println(university3);
            }
            System.out.println();
        }
	}

}

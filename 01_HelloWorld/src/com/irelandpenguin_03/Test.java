package com.irelandpenguin_03;

public class Test {

	public static void main(String[] args) {
		Employee em = new Employee();
		em.setName("irelandpenguin");
		em.setAge(25);
		em.setNumber(1234);
		System.out.println(em.getName() + "---" + em.getAge() + "---"
				+ em.getNumber());

		Employee em2 = new Employee("irelandpenguin2", 25, 7890);
		em2.show();

	}

}

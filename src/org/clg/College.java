package org.clg;

import org.staff.Staff;
import org.stu.*;
 


public class College {
	private void clgName() {
		System.out.println("Hindusthan");

	}
	
	public static void main(String[] args) {
		College c = new College ();
		Staff s = new Staff ();
		Student st = new Student();
		c.clgName();
		s.staffName();
		st.stuId();
		st.stuName();
		
		StuNum s1=new StuNum();
		s1.stunum();
	}

}

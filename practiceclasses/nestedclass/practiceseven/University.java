package com.practiceclasses.nestedclass.practiceseven;

public class University {
    public class Department{
        public Department inner;
        public String department;
        public int student;
        public static int departmentCount = 0;

        public Department(String department, int student){
            this.department = department;
            this.student = student;
            departmentCount++;
        }
        public String getDepartment(){
            return department;
        }
        public int getStudent(){
            return student;
        }
    }
}

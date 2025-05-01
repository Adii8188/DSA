class Copy{
    public static void main(String a[]){
        Student s1=new Student("Ram",22);
        s1.marks[0]=100;
        s1.marks[1]=90;
       s1.marks[2]=80;
        Student s2=new Student(s1);
        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }
        s1.marks[2]=800;
        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }
    }
}

class Student{
    String name;
    int roll;
    int marks[];
    Student(String name,int roll){
        marks=new int[3];
        this.name=name;
        this.roll=roll;
    }
    // Shallow Copy >>>>>>>>>>>
    // Student(Student s1){
    //     this.name=s1.name;
    //     this.roll=s1.roll;
    //     this.marks=s1.marks;
    // }

    // Deep Copy >>>>>>>>
    Student(Student s1){
        marks=new int[3];
        this.name=s1.name;
        this.roll=s1.roll;
        this.marks[0]=s1.marks[0];
        this.marks[1]=s1.marks[1];
        this.marks[2]=s1.marks[2];
    }
}
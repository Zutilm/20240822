package Test;

public class StudentsRoom {
    public static void main(String[] args) {
        Student[] arr = new Student[3];

        Student stu1 = new Student(1, "zhangsan", 20);
        Student stu2 = new Student(2, "lisi", 21);
        Student stu3 = new Student(3, "wangwu", 22);

        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;

        Student stu4 = new Student(4, "zhaoliu", 23);

        boolean flag = contains(arr,stu4.getId());
        if(flag){
            System.out.println("已存在");
        }else{

        }

    }
    public static boolean contains(Student[] arr,int id){
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            int sid = stu.getId();
            if(sid == id){
                return true;
            }
        }
        return false;
    }

    public static void getCount(Student[] arr){
        Student[] newArr = new Student[4];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = arr[i];
        }
    }
}
import java.util.Scanner;

public class Work29 {

    //draw star
    //f表示左右:为true则偏左
    public void task1(int line,boolean f){
        if(f){
            for (int i=1;i<=line;i++){
                for (int j = line; j >=i; j--) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }else{
            for(int i=1;i<=line;i++){
                for(int j=1;j<i;j++){
                    System.out.print(" ");
                }
                for(int j=line;j>=i;j--){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }


    //change array
    public void task2(int[] a,int[] b){
        for(int i=0;i<a.length;i++){
            int c=a[i];
            a[i]=b[i];
            b[i]=c;
        }
    }


    //change in a array
    public void task3(int[] a){
        for(int i=0;i<(a.length/2);i++){
            int c=a[i];
            a[i]=a[a.length-i-1];
            a[a.length-i-1]=c;
        }
    }


    //MAX
    public int task4(int[] a,boolean t){
        int b=a[0];
        if(t){
            for (int i=0;i<a.length;i++){
                if(b<a[i]){
                    b=a[i];
                }
            }
        }else{
            for (int i=0;i<a.length;i++){
                if(b>a[i]){
                    b=a[i];
                }
            }
        }
        return b;
    }


    //
    public String task5(int[] a,int s) {
        String result="不在数组中";
        for(int i=0;i<a.length;i++){
            if(s==a[i]){
                result="在数组a中";
                break;
            }
        }
        return result;
    }


    //拆分
    public int[][] task6(int[] a){
        int b=a[0];
        int c=0;
        for(int i=0;i<a.length;i++){
            if(b<a[i]){
                b=a[i];
                c=i;
            }
        }
        int[] m=new int[c];
        int[] n=new int[a.length-c-1];
        for(int i=0;i<a.length;i++){
            if(i<m.length){
                m[i]=a[i];
            }else if(i==m.length){
                continue;
            }else if(i>m.length){
                n[i-m.length-1]=a[i];
            }
        }
        return new int[][]{m,n};
    }


    //delete zero
    public int[] task7(int[] a,int e){
        int count=0;
        for(int i=0;i<a.length;i++){
            if(a[i] != e){
                count++;
            }
        }
        int[] b=new int[count];
        int i=0;
        for(int j=0;j<a.length;j++){
            if(a[j] != e){
                b[i]=a[j];
                i++;
            }
        }
        return b;
    }


    //素数
    public void task8(){
        int[] a=new int[25];
        int c=0;
        for(int i=2;i<100;i++){
            boolean t=true;
            for(int j=2;j<i;j++){
                if((i%j)==0){
                    t=false;
                    break;
                }
            }
            if(t){
                a[c]=i;
                c++;
            }
        }
        for(int i:a){
            System.out.print(a[i]+"\t");
        }
    }


    //maopao
    public void task9(boolean f){
        int[] a=new int[]{1,3,2,6,4,7,5,9,8};
        if(f){
            for(int i=1;i<=a.length;i++){
                for(int j=a.length-1;j>=1;j--){
                    if(a[j]<a[j-1]) {
                        int x = a[j];
                        a[j] = a[j - 1];
                        a[j - 1] = x;
                    }
                }
            }
        }else{
            for(int i=1;i<=a.length;i++){
                for(int j=a.length-1;j>=1;j--){
                    if(a[j]>a[j-1]) {
                        int x = a[j];
                        a[j] = a[j - 1];
                        a[j - 1] = x;
                    }
                }
            }
        }
        for(int i:a){
            System.out.print(i);
        }
    }


    //登录
    public void task10(){
        int[] user=new int[]{123,456,789};
        int[] password=new int[]{321,654,987};

//        int[][] userpass=new int[3][];
//        userpass[0]=new int[]{123,456,789};
//        userpass[1]=new int[]{111,222,333};
//        userpass[2]=new int[]{444,555,666};

        Scanner input=new Scanner(System.in);
        System.out.println("请输入账号");
        int use=input.nextInt();
        System.out.println("请输入密码");
        int pass=input.nextInt();
        boolean x=false;
        for(int i=0;i<user.length;i++){
            if(use==user[i]){
                if(pass==password[i]){
                    System.out.println("登陆成功");
                    x=true;
                }
                    break;
                }
            }
        if(!x){
            System.out.println("账号或密码错误");
        }
    }
}
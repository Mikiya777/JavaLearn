package Practice;

class myRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("wdnmd");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


public class text {
    public static void main(String[] args) {
//        Integer[] i={1,2,3,4,5,6,7,};
//        int max =(int) Collections.max(Arrays.asList(i));
//        int min =(int) Collections.min(Arrays.asList(i));
//        System.out.println(max);
//        System.out.println(min);

//        String a[]={"w","d","n","m","d"};
//        String b[]={"n","m","s","l"};
//        List list= new ArrayList(Arrays.asList(a));
//        list.addAll(Arrays.asList(b));
//        Object[] c=list.toArray();
//        System.out.println(Arrays.toString(c));

//        Date date = new Date();
//        String strDateFormat = "yyyy-MM-dd HH:mm:ss";
//        SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
//        System.out.println(sdf.format(date));

//        Thread t = new Thread() {
//            public void run() {
//                pong();
//            }
//        };
//        t.run();
//        System.out.print("ping");


//        MyClass.MyInnerClass_number innercalss=new MyClass().new MyInnerClass_number();
        MyClass OutClass =new MyClass();
//        MyClass.MyInnerClass_number in≠nerClass2 =OutClass.new MyInnerClass_number();
        OutClass.MyInnerClass_Part();
        System.out.println();

        Son son=new Son();
//        son.SonFunction(new MyInnerClass_NoName_Father());
        son.SonFunction(new MyInnerClass_NoName_Father(){
            @Override
            public void AbstractFunction() {
                super.AbstractFunction();
                System.out.println("Noname_Son have been initialized");
            }
        });
        System.out.println();
        //break
       OutClass.NonameFather_interface(10);
    }

    static void pong() {
        String s = "祝你考出好成绩!";
        System.out.println(s.length());
    }
}
package Practice;

public class MyClass {
    public int normalVariable=10;
    public final int finalVariable=10;
    MyClass()
    {
        System.out.println("MyClass have been initialized");
    }

    public void MyInnerClass_Part(){
        System.out.println("MyInnerClass_part function have been performed");
        class InnerClass_Part{
            InnerClass_Part(){
                System.out.println("MyInnerClass_Part class have been initialized");
            }
            public void Part_text_function(){
                System.out.println("Part:This is one text massage");
                System.out.println("this massage will output one variable: "+finalVariable);
            }
        }
        InnerClass_Part OneText=new InnerClass_Part();
        OneText.Part_text_function();
    }

    public void NonameFather_interface(final int number){
        new PrintArray() {
            @Override
            public void print() {
                System.out.println("NonameClassByInterface have been initialized");
            }
            public void Noname_Function(){
                System.out.println("NonameClass will output one number: "+number);
                System.out.println("NonameClass will output one variable of OutClass: "+normalVariable);
            }
        }.Noname_Function();
    }
    public class MyInnerClass_number {
        MyInnerClass_number()
        {
            System.out.println("MyInnerClass_number have been initialized");
        }

    }
}

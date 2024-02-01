// TODO: Создайте метод который вернет сумму двух чисел

package task.methods;

public class Method1 {
    int summadvuhchisel(int a, int b) {
        int result = a + b;
        return result;
    }

    class Test1 {
        public static void main(String[] args) {
            Method1 q = new Method1();
            int itogo = q.summadvuhchisel(10, 11);
            System.out.println(q.summadvuhchisel(15,15));
            System.out.println(itogo);
        }


    }

}





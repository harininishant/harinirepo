public class fourthClass {
            public static void main (String[]args){
            int num = 25;
            if (check(num)) {
                System.out.println("number is divisible by 5");
            } else
                System.out.println("number not divisible by 5");
            int n=20;
                boolean output=less20(n);
                System.out.println(output);

        }

        public static boolean check(int num){
            if (num % 2 == 0 && num % 5 == 0) {
                return true;
            }
            return false;

        }public static boolean less20(int n) {
        if (n%20 == 18 || n%20 == 19){
            return true;
        }else
        {
            return false;
        }
    }



}

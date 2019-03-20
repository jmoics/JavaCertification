public class ValuesPromotion {
    
    private static void rule1() {
        int x = 5;
        long y = 10;
        
        long res = x + y;
        
        System.out.println("rule1 --> " + res);
    }
    
    private static void rule2() {
        double x = 39.21;
        //float y = 2.1;    // error en compilacion por pérdida de precision.
        float y = 2.1f;
        
        double res = x + y;
        
        System.out.println("rule2 --> " + res);
    }
    
    private static void rule3() {
        short x = 8;
        short y = 4;
        
        int res = x / y;
        
        System.out.println("rule3 --> " + res);
    }
    
    private static void rule4() {
        short x = 14;
        float y = 13;
        double z = 30;
        
        // x es promovido a int al iniciar, luego para la primera operación x es promovido a float y el resultado se promueve a double para la ultima operacion con z.
        double res = x * y / z;
        
        System.out.println("rule4 --> " + res);
    }
    
    public static void main(String[] args) {
        rule1();
        rule2();
        rule3();
        rule4();
    }
}
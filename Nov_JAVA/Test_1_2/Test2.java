//使用for循环打印出9*9乘法表
public class Test2{
    public static void main(String[] args){
        for(int x = 1;x <= 9; x++){
            for(int y = 1;y <= x; y++){
                System.out.print(y+"*"+x+"="+(x*y)+" ");
            }
            System.out.println();
        }
    }
}
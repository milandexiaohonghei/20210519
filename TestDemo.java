import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 
 */
public class TestDemo {
    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        outer:while (scanner.hasNext()) {
            String nextLine = scanner.nextLine();
            char[] chars = nextLine.toCharArray();
            HashMap<Character, Integer> hashMap = new HashMap();
            for (int i = 0; i < chars.length; i++) {
                char aChar = chars[i];
                if (hashMap.containsKey(aChar)) {
                    hashMap.put(aChar, hashMap.get(aChar) + 1);
                } else {
                    hashMap.put(aChar, 1);
                }
            }

            for (int i = 0; i < chars.length; i++) {
                char aChar = chars[i];
                if (hashMap.get(aChar) == 1) {
                    System.out.println(aChar);
                    continue outer;
                }
            }
            System.out.println(-1);
        }
    }

    public static void main3(String[] args) {
        for (int i = 0; i < 7; i++) {
            System.out.println("ddd");
            return;
        }

    }

    /**
     * 青蛙跳台阶
     * 题目：一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
     *
     * 分析：找规律发现f(n)=2^(n-1)
     * 求一个数的次方。利用函数Math.pow(n,n);---返回值位double需要转换为int类型。
     */

    public int jumpFloorII(int target) {
        if(target==0){
        }
        if(target==1){
            return 1;
        }
        return (int)Math.pow(2,target-1);
    }


    public static void main2(String[] args) {
        float target = (float) (2*3.14*3.14);
        //int target1 = 2*3.14*3.14;
        System.out.println(2*3.14*3.14);
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            Double a = in.nextDouble();
            Double b = in.nextDouble();

            //float c = (float）a;
            if(a < 3.14*2*b){
                System.out.println("Yes");
                System.out.println(3.14*2*b);
            }else{
                System.out.println("No");
                System.out.println(3.14*2*b);
            }
        }
    }

    /**
     * 写一个函数，求两个整数之和，要求不能使用四则运算符号
     * 位运算：1、左移( << )
     *        2、右移( >> )
     *        3、无符号右移( >>> )
     *        正数右移，高位用0补，负数右移，高位用1补，当负数使用无符号右移时，用0进行部位(自然而然的，就由负数变成了正数了)
     *        正数或者负数左移，低位都是用0补。(自行测试)
     *        4、位与( & ) ：位与：第一个操作数的的第n位于第二个操作数的第n位如果都是1，那么结果的第n为也为1，否则为0
     *        5、位或( | )：位或操作：第一个操作数的的第n位于第二个操作数的第n位 只要有一个是1，那么结果的第n为也为1，否则为0
     *        6、位异或( ^ )：位异或：第一个操作数的的第n位于第二个操作数的第n位 相反，那么结果的第n为也为1，否则为0
     *        7、位非( ~ ) ： 位非是一元操作符  位非：操作数的第n位为1，那么结果的第n位为0，反之。
     *        由位运算操作符衍生而来的有：
     *          &= 按位与赋值
     *          |=  按位或赋值
     *          ^= 按位非赋值
     *          >>= 右移赋值
     *          >>>= 无符号右移赋值
     *          <<= 赋值左移
     *
     *          正数的反码和补码都与原码相同。
     *          而负数的反码为对该数的原码除符号位外各位取反。
     *          负数的补码为对该数的原码除符号位外各位取反，然后在最后一位加1
     *          （负数的二进制表达式是对负数的源码进行反码和补码的运算）
     *          原码表示法规定：用符号位和数值表示带符号数，正数的符号位用“0”表示，负数的符号位用“1”表示，数值部分用二进制形式表示。
     *          反码表示法规定：正数的反码与原码相同，负数的反码为对该数的原码除符号位外各位取反。
     *          补码表示法规定：正数的补码与原码相同，负数的补码为对该数的原码除符号位外各位取反，然后在最后一位加1.
     *          正零和负零的补码相同，[+0]补=[-0]补=0000 0000B
     *
     */

    public int Add(int num1,int num2) {
        while(num2 != 0){
            int tmp = num1 ^ num2;
            num2 = (num1 & num2) << 1;
            num1 = tmp;
        }
        return num1;
    }

    /**
     *链接：https://www.nowcoder.com/questionTerminal/c67a09062c0f4a5b964eef0945d3dd06
     * 来源：牛客网
     *
     * 给定三条边，请你判断一下能不能组成一个三角形。
     *
     * 输入描述:
     * 输入包含多组数据，每组数据包含三个正整数a、b、c（1≤a, b, c≤10^100）。
     *
     *
     * 输出描述:
     * 对应每一组数据，如果它们能组成一个三角形，则输出“Yes”；否则，输出“No”。
     *
     * c≤10^100）因为这个条件所以只能使用Double类型，不能使用int类型。
     *
     * @param args
     */

    public static void main4(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            Double a = in.nextDouble();
            Double b = in.nextDouble();
            Double c = in.nextDouble();
            if((a + b) > c && (a+c) > b && (b+c) > a && Math.abs(a-b) < c && Math.abs(a-c) < b && Math.abs(b-c) < a){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }









}

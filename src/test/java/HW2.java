public class HW2 {
    public int First(int n)//Вычислить факториал числа n. n! = 1*2*…*n-1*n;
    {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    public int Second(Integer a)//Вывести число, которое является зеркальным отображением последовательности цифр заданного числа, например, задано число 123, вывести 321
    {

        StringBuffer buffer = new StringBuffer(a.toString());
        String str = buffer.reverse().toString();
        return Integer.parseInt(str);
    }
}

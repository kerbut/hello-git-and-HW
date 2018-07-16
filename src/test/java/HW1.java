public class HW1 {
    public float First(Integer a, Integer b, Integer c) //Если а – четное посчитать а*б/с,
    {
        if (a % 2 == 0) //Если а – четное посчитать а*б/с
        {
            return (float)a * b / c;
        } else if ((a + c) % 2 == 0 || (b + c) % 2 == 0)//если "а+с" или "b+c" четное - посчитать "a" возведенную в степень "c"
        {
            return (float) Math.pow(a, c);
        }
        return a + b - c;//иначе посчитать  а+б-с
    }











}

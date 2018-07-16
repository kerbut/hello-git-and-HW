public class HW4 {
    public String First(Integer a)//целого числа в строку
    {
        return a.toString();
    }

    public String Second(Float a)//вещественного числа в строку
    {
        return a.toString();
    }

    public int Third(String s)//строки в целое число
    {
        if (isNumber(s)) {
            return Integer.parseInt(s);
        }
        return -1;
    }

    public Float Fourth(String s)//строки в вещественное число
    {
        if (isNumber(s)) {
            return Float.parseFloat(s);
        }
        return (float) -1.0;
    }

    public int Fifth(String s)//Дана строка, состоящая из слов, разделенных пробелами и знаками препинания. Определить длину самого короткого слова
    {
        String[] splitArray = s.split("([^а-яА-Яa-zA-Z']+)'*\\1*");
        int minLength = Integer.MAX_VALUE;
        for (String word : splitArray) {
            int wordLength = word.length();
            if (wordLength < minLength) {
                minLength = wordLength;
            }
        }
        return minLength;
    }

    public int Sixth(String s)//Подсчитать количество слов во введенной пользователем строке
    {
        String[] splitArray = s.split("([^а-яА-Яa-zA-Z']+)'*\\1*");

        return splitArray.length;
    }

    public String Seventh(String s)//В заданной строке удалить последнее слово
    {
        String[] splitArray = s.split("([^а-яА-Яa-zA-Z']+)'*\\1*");
        splitArray[splitArray.length - 1] = "";
        return "";// Arrays.toString(splitArray);
    }

    public boolean isNumber(String str) {
        if (str == null || str=="") return false;
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) return false;
        }
        return true;
    }
}

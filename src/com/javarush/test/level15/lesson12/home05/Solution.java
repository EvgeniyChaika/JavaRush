package com.javarush.test.level15.lesson12.home05;

/* Перегрузка конструкторов
1. В классе Solution создайте по 3 конструктора для каждого модификатора доступа.
2. В отдельном файле унаследуйте класс SubSolution от класса Solution.
3. Внутри класса SubSolution создайте конструкторы командой Alt+Insert -> Constructors.
4. Исправьте модификаторы доступа конструкторов в SubSolution так, чтобы они соответствовали конструкторам класса Solution.
*/

public class Solution {
    Solution(){}
    Solution(String s){}
    Solution(Integer i){}

   private Solution(Double d){}
    private Solution(String s, Double d){}
    private Solution(Integer i, Double d){}

   public Solution(Short sh){}
    public Solution(String s, Short sh){}
    public Solution(Integer i, Short sh){}

   protected Solution(Long l){}
    protected Solution(String s, Long l){}
    protected Solution(Integer i, Long l){}



}


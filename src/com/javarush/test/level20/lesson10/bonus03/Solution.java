package com.javarush.test.level20.lesson10.bonus03;

import java.util.ArrayList;
import java.util.List;

/* Кроссворд
1. Дан двумерный массив, который содержит буквы английского алфавита в нижнем регистре.
2. Метод detectAllWords должен найти все слова из words в массиве crossword.
3. Элемент(startX, startY) должен соответствовать первой букве слова, элемент(endX, endY) - последней.
text - это само слово, располагается между начальным и конечным элементами
4. Все слова есть в массиве.
5. Слова могут быть расположены горизонтально, вертикально и по диагонали как в нормальном, так и в обратном порядке.
6. Метод main не участвует в тестировании
*/
public class Solution {
    public static void main(String[] args) {
        int[][] crossword = new int[][]{
                {'f', 'd', 'e', 'r', 'l', 'k'},
                {'u', 's', 'a', 'm', 'e', 'o'},
                {'l', 'n', 'g', 'r', 'o', 'v'},
                {'m', 'l', 'p', 'r', 'r', 'h'},
                {'p', 'o', 'e', 'e', 'j', 'j'}
        };
        List<Word> wordList = detectAllWords(crossword, "home", "same");
        for (Word word : wordList) {
            System.out.println(word.toString());
        }
        /*
Ожидаемый результат
home - (5, 3) - (2, 0)
same - (1, 1) - (4, 1)
         */
    }

    public static List<Word> detectAllWords(int[][] crossword, String... words) {
        List<Word> wordList = new ArrayList<>();
        int[][] searchDirections = new int[][]{
                {0, 1},
                {1, 1},
                {1, 0},
                {1, -1},
                {0, -1},
                {-1, -1},
                {-1, 0},
                {-1, 1},
        };
        for (String word : words) {
            nextWord:
            {
                for (int i = 0; i < crossword.length; i++) {
                    for (int j = 0; j < crossword[i].length; j++) {
                        if (word.charAt(0) == crossword[i][j]) {
                            for (int[] searchDirection : searchDirections) {
                                int tmp_i = i,
                                        tmp_j = j,
                                        wordPos = 1;
                                while (wordPos < word.length()) {
                                    tmp_i += searchDirection[0];
                                    tmp_j += searchDirection[1];
                                    if (tmp_i < 0 || tmp_i >= crossword.length || tmp_j < 0 || tmp_j >= crossword[tmp_i].length) {
                                        break;
                                    }
                                    if (word.charAt(wordPos) != crossword[tmp_i][tmp_j]) {
                                        break;
                                    } else if (wordPos == word.length() - 1) {
                                        Word tWord = new Word(word);
                                        tWord.setStartPoint(j, i);
                                        tWord.setEndPoint(tmp_j, tmp_i);
                                        wordList.add(tWord);
                                        break nextWord;
                                    }
                                    wordPos++;
                                }
                            }
                        }
                    }
                }
            }
        }
        return wordList;
    }

    public static class Word {
        private String text;
        private int startX;
        private int startY;
        private int endX;
        private int endY;

        public Word(String text) {
            this.text = text;
        }

        public void setStartPoint(int i, int j) {
            startX = i;
            startY = j;
        }

        public void setEndPoint(int i, int j) {
            endX = i;
            endY = j;
        }

        @Override
        public String toString() {
            return String.format("%s - (%d, %d) - (%d, %d)", text, startX, startY, endX, endY);
        }
    }
}

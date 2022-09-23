package org.top.homeworkservlets;

import java.util.ArrayList;

//Класс для получения статистики по введенному тексту
public class ParsingSentences {

    // 1. Метод вывода списка гласных из текста
    public static String vowelsString(String str) {
        char[] charArray = str.toCharArray(); //создаем массив, куда поместим строку, которую переводим в char

        ArrayList<Character> listCharVowels = new ArrayList<>(); //список для гласных

        for (char value : charArray) { //бежим по массиву
            if (isVowel(value)) { //проверяем условие методом isVowel если текуший символ гласная
                listCharVowels.add(value); //помещаем гласную в список
            }
        }
        // Поля
        // счётчик гласных
        int count_Vowels = 0;
        return listToSting(listCharVowels, count_Vowels);
    }

    // 2. Метод вывода списка согласных из текста
    public static String consonantsString(String str) {
        char[] charArray = str.toCharArray(); //создаем массив, куда поместим строку, которую переводим в char
        ArrayList<Character> listCharConsonants = new ArrayList<>(); //список для согласных
        for (char value : charArray) { //бежим по массиву

            if (!isVowel(value) && !isPunctuation(value) && !isSpace(value) && !isNumber(value)) {
                //проверяем на наличие пробелов,гласных и знаков препинания
                listCharConsonants.add(value); //помещаем согласную в список
            }
        }
        // счётчик согласных
        int count_Consonants = 0;
        return listToSting(listCharConsonants, count_Consonants);
    }

    // 3 .Метод вывода  списка знаков препинания из текста
    public static String punctuationString(String str) {
        char[] charArray = str.toCharArray(); //создаем массив, куда поместим строку, которую переводим в char
        ArrayList<Character> listCharPunctuation = new ArrayList<>(); //список знаков препинания
        for (char value : charArray) { //бежим по массиву

            if (isPunctuation(value)) {
                listCharPunctuation.add(value); //помещаем знаки препинания в список
            }
        }
        // счётчик знаков препинания
        int count_Punctuation = 0;
        return listToSting(listCharPunctuation, count_Punctuation);
    }

    // 4. Метод проверки знаков препинания в тексте
    public static boolean isPunctuation(char c) {
        char[] punctuation = new char[]{'.', '?', '!', ',', ';', ':', '-', '+', '(', ')', '\"', '/'};
        for (char d : punctuation) {   //ищем среди массива знаки препинания

            if (c == d) {
                return true;
            }
        }
        return false;
    }

    // 5. Метод проверки гласных в тексте
    public static boolean isVowel(char c) {
        char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u', 'y'};
        c = Character.toLowerCase(c);  //приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char d : vowels) {   //ищем среди массива гласных

            if (c == d) {
                return true;
            }
        }
        return false;
    }

    // 6. Метод проверки пробела в тексте
    public static boolean isSpace(char c) {
        char[] space = new char[]{' '};
        for (char d : space) {   //ищем среди массива пробел

            if (c == d) {
                return true;
            }
        }
        return false;
    }

    // 7. Метод проверки цифр в тексте
    public static boolean isNumber(char c) {
        char[] space = new char[]{'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
        for (char d : space) {   //ищем среди массива пробел

            if (c == d) {
                return true;
            }
        }
        return false;
    }

    // 8. Метод преобразования ArrayList в строку
    public static String listToSting(ArrayList<Character> list, int count) {
        StringBuilder sb = new StringBuilder();
        for (char c : list) {
            sb.append(c).append(" ");
            count++;
        }
        return sb + " \nколичество  " + count;
    }
}


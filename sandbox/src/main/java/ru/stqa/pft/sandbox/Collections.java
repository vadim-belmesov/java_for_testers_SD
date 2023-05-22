package ru.stqa.pft.sandbox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collections {
  public static void main(String[] args){
/*    String[] langs= new String[4]; //создали массив на 4 элемента
    langs[0] = "Java"; //присвоили 0мк элементу массива значение*/

    //создали массив langs на 4 элемента
    String[] langs = {"Java", "C#", "Python", "PHP"}; // запись эквивалентная предыдущей

    //вариант перебора массива langs
    for (int i = 0; i < langs.length; i++){
      System.out.println("Я хочу выучить for (int i = 0; i < langs.length; i++) " + langs[i]);
    }
    //вариант перебора массива langs
    for (String l: langs){
      System.out.println("for (String l: langs) " + l);
    }
    /////
    //Класс для определения коллекции-списка languages с помощью класса ArrayList
    List<String> languages = new ArrayList<String>();
    //Наполняем коллекцию
    languages.add("Java");
    languages.add("Python");
    languages.add("C#");
    languages.add("PHP");
    //вариант перебора списка languages
    for (String l: languages){
      System.out.println("Я хочу выучить List<String> " + l);
    }

    //можно переписать наполнение списка вот так
    List<String> languagesList = Arrays.asList("Java", "Python", "C#", "PHP");
    for (int i = 0; i < languagesList.size(); i++){
      System.out.println("Arrays.asList " + languagesList.get(i));
    }
  }

}

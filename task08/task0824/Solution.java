package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        Human kid1 = new Human("Li4", true, 10);
        Human kid2 = new Human("Arthas", false, 11);
        Human kid3 = new Human("Hunter", true, 15);

        ArrayList<Human> fathersAndMothersChildrens = new ArrayList<>();
        fathersAndMothersChildrens.add(kid1);
        fathersAndMothersChildrens.add(kid2);
        fathersAndMothersChildrens.add(kid3);

        Human father = new Human("Batya", true, 45, fathersAndMothersChildrens);
        Human mother = new Human("Mamka", false, 25, fathersAndMothersChildrens);

        ArrayList<Human> grandpaFsAndGrandmaFsChildrens = new ArrayList<>();
        grandpaFsAndGrandmaFsChildrens.add(father);

        ArrayList<Human> grandpaMsAndGrandmaMsChildrens = new ArrayList<>();
        grandpaMsAndGrandmaMsChildrens.add(mother);

        Human grandpaF = new Human("Ded", true, 65, grandpaFsAndGrandmaFsChildrens);
        Human grandmaF = new Human("Bab", false, 65, grandpaFsAndGrandmaFsChildrens);
        Human grandpaM = new Human("Dedok", true, 60, grandpaMsAndGrandmaMsChildrens);
        Human grandmaM = new Human("Babka", false, 60, grandpaMsAndGrandmaMsChildrens);

    }

    public static class Human {
        private String name;
        private boolean sex;
        private int age;
        private ArrayList<Human> children = new ArrayList<>();

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            System.out.println(toString());
        }

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this(name, sex, age);
            this.children = children;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}

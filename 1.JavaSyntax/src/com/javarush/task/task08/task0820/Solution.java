package com.javarush.task.task08.task0820;

import java.util.HashSet;
import java.util.Set;

/* 
Множество всех животных
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        HashSet<Cat> result = new HashSet<Cat>();
        for (int i = 0; i < 4; i++){
            result.add(new Cat());
        }
        //напишите тут ваш код
        return result;
    }

    public static Set<Dog> createDogs() {
        //напишите тут ваш код
        HashSet<Dog> resoult = new HashSet<>();
        for (int i = 0; i < 3;i++){
            resoult.add(new Dog());
        }
        return resoult;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        //напишите тут ваш код
        HashSet<Object> multiSet = new HashSet<>();
        for (Cat cat : cats){
            multiSet.add(cat);
        }
        for (Dog dog : dogs){
            multiSet.add(dog);
        }
        return multiSet;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        //напишите тут ваш код
        Set<Cat> copyCats = cats;
        for (Cat cat : cats){
            pets.remove(cat);
        }
    }

    public static void printPets(Set<Object> pets) {
        //напишите тут ваш код
        for (Object pet : pets){
            System.out.println(pet);
        }
    }

    //напишите тут ваш код
    public static class Dog{

    }
    public static class Cat{

    }
}

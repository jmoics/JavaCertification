package com.lycsoftware.chapter1;

public class CreatingObjects
{
    private String name = "Fluffy";
    {
        System.out.println("setting field");
    }

    public CreatingObjects()
    {
        name = "Tiny";
        System.out.println("setting constructor");
    }

    public static void main(String[] args)
    {
        // { System.out.println(name); } //NO COMPILA
        CreatingObjects chick = new CreatingObjects();
        System.out.println(chick.name);
    }
}
/*
 * RESULT
 * setting field
 * setting constructor
 * Tiny
 */

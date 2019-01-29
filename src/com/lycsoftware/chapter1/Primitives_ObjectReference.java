package com.lycsoftware.chapter1;

public class Primitives_ObjectReference
{
    //long max = 3123456789; // DOES NOT COMPILE
    long max = 3123456789L; // COMPILE
    
    //double notAtStart = _1000.00; // DOES NOT COMPILE
    //double notAtEnd = 1000.00_; // DOES NOT COMPILE
    //double notByDecimal = 1000_.00; // DOES NOT COMPILE
    double annoyingButLegal = 1_00_0.0_0; // this one compiles
}

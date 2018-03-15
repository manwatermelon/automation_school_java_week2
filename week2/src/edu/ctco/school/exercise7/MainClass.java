package edu.ctco.school.exercise7;

/**
 * What will be the output ?
 */
public class MainClass
{
    public static void main(String[] args)
    {
        C.methodOfC();
        //"A", as all the classes are in the same package, so the protected property "s" is accessible from class C
        //even without "protected" modifier.
    }
}
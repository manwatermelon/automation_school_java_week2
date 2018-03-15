package edu.ctco.school.exercise5;

/**
 * Why we are able to see protected variable i from class X ?
 *
 * What will be printed out, then fixed ?
 */
public class MainClass
{
    public static void main(String[] args)
    {
        X x = new X();

        System.out.println(x.i);

        x.methodOfX();
        //we are in the same package. other options would be to change method visibility to package-private, protected or public
        //from private
        //1221
        //1221
    }
}
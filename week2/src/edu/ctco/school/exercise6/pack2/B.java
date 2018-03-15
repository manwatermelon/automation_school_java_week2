package edu.ctco.school.exercise6.pack2;

import edu.ctco.school.exercise4.pack1.A;

/**
 * Why we can't instantiate class A, even it has public constructor ?
 *
 * How to fix it ?
 */
class B
{
    A a = new A();       //Compile Time Error
    //we need to import class A, as it is in different package or make both classes to be in one package.
}

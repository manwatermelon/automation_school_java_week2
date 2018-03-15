package edu.ctco.school.exercise2;

/**
 * Does field 'i' of Class Exercise2 be inherited to Class SubExercise2 in the below code?
 *
 * What are the options in this particular case?
 */
class Exercise2 {
    private int i;
}

class SubExercise2 extends Exercise2 {
    //to access i variable from Exercise2 class it should be package-private, protected or public.
}
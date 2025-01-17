package Controller;

/**
 * Gathers together operations needed by the application
 *
 * @author andrzejcalka
 * @author =-_-=
 */
public class Operator {

    public Operator() { }

    // ==============================================  Methods  ==============================================

    /**
     * Finding modulo of a number
     *
     * @param number        number A
     * @param moduloBy      number B
     * @return              remainder after division of number A by number B
     */
    public int modulo(int number, int moduloBy) {
        if (moduloBy == 1 || moduloBy == 0)
            return 0;
        int modulo = number % moduloBy;
        if (number < 0)
            modulo += moduloBy;
        return modulo;
    }
}

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
        int modulo = number % moduloBy;
        if (number < 0)
            modulo += moduloBy;
        return modulo;
    }
}

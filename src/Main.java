package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    boolean result;

	    MyIntNum myNum = new MyIntNum(12);
	    MyIntNum myNum2 = new MyIntNum(16);

	    IntPredicate inp = myNum::isFactor;
	    result = inp.test( 3);
	    if(result)
            System.out.println("3 jest czynnikiem liczby " + myNum.getNum());

	    result = inp.test( 3);
	    if(!result)
            System.out.println("3 nie jest czynnikiem liczby " + myNum2.getNum());

	    MyIntNum myNum3 = new MyIntNum(20);
	    inp = myNum3::hasCommonFactor;
	    result = inp.test(10);
	    if (result)
            System.out.println("10  ma wspolny czynnik z " + myNum3.getNum());
	    else
            System.out.println("nie ma wspólnego czynnika");
    }
}

package array;

import java.util.Scanner;

public class ClassArray {

    int meuArray[] = new int[ 10 ];
    Scanner input = new Scanner( System.in );

    public void putNumbers() {
        for ( int i = 0; i < meuArray.length; i++ ) {
            System.out.print( "Informe um número: " );
            meuArray[ i ] = input.nextInt();
        }
    }

    public void showNumbersAboveAverage() {
        int acum = 0;
        for ( int i = 0; i < meuArray.length; i++ ) {
            acum += meuArray[ i ];
        }
        int average = acum / meuArray.length;
        for ( int i = 0; i < meuArray.length; i++ ) {
            if ( meuArray[ i ] > average ) {
                System.out.println( meuArray[ i ] );
            }
        }
    }


}


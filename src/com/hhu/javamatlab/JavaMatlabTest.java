package com.hhu.javamatlab;

import com.mathworks.toolbox.javabuilder.MWException;
import operation.Operation;

public class JavaMatlabTest {
	public static void main(String[] args) {


		try {
			Operation abc=new Operation();
			Object[] result = null; /* Stores the result */
			int a=10, b=2;
			result=abc.operation(4, a, b );
			System.out.println(result[0].toString());
			System.out.println(result[1].toString());
			System.out.println(result[2].toString());
			System.out.println(result[3].toString());
			System.out.println();
		} catch (MWException e1) {
			e1.printStackTrace();
		} finally {
/* Free native resources */
			System.gc();
		}
	}

}

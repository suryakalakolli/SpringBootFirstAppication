package com.kala.service.impl.utils;

import com.kala.model.Student;

public interface StudentUtil {

	public static void calculate(Student s) {
	var fee	 = s.getStdFee();
	var disc = fee * 10/100.0;
	var gst = fee * 12/100.0;
	s.setStdFeeDisc(disc);
	s.setStdFeeGst(gst);
	}

}

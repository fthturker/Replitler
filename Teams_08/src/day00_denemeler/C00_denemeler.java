package day00_denemeler;

import java.util.Scanner;

public class C00_denemeler<Public> {
  String isim;
  String soyisim;
  int numara;
  boolean gercekMi;

  public C00_denemeler(String ism, String soyism, int no, boolean grc) {

    isim=ism;
    soyisim=soyism;
    numara=no;
    gercekMi=grc;
  }
    Public String java.lang.String toString(){

    return ("İsim :"+isim+", Soyisim"+soyisim+", numara"+numara);
  }

  }





package com.selenium.seleniumtesting.ObjectFun;

public class Sscjl {
    String address;
    String marks10th;
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMarks10th() {
        return marks10th;
    }

    public void setMarks10th(String marks10th) {
        this.marks10th = marks10th;
    }


    public static void main(String[] args) {
        SscExam pragyassc=new SscExam();
        pragyassc.setName("Pragya Singh");
        pragyassc.setAadharCard("1234567890");
        pragyassc.setDob("12/12/1991");
        pragyassc.setId(1231);
        System.out.println(pragyassc.getName()+" "+pragyassc.getAadharCard()+" "+pragyassc.getDob()+" "+pragyassc.getId());
        Sscjl pragyacjl=new Sscjl();
        pragyacjl.setAddress("Bihar");
        pragyacjl.setMarks10th("99%");
        System.out.println(pragyacjl.getAddress()+" "+pragyacjl.getMarks10th());

    }


}

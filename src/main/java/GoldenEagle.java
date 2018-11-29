public  class GoldenEagle {

    public static String convert(int input){
        String romanValue="";
        int toConvert = input;
        if(toConvert > 0 || toConvert < 3999){
            while(toConvert>0){
                while (toConvert >= 1000){
                    romanValue+="M";
                    toConvert-=1000;
                    System.out.println(toConvert+" "+romanValue);
                }
                while(toConvert >=900){
                    romanValue+="CM";
                    toConvert-=900;
                    System.out.println(toConvert+" "+romanValue);
                }
                while(toConvert >= 500){
                    romanValue+="D";
                    toConvert-=500;
                    System.out.println(toConvert+" "+romanValue);
                }
                while(toConvert >= 400){
                    romanValue+="CD";
                    toConvert-=400;
                    System.out.println(toConvert+" "+romanValue);
                }
                while(toConvert >= 100){
                    romanValue+="C";
                    toConvert-=100;
                    System.out.println(toConvert+" "+romanValue);
                }
                while (toConvert >= 90){
                    romanValue+="L";
                    toConvert-=50;
                    System.out.println(toConvert+" "+romanValue);
                }
                while (toConvert >= 50){
                    romanValue+="L";
                    toConvert-=50;
                    System.out.println(toConvert+" "+romanValue);
                }
                while(toConvert >= 40){
                    romanValue+="XL";
                    toConvert-=40;
                    System.out.println(toConvert+" "+romanValue);
                }
                while(toConvert >= 10){
                    romanValue+="X";
                    toConvert -= 10;
                    System.out.println(toConvert+" "+romanValue);
                }
                while (toConvert >= 9){
                    romanValue+="IX";
                    toConvert-=9;
                    System.out.println(toConvert+" "+romanValue);
                }
                while(toConvert>=5){
                    romanValue+="V";
                    toConvert-=5;
                    System.out.println(toConvert+" "+romanValue);
                }
                while (toConvert>=4){
                    romanValue+="IV";
                    toConvert-=4;
                    System.out.println(toConvert+" "+romanValue);
                }
                while (toConvert>0){
                    romanValue+="I";
                    toConvert-=1;
                    System.out.println(toConvert+" "+romanValue);
                }
            }
        }
        return romanValue;
    }
}

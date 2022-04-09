package tech.wiktor.api.api.utils;

public class ClassToID {
    public static String parse(String className){
        switch (className.toUpperCase()){
            case "1AT":
                return "o1";
            case "1BT":
                return "o2";
            case "1CT":
                return "o3";
            case "1DT":
                return "o4";
            case "1ET":
                return "o5";
            case "1LO":
                return "o6";
            case "2AT":
                return "o7";
            case "2BT":
                return "o8";
            case "2CT":
                return "o9";
            case "2DT":
                return "o10";
            case "2LA":
                return "o11";
            case "3AS":
                return "o12";
            case "3BS":
                return "o13";
            case "3CS":
                return "o14";
            case "3DS":
                return "o15";
            case "3LAS":
                return "o16";
            case "3AG":
                return "o17";
            case "3BG":
                return "o18";
            case "3CG":
                return "o19";
            case "3DG":
                return "o20";
            case "3LAG":
                return "o21";
            case "4AT":
                return "o22";
            case "4BT":
                return "o23";
            case "4CT":
                return "o24";
            case "4DT":
                return "o25";
            case "4ET":
                return "o26";
            case "1LAS":
                return "o27";
            default:
                return "wrong";
        }
    }
}
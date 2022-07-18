public class 進数変換{
public String Binary(String input){
return Integer.toBinaryString (Integer.parseInt(input));
}

public String Octal(String input) {
return Integer.toOctalString (Integer.parseInt(input));
}

public String Hexadecimal(String input) {
return Integer.toHexString (Integer.parseInt(input));
}

public String B_to_D(String input) {
int in = Integer.parseInt(input,2);
String input_decimal = String.valueOf(in);
return input_decimal;
}

public String O_to_D(String input) {
int in = Integer.parseInt(input,8);
String input_decimal = String.valueOf(in);
return input_decimal;
}

public String H_to_D(String input) {
int in = Integer.parseInt(input,16);
String input_decimal = String.valueOf(in);
return input_decimal;
}
}
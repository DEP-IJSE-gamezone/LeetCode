void main() {
//    System.out.println(isPalindrome(111));
//    System.out.println(isPalindrome(11));
//    System.out.println(isPalindrome(10));
//    System.out.println(isPalindrome(1221));
//   System.out.println(isPalindrome(11101));
//    System.out.println(isPalindrome(1000000001)); // true
    System.out.println(isPalindrome(1410110141)); // true

}
boolean isPalindrome(int x) {
    if (x < 0) return false;
    else {

        String number = "";
        String number1 = x + "";

        while (x / 10 > 0) {
            number += (x % 10);
            x/=10;
        }
        number+=x;
        //   System.out.println("number " + number + " number1 " + number1);

        return number1.equals(number) ? true : false;
    }

}
import java.util.Scanner;

class Exam2525 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int h = scan.nextInt();
    int m = scan.nextInt();
    int useTime = Integer.parseInt(scan.next());

    // useTime is over than 1h
    if(useTime >= 60) {
      h += useTime / 60;
      m += useTime % 60;
    } else {
      m += useTime;
      if(m >= 60) {
        h += 1;
        m = m - 60; 
      }   
    }


      if(m >= 60) {
        h += 1;
        m = m - 60;
      }

      if(h >= 24) {
        h -= 24;
      }
    System.out.println(h + " " + m);
  }
}

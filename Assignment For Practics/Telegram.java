import java.util.Scanner;

public class Telegram {
    long number;
    int otp;
    // -------------------------------------------------------------- login

    public void login() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        long number;
        int count = 0;
        number = sc.nextLong();
        while (number != 0) {
            number = number / 10;
            ++count;
        }
        if (count == 10) {
            System.out.println("-----------------------------------");
            System.out.println("Your number added");
            System.out.println("\nOTP already sended");
        } else {
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            System.out.println("Please enter correct Phone Number");
            number = sc.nextLong();
            if (true) {
                System.out.println("-----------------------------------");
                System.out.println("Your number added");
                System.out.println("\nOTP already sended");
            }
        }
        int otp;
        int count1 = 0;
        System.out.println("-----------------------------------");
        System.out.println("Enter OTP");
        otp = sc.nextInt();
        while (otp != 0) {
            otp = otp / 10;
            ++count1;
        }
        if (count1 == 6) {
            System.out.println("-----------------------------------");
            System.out.println("Your otp is correct");
            System.out.println("\nYou login sussessfully");
            System.out.println("-----------------------------------");
        } else {
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            System.out.println("Please enter correct otp");
            System.out.println("\nPlease enter otp in 6-digit");
            otp = sc.nextInt();
            if (true) {
                System.out.println("-----------------------------------");
                System.out.println("Your otp is correct");
                System.out.println("\nYou login sussessfully");
                System.out.println("-----------------------------------");
            }
        }
    }
}

// ------------------------------------------------------------------- Chat

class Chat extends Telegram {
    public void chat() {
        Scanner sc = new Scanner(System.in);
        System.out.println("You want to Private Chat - Type => P");
        System.out.println("\nYou want to Group Chat - Type => g");
        System.out.println("\nYou want Audio/Video call - Type => c");
        System.out.println("-----------------------------------");
        String input = "";
        System.out.println("Please type p or g or c");
        input = sc.nextLine();
        if (input.equals("p")) {
            System.out.println("-----------------------------------");
            System.out.println("Now you are in privat chat");
            System.out.println("-----------------------------------");
            PrivateChat PrivateChat = new PrivateChat();
            PrivateChat.privateChat();
        } else if (input.equals("g")) {
            System.out.println("-----------------------------------");
            System.out.println("Now you are in group  chat");
            System.out.println("-----------------------------------");
            GroupChat GroupChat = new GroupChat();
            GroupChat.groupChat();

        } else if (input.equals("c")) {
            System.out.println("-----------------------------------");
            System.out.println("Now you are in Audio/Video call section");
            System.out.println("-----------------------------------");
            // Call c1 = new Call();
            // c1.call();

        } else {
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            System.out.println("You enter wrong condition");
            System.out.println("\nPlease give the right condition");
            System.out.println("-----------------------------------");
            System.out.println("You want to Private Chat - Type => P");
        System.out.println("\nYou want to Group Chat - Type => g");
        System.out.println("\nYou want Audio/Video call - Type => c");
        System.out.println("-----------------------------------");
        String input1 = "";
        System.out.println("Please type p or g or c");
        input1 = sc.nextLine();
        if (input1.equals("p")) {
            System.out.println("-----------------------------------");
            System.out.println("Now you are in privat chat");
            System.out.println("-----------------------------------");
            PrivateChat PrivateChat = new PrivateChat();
            PrivateChat.privateChat();
        } else if (input1.equals("g")) {
            System.out.println("-----------------------------------");
            System.out.println("Now you are in group  chat");
            System.out.println("-----------------------------------");
            GroupChat GroupChat = new GroupChat();
            GroupChat.groupChat();

        } else if (input1.equals("c")) {
            System.out.println("-----------------------------------");
            System.out.println("Now you are in Audio/Video call section");
            System.out.println("-----------------------------------");
            }
        }
    }
}

class PrivateChat extends Chat {
    public void privateChat() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the name for chating person");
        System.out.println("-----------------------------------");
        String name;
        name = sc.nextLine();
        System.out.println("-----------------------------------");
        System.out.println(name + " is online");
        System.out.println("-----------------------------------");
        String messag;
        messag = sc.nextLine();
        // System.out.println(messag + name);
        System.out.println("<<<<<<<<<<< " + messag + " dear");
        String messag1;
        messag1 = sc.nextLine();
        // System.out.println(messag1 + name);
        System.out.println("<<<<<<<<<<< " + messag1 + " dear");
        String messag2;
        messag2 = sc.nextLine();
        // System.out.println(messag2 + name);
        System.out.println("<<<<<<<<<<< " + messag2 + " dear");
        String input;
        System.out.println("-----------------------------------");
        System.out.println("you want to close the app please type - c");
        input = sc.nextLine();
        if (input.equals("c")) {
            System.out.println("-----------------------------------");
            System.out.println("        your app is close");
            System.out.println("-----------------------------------");
            System.exit(0);
        }
    }
}

class GroupChat extends Chat {
    public void groupChat() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the group name for chating");
        System.out.println("-----------------------------------");
        String name;
        name = sc.nextLine();
        System.out.println("-----------------------------------");
        System.out.println("All group member are online from : " + name);
        System.out.println("-----------------------------------");

        String messag;
        messag = sc.nextLine();
        // System.out.println(messag + name);
        System.out.println("\n<<<<<<<<<<< " + messag + ">>>>>>>>>> group member 1");
        System.out.println("\n<<<<<<<<<<< " + messag + ">>>>>>>>>> group member 2");
        System.out.println("\n<<<<<<<<<<< " + messag + ">>>>>>>>>> group member 3");
        String messag1;
        messag1 = sc.nextLine();
        // System.out.println(messag1 + name);
        System.out.println("\n<<<<<<<<<<< " + messag1 + ">>>>>>>>>> group member 1");
        System.out.println("\n<<<<<<<<<<< " + messag1 + ">>>>>>>>>> group member 3");
        System.out.println("\n<<<<<<<<<<< " + messag1 + ">>>>>>>>>> group member 2");
        String messag2;
        messag2 = sc.nextLine();
        // System.out.println(messag2 + name);
        System.out.println("\n<<<<<<<<<<< " + messag2 + ">>>>>>>>>> group member 3");
        System.out.println("\n<<<<<<<<<<< " + messag2 + ">>>>>>>>>> group member 1");
        System.out.println("\n<<<<<<<<<<< " + messag2 + ">>>>>>>>>> group member 2");
        String input;
        System.out.println("-----------------------------------");
        System.out.println("you want to close the app please type - c");
        input = sc.nextLine();
        if (input.equals("c")) {
            System.out.println("-----------------------------------");
            System.out.println("        your app is close");
            System.out.println("-----------------------------------");
            System.exit(0);
        }
    }
}

// --------------------------------------------------------------------- Call
class Call extends Telegram {
    public void call() {
        Scanner sc = new Scanner(System.in);
        System.out.println("You want to Audio Call - Type => a");
        System.out.println("\nYou want to Video Call - Type => v");
        System.out.println("-----------------------------------");
        String input = "";
        System.out.println("Please type a or v");
        input = sc.nextLine();
        if (input.equals("a")) {
            System.out.println("-----------------------------------");
            System.out.println("Now you are in Audio call");
            System.out.println("-----------------------------------");
            AudioCall aCall = new AudioCall();
            aCall.audioCall();
        }
        if (input.equals("v")) {
            System.out.println("-----------------------------------");
            System.out.println("Now you are in Video call");
            System.out.println("-----------------------------------");
            VideoCall vCall = new VideoCall();
            vCall.videoCall();
        }
    }
}
// --------------------------------------------------------------------- Audio
// Call

class AudioCall extends Call {
    public void audioCall() {
        Scanner sc = new Scanner(System.in);
        System.out.println("You want to Private Audio Call - Type => p");
        System.out.println("\nYou want to Group Audio Chat - Type => g");
        System.out.println("-----------------------------------");
        String input = "";
        System.out.println("Please type p or g");
        input = sc.nextLine();
        if (input.equals("p")) {
            System.out.println("-----------------------------------");
            System.out.println("Now you are in Private Audio call");
            System.out.println("-----------------------------------");
            PrivateAudioCall PrivateAudioCall = new PrivateAudioCall();
            PrivateAudioCall.privateAudioCall();
        }
        if (input.equals("g")) {
            System.out.println("-----------------------------------");
            System.out.println("Now you are in Group Audio call");
            System.out.println("-----------------------------------");
            GroupAudioCall GroupAudioCall = new GroupAudioCall();
            GroupAudioCall.groupAudioCall();

        }
    }
}

class PrivateAudioCall extends AudioCall {
    public void privateAudioCall() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the name for Audio call person");
        String name;
        name = sc.nextLine();
        System.out.println("-----------------------------------");
        System.out.println(name + " is online");
        System.out.println("-----------------------------------");
        String message;
        System.out.println("-----------------------------------");
        System.out.println("you want audio call with " + name + " please type - c");
        message = sc.nextLine();
        if (message.equals("c")) {
            System.out.println("-----------------------------------");
            System.out.println("Sorry Audio Call Not Support Now");
            System.out.println("\nWork In Progress");
            System.out.println("-----------------------------------");
        }
        String input;
        System.out.println("-----------------------------------");
        System.out.println("you want to close the app please type - c");
        input = sc.nextLine();
        if (input.equals("c")) {
            System.out.println("-----------------------------------");
            System.out.println("        your app is close");
            System.out.println("-----------------------------------");
            System.exit(0);
        }
    }
}

class GroupAudioCall extends AudioCall {
    public void groupAudioCall() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the group name for Audio call");
        String name;
        name = sc.nextLine();
        System.out.println("-----------------------------------");
        System.out.println("All group member are online from : " + name);
        System.out.println("-----------------------------------");
        String message;
        System.out.println("-----------------------------------");
        System.out.println("you want audio call with your group member ( " + name + " ) please type - c");
        message = sc.nextLine();
        if (message.equals("c")) {
            System.out.println("-----------------------------------");
            System.out.println("Sorry Audio Call Not Support Now");
            System.out.println("\nWork In Progress");
            System.out.println("-----------------------------------");
        }
        String input;
        System.out.println("-----------------------------------");
        System.out.println("you want to close the app please type - c");
        input = sc.nextLine();
        if (input.equals("c")) {
            System.out.println("-----------------------------------");
            System.out.println("        your app is close");
            System.out.println("-----------------------------------");
            System.exit(0);
        }
    }
}
// --------------------------------------------------------------------- Video
// call

class VideoCall extends Call {
    public void videoCall() {
        Scanner sc = new Scanner(System.in);
        System.out.println("You want to Private Video Call - Type => p");
        System.out.println("\nYou want to Group Video Chat - Type => g");
        System.out.println("-----------------------------------");
        String input = "";
        System.out.println("Please type p or g");
        input = sc.nextLine();
        if (input.equals("p")) {
            System.out.println("-----------------------------------");
            System.out.println("Now you are in Private Video call");
            System.out.println("-----------------------------------");
            PrivateVideoCall PrivateVideoCall = new PrivateVideoCall();
            PrivateVideoCall.privateVideoCall();
        }
        if (input.equals("g")) {
            System.out.println("-----------------------------------");
            System.out.println("Now you are in Group Video call");
            System.out.println("-----------------------------------");
            GroupVideoCall GroupVideoCall = new GroupVideoCall();
            GroupVideoCall.groupVideoCall();
        }
    }
}

class PrivateVideoCall extends VideoCall {
    public void privateVideoCall() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the name for Private Video Call person");
        String name;
        name = sc.nextLine();
        System.out.println("-----------------------------------");
        System.out.println(name + " is online");
        System.out.println("-----------------------------------");
        String message;
        System.out.println("-----------------------------------");
        System.out.println("you want video call with " + name + " please type - c");
        message = sc.nextLine();
        if (message.equals("c")) {
            System.out.println("-----------------------------------");
            System.out.println("Sorry Audio Call Not Support Now");
            System.out.println("\nWork In Progress");
            System.out.println("-----------------------------------");
        }
        String input;
        System.out.println("-----------------------------------");
        System.out.println("you want to close the app please type - c");
        input = sc.nextLine();
        if (input.equals("c")) {
            System.out.println("-----------------------------------");
            System.out.println("        your app is close");
            System.out.println("-----------------------------------");
            System.exit(0);
        }
    }
}

class GroupVideoCall extends VideoCall {
    public void groupVideoCall() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the group name for Group Video Call");
        String name;
        name = sc.nextLine();
        System.out.println("-----------------------------------");
        System.out.println("All group member are online from : " + name);
        System.out.println("-----------------------------------");
        String message;
        System.out.println("-----------------------------------");
        System.out.println("you want video call with your group member ( " + name + " ) please type - c");
        message = sc.nextLine();
        if (message.equals("c")) {
            System.out.println("-----------------------------------");
            System.out.println("Sorry Video Call Not Support Now");
            System.out.println("\nWork In Progress");
            System.out.println("-----------------------------------");
        }
        String input;
        System.out.println("-----------------------------------");
        System.out.println("you want to close the app please type - c");
        input = sc.nextLine();
        if (input.equals("c")) {
            System.out.println("-----------------------------------");
            System.out.println("        your app is close");
            System.out.println("-----------------------------------");
            System.exit(0);
        }
    }
}

// --------------------------------------------------------------------- Main
class Main {
    public static void main(String[] args) {
        Chat c = new Chat();
        c.login();
        c.chat();
        Call c1 = new Call();
        c1.call();
    }
}

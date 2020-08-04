package leetcode.String;

import java.util.HashSet;
import java.util.Set;

/*
Every email consists of a local name and a domain name, separated by the @ sign.
'.' -> If you add periods ('.') between some characters in the local name part of an email address, mail sent there will be forwarded to the same address without dots in the local name
'+' -> If you add a plus ('+') in the local name, everything after the first plus sign will be ignored.
 */
public class UniqueEmailAddress {

    public static void main(String[] args) {
        String arr[] = {"testemail@leetcode.com", "testemail1@leetcode.com", "testemail+david@lee.tcode.com"};
        int count = numUniqueEmails(arr);
        System.out.println(count);
    }

    public static int numUniqueEmails(String emails[]) {
        Set<String> finalSet = new HashSet<>();

        for (int i = 0; i < emails.length; i++) {
            String[] fullEmailAddress = emails[i].split("@");
            String localName = fullEmailAddress[0];
            String domainName = fullEmailAddress[1];

            localName = localName.replace(".", ""); // replace all . from from local name
            // split localName by + in order to remove part appearing after + icon
            if (localName.contains("+")) {
                String localNameWithoutPlus = "";
                for (int j = 0; j < localName.length(); j++) {
                    if (localName.charAt(j) == '+') {
                        break;
                    } else {
                        localNameWithoutPlus += localName.charAt(j);
                    }
                }
                finalSet.add(localNameWithoutPlus + '@' + domainName);
            } else {
                finalSet.add(localName + '@' + domainName);
            }

        }

        return finalSet.size();
    }


}

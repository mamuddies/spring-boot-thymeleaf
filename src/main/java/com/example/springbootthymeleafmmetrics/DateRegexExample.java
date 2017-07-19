package sample.metrics.dropwizard;

public class DateRegexExample {

    private static final String DATE_PATTERN = "(0[1-9]|1[012])/((20|21)\\d\\d)";

    public static void main(String[] args) {
        // start input
        String stringArrayDate[] = {"10", "2017"};
        // End input

        StringBuffer strDate = new StringBuffer();

        for (int i = 0; i <= stringArrayDate.length - 1; i++) {
            strDate = strDate.append(stringArrayDate[i]);
            if (i != stringArrayDate.length - 1) {
                strDate.append("/");

            }
        }

        System.out.println(strDate);
        if (!strDate.toString().matches(DATE_PATTERN)) {
            System.out.println("invalid date");
        }

    }

}

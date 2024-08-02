class SeniorCitizen {

    public static int Senior(String[] details){
         int count=0;
        for (int j = 0; j < details.length; j++) {
            String str = details[j];
            String ch = str.substring(11, 13);
            int res = Integer.parseInt(ch);
            if (res > 60) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
    
        String[] details = { "7868190130M2022", "5303914400F9211", "9273338290F4010" };
       
        System.out.println(Senior(details));

    }
}
/*class Solution {
    public String capitalizeTitle(String title) {
        StringBuilder sb = new StringBuilder();
        for(String s: title.split("\\s+")){
            if(s.length()>2){
                sb.append(Character.toUpperCase(s.charAt(0)));
                sb.append(s.substring(1).toLowerCase());
                sb.append(" ");
            }
            else{
                sb.append(s.substring(0).toLowerCase());
                 sb.append(" ");
            }
        }
        return sb.toString().trim();
    }
}*/







class Solution {
    public String capitalizeTitle(String title) {
        StringBuilder sb = new StringBuilder();
        for(String s: title.split("\\s+")){
            if(s.length()>2){
                sb.append(Character.toUpperCase(s.charAt(0)));
                sb.append(s.substring(1).toLowerCase());
                sb.append(" ");
            }
            else{
                sb.append(s.substring(0).toLowerCase());
                 sb.append(" ");
            }
        }
        return sb.toString().trim();
    }
}

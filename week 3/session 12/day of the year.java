import java.time.LocalDate;

class Solution {
    public int dayOfYear(String date) {
        LocalDate d = LocalDate.parse(date);

        return d.getDayOfYear();
    }
}
//output
Input:
date = "2019-02-10"

Output:
41

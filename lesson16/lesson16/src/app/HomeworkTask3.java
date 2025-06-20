package app;


/*
COHORT-68M KIRICHENKO IHOR
Дано три переменные:

isQuietHours — сейчас тихое время (ночь, например)
hasNeighborsComplaint — жалуются ли соседи
isHoliday — сейчас праздник Музыку можно включить, если не тихое время и соседи не жалуются.
В праздник музыку можно включать даже если соседи жалуются или тихое время.
Условие для переменной isMusicAllowed: можно ли включать музыку
 */
public class HomeworkTask3 {
    public static void main(String[] args) {

        boolean isQuietHours = false;

        boolean hasNeighborsComplaint = true;

        boolean isHoliday = true;

        boolean isMusicAllowed = (!isQuietHours && !hasNeighborsComplaint) || isHoliday;

        System.out.println("Музыку можно включить: " + isMusicAllowed);
    }
}

//make-a-square-with-the-same-color/


public class problem3127 {
    public static void main(String[] args) {
        char[][] grid={{'W','B'},
    {'B','B'}
};
        System.out.println(canMakeSquare(grid));
    }
    public static boolean canMakeSquare(char[][] grid) {
        if (grid[0][0]==grid[0][1] && grid[1][0]==grid[0][1] || grid[1][0]==grid[1][1] && grid[0][0]==grid[1][1]|| grid[0][0]==grid[0][1] && grid[0][0]==grid[1][1]) {
            return true;
        }  
        else if (grid[0][1]==grid[0][2] && grid[1][1]==grid[0][2] || grid[1][1]==grid[1][2] && grid[0][1]==grid[1][2]|| grid[0][1]==grid[0][2] && grid[0][1]==grid[1][2]) {
            return true;     
        }
        else if (grid[1][0]==grid[1][1] && grid[2][0]==grid[1][1] || grid[2][0]==grid[2][1] && grid[1][0]==grid[2][1]|| grid[1][0]==grid[1][1] && grid[1][0]==grid[2][1]) {
            return true;
        }                     
        else if (grid[1][1]==grid[1][2] && grid[2][1]==grid[1][2] || grid[2][1]==grid[2][2] && grid[1][1]==grid[2][2]|| grid[1][1]==grid[1][2] && grid[1][1]==grid[2][2]) {
            return true;
        }
        return false;
    }     
}     


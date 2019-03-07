package student;

public class ShowStudent {
    private String idNo;
    private int creditHours;
    private int points;
    
    public ShowStudent(){
        this.idNo = "18-6129-822";
        this.creditHours = 0;
        this.points = 0;
    }
    public String getIdNo(){
        return idNo;
    }
    public int getCreditHours(){
        return creditHours;
    }
    public void setIdNo(String idNo){
        this.idNo = idNo;
    }
    public void setCreditHours(int creditHours){
        this.creditHours = creditHours;
    }   
    public int computePoints(){
        int scale = 4;
        this.points = creditHours*scale;
        return points;
    }
    public int computeGpa(){
        int gpa = computePoints()/creditHours;
        return gpa;
    }
    public String studLevel(){
        String level = "";
        if( points == 12){
            level = "A";
        }else if(points == 24){
            level = "B";
        }else if(points == 36){
            level = "C";             
        }else if(points== 48){
            level = "D";
        }
        return level;
    }
   
}

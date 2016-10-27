public class ex003_cerc {
  private double Raza = 0;
  private double Pi = 3.14;
  
  public double getRaza() {
    return Raza;
  }
  
  public void setRaza(double Raza) {
    this.Raza = Raza;
  }
  
  public double Aria() {
    if((this.Raza>=0)){
      return this.Pi*Math.pow(this.Raza,2);
    }
    else
    {
      return -1;
    }
  }
  public double AriaArc(double alfa_grade) {
    if ((alfa_grade<360)&&(alfa_grade>=0)) {
      return ((this.Pi*Math.pow(this.Raza,2)*2*alfa_grade)/360);
    } 
    else{
      return -1;
    }
  }
} 

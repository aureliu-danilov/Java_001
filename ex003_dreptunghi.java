public class ex003_dreptunghi {
  private double Lungime = 0;
  private double Latime = 0;
  
  public double getLungime() {
    return Lungime;
  }
  public void setLungime(double Lungime) {
    this.Lungime = Lungime;
  }
  public double getLatime() {
    return Latime;
  }
  public void setLatime(double Latime) {
    this.Latime = Latime;
  }
  
  public double Aria() {
    if((this.Lungime>=0)&&(this.Latime>=0)){
      return this.Lungime*this.Latime;
    }
    else
    {
      return -1;
    }
  }
  public double Perimetrul() {
    if((this.Lungime>=0)&&(this.Latime>=0)){
      return ((this.Lungime+this.Latime)*2);
    }
    else
    {
      return -1;
    }
  }
  public double Diagonala() {
    if((this.Lungime>=0)&&(this.Latime>=0)){
      return (Math.sqrt(Math.pow(this.Lungime,2)+Math.pow(this.Latime,2)));
    }
    else
    {
      return -1;
    }
  }
} 

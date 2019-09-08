class Patient{
    String patientName="Shyam";
    double height,weight;
    Patient(double w,double h)
    {
        weight=w;
        height=h;
    }
    double computeBMI()
    {
       return (weight/(height*height));
    }

    
  public static void main (String[] args)
 {
  Patient p=new Patient(75,156);
  double b=p.computeBMI();
  String name=p.patientName;
  System.out.printf("The BMI of %s is : %f",name,b);
  
  
 }
}
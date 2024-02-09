public class MyMath{
  
  public double multiply(double a, double b){
    
    double answer = 0;

    for(double i = 0; i < b; i++){

      answer += a;

    }

    return answer;

  }

  public double add(double a, double b){

    double answer = 0;

    answer = a + b;

    return answer;

  }

  public double sub(double a, double b){

    double answer = 0;

    double subtract = b * -1;

    answer = a + subtract;

    return answer;

  }

  public double divide(double a, double b){

    double div = b;

    double answer = 0;
    
    while(div <= a){
  
      div = div + b;

      answer = answer + 1;

    }

    return answer;

  }

  public double mod(double a, double b){
    
    double answer = 0;

    answer = a % b;

    return answer;

  }

}

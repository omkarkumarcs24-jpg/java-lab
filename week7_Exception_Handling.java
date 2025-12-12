class wrongAgeException extends Exception{
    public wrongAgeException(String Message){
        super(Message);
    }
}

class Father {
    int fatherAge;
    Father (int age) throws wrongAgeException{
        if(age<0){
            throw new wrongAgeException("FAther age can not be negative.");
        }
        this.fatherAge=age;
    }
}

class Son extends Father{
    int sonAge;
    Son(int fatherAge , int sonAge) throws wrongAgeException{
        super(fatherAge);
        if(sonAge>=fatherAge){
            throw new wrongAgeException("son's age can not be greate than father age.");

        }
        if(sonAge<0){
            throw new wrongAgeException("Son's age can not be negative.");
        }
        this.sonAge=sonAge;
    }
}

public class ExceptionInheritanceDemo{
    public static void main(String[] args) {
        try{
            Father f = new Father(45);
            Son s = new Son(45,20);
            System.out.println("father's age: "+ f.fatherAge);
            System.out.println("Son's age: "+s.sonAge);

        }
        catch(wrongAgeException e){
            System.out.println("Exception Caught: "+e.getMessage());
        }
        try{
            Son s2 = new Son (40 , 50);

        }
        catch(wrongAgeException e){
            System.out.println("Exception caught: "+ e.getMessage());

        }
        try{
            Father f2 = new Father(-5);
        }
        catch(wrongAgeException e ){
            System.out.println("Exception caught"+ e.getMessage());
        }
        }
        }
        

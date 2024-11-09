interface Age { 
    int x = 21; 
    void getAge(); 
} 
  
// Main class 
class AnonymousDemo { 
    
    // Main driver method 
    public static void main(String[] args) 
    {
        Age oj1 = new Age() { 
            //method reference
            @Override public void getAge() 
            { 
                // printing  age 
                System.out.print("Age is " + x); 
            } 
        }; 
        
        oj1.getAge(); 
    } 
}


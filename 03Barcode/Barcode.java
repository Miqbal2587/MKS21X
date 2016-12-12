public class Barcode implements Comparable<Barcode>{
    // instance variables
    private String  _zip;
    private int _checkDigit;
    
    // constructors
    //precondtion: _zip.length() = 5 and zip contains only digits.
    //postcondition: throws a runtime exception zip is not the correct length
    //               or zip contains a non digit
    //               _zip and _checkDigit are initialized.
    public Barcode(String zip) {
    try{
        Integer.parseint(zip);
    }
    catch(throw new BarcodeException("zip is not the correct length or zip contains a non digit"))
    if (zip.length()!=5 ){
        throw new BarcodeException("zip is not the correct length or zip contains a non digit")
    }
    _zip=zip;
    _checkDigit=checkSum() % 10;
    }

    // postcondition: Creates a copy of a bar code.
    public Barcode clone(){
    return Barcode(_zip);
    }
    
    
    // postcondition: computes and returns the check sum for _zip
    private int checkSum(){
    return Integer.parseint(zip.substring(0,1)) +Integer.parseint(zip.substring(1,2)) + Integer.parseint(zip.substring(2,3)) + Integer.parseint(zip.substring(3,4)) + Integer.parseint(zip.substring(4,5));
    }
    
    //postcondition: format zip + check digit + Barcode 
    //ex. "084518  |||:::|::|::|::|:|:|::::|||::|:|"      
    public String toString(){
    return "y"
    }
    
    
    // postcondition: compares the zip + checkdigit, in numerical order. 
    public int compareTo(Barcode other){

    }
    
}

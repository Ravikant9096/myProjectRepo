// login page(index_ks.html) code area start

var email=document.getElementById("email");
var password=document.getElementById("password");
var captcha=document.getElementById("captcha");

function login(){
if(email.value=="ravikant9096@gmail.com" && password.value==123456)
    {
        if(captcha.value=="qGphJD"){

       
        alert("Welcome : "+email.value);
        location.replace("ksindex.html");
        }  
        else{
            
            document.getElementById("cap").innerText="Please Type correct Captcha";
            location.replace("index_ks.html");
        }  
    }
    else if(email.value=="admin@gmail.com" && password.value=="admin")
    {
        alert("Welcome Admin");
        location.replace("ksindex.html");
    }
    else{
        
        alert(" Login Not Successful \n Email and Password not authorised \n So Try Again\n" +email.value);
        location.replace("index_ks.html");
    }
}

// login page(index_ks.html) code area End



//ksindex.html code start
var MushroomBurger_p=80,CornBurger_p=119,CheeseBurstPizza_p=380,Coffee_p=110,i=0,j=0,k=0,l=0,m=0;

var MushroomBurger1_q=0,CornBurger1_q=0,CheeseBurstPizza1_q=0,Coffee1_q=0,bill_m="",bill_cor="",bill_ch="",bill_cof="";
//for MushroomBurger
    
   
       document.getElementById("MushroomBurger_q").addEventListener("keyup",function(){
            
        while(j<1){
            i=i+1;
            j=j+1;
        }
       
        if(this.value==""||this.value==0){
            i=i-1;
            j=0;
            
            MushroomBurger1_q=0
            bill_m="";
            ShoBill()
        }
        else{
            MushroomBurger1_q=document.getElementById("MushroomBurger_q").value;
        
        bill_m="<tr><td>Mushroom Burger</td><td>"+MushroomBurger_p+"</td><td>"+MushroomBurger1_q+"</td><td>"+MushroomBurger_p+"*"+MushroomBurger1_q+"="+MushroomBurger_p*MushroomBurger1_q+"</td></tr>";
        ShoBill()
    }
        });
//for CornBurger
        document.getElementById("CornBurger_q").addEventListener("click",function(){
            
            while(k<1){
                i=i+1;
                k=k+1;
            }
           
            if(this.value==""||this.value==0){
                i=i-1;
                k=0;
                CornBurger1_q=0
                bill_cor="";
                ShoBill()
            }
            else{
                CornBurger1_q=document.getElementById("CornBurger_q").value;
            
            bill_cor="<tr><td>Corn Burger</td><td>"+CornBurger_p+"</td><td>"+CornBurger1_q+"</td><td>"+CornBurger_p+"*"+CornBurger1_q+"="+CornBurger1_q*CornBurger_p+"</td></tr>";
            ShoBill()
        }
            });
    //for CheeseBurstPizza
    document.getElementById("CheeseBurstPizza_q").addEventListener("click",function(){
        while(l<1){
            i=i+1;
            l=l+1;
        }
       
        if(this.value==""||this.value==0){
            i=i-1;
            l=0;
            CheeseBurstPizza1_q=0
            bill_ch="";
            ShoBill()
        }
        else{
            CheeseBurstPizza1_q=document.getElementById("CheeseBurstPizza_q").value;
        
        bill_ch="<tr><td>Cheese Burst Pizza</td><td>"+CheeseBurstPizza_p+"</td><td>"+CheeseBurstPizza1_q+"</td><td>"+CheeseBurstPizza_p+"*"+CheeseBurstPizza1_q+"="+CheeseBurstPizza1_q*CheeseBurstPizza_p+"</td></tr>";
        ShoBill()
    }
        });

        //for Coofee
    document.getElementById("Coffee_q").addEventListener("click",function(){
        while(m<1){
            i=i+1;
            m=m+1;
        }
        
        if(this.value==""||this.value==0){
            i=i-1;
            m=0;
            bill_cof="";
            Coffee1_q=0
            ShoBill()
            
        }
        else{
            
        Coffee1_q=document.getElementById("Coffee_q").value;
        
        bill_cof="<tr><td>Coffee</td><td>"+Coffee_p+"</td><td>"+Coffee1_q+"</td><td>"+Coffee_p+"*"+Coffee1_q+"="+Coffee1_q*Coffee_p+"</td></tr>";
        ShoBill()
    }
        });

// for show bill;

function ShoBill(){
    // for pay button enable or disable
    const b=MushroomBurger_p*MushroomBurger1_q+CornBurger_p*CornBurger1_q+CheeseBurstPizza_p*CheeseBurstPizza1_q+Coffee_p*Coffee1_q;
     if(b>=1){
         
         document.getElementById("pay_btn1").disabled = false;
         document.getElementById("pay_btn1").innerText="PAY"
     }
     else{
        alert("Payment value 0  \n Add to Cart ");
         document.getElementById("pay_btn1").disabled = true;
         document.getElementById("pay_btn1").innerText="NO PAY"
     }
    
    document.getElementById("billStat").innerHTML=bill_m+bill_cor+bill_ch+bill_cof;
    document.getElementById("amount").innerText=MushroomBurger_p*MushroomBurger1_q+CornBurger_p*CornBurger1_q+CheeseBurstPizza_p*CheeseBurstPizza1_q+Coffee_p*Coffee1_q;
    document.getElementById("cart_value").innerText=i;
    //end for pay button enable or disable.
   
}

//for PAY button
function myPayment(){
    ShoBill()
    const a=MushroomBurger_p*MushroomBurger1_q+CornBurger_p*CornBurger1_q+CheeseBurstPizza_p*CheeseBurstPizza1_q+Coffee_p*Coffee1_q;
    
       
       alert("your Total amount := Rs "+a);
       
      
       document.getElementById("hello").innerText="\n Thank You \n Your Payment "+a+" has been received to us";
    location.replace("ksindex.html?#pay_c");
}

//Search function start
var search=document.getElementById("search");
function search1(){
    document.getElementById("burger1").innerText =""; 
        document.getElementById("pizza").innerText =""; 
        document.getElementById("burger2").innerText ="";
        document.getElementById("coffee").innerText ="";
    if(search.value=="burger"){
         alert("burger");
        document.getElementById("pizza").innerText ="NOT AVAILABLE"; 
        document.getElementById("coffee").innerText ="NOT AVAILABLE";
        location.replace("ksindex.html?#AvilableItem");

    }
    else if(search.value=="pizza"){
        alert("piza");
        document.getElementById("burger1").innerText ="NOT AVAILABLE"; 
        document.getElementById("burger2").innerText ="NOT AVAILABLE";
        document.getElementById("coffee").innerText ="NOT AVAILABLE";

        location.replace("ksindex.html?#AvilableItem");

    }
    else if(search.value=="coffee"){
        alert("coffee");
        document.getElementById("burger1").innerText ="NOT AVAILABLE"; 
        document.getElementById("burger2").innerText ="NOT AVAILABLE";
        document.getElementById("pizza").innerText ="NOT AVAILABLE";

        location.replace("ksindex.html?#AvilableItem");
    }
    else{
        alert("Not Valid Search");
    }

}

// search function end
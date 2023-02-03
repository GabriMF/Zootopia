<script setup></script>
<template>
  <main>
    
    
    <div class="side">
       <img src="../assets/img/PhotoForm.jpg"  width="100%" height="100%" class="__side-img" alt="Photo-form">
      </div>
    <form class="forms">
      


          
            <h1 class="forms__title">FORM NEW ANIMAL</h1>
            <div class="forms__group">
              <input type="text" class="forms__inputbox" placeholder="Name" name="name"/>
              <span class="forms__line"></span>
            </div>
            <div class="forms__group">
              <input type="text" class="forms__inputbox" placeholder="Type" name="name"/>
              <span class="forms__line"></span>
            </div>
              
              
    
            
            <div class="forms__group">
              <input type="text" class="forms__inputbox" placeholder="Family" name="name"/>
              <span class="forms__line"></span>
            </div>
            <div class="forms__group">
              <input type="text" class="forms__inputbox" placeholder="Gender" name="name"/>
                <span class="forms__line"></span>
            </div>
            <div  class="forms__group">
              <input type="text" class="forms__inputbox" placeholder="Date" name="name"/>
              <span class="forms__line"></span>
            </div>
            
            <button type="submit" class="forms__btn" value="send">SEND</button>
          
       
    </form>




          
  
  
           
  
        
  

    </main>
</template>
<style lang="scss" scoped>
@use "@/sass/mixins" as m;
 


main{
 
  // @include m.flex(flex,row,auto,center,center);
  width: 60%;
  height: 40%;
  display: grid;
  grid-template-columns: 1fr 1fr;

  margin: 0 auto;
  .side{
  width:100%;
  height: 100%;
  background-color: red;
  
}

  .forms{
    height:50vh;
    width: 50%;
    padding: 9em;
    display: flex;
    flex-direction: column;
    background-color: pink;
   
   

    &__title{
      font-size:25px;
      margin-bottom: .5em;
      margin-top:3em;      
    }

    &__group{
    position: relative;
    }
     
    &__inputbox{
      
      background: transparent;
      width:100%;
      color: black;
      font-size: 1.1em;
      padding :.8em 3em;
      border:none;
      margin-right: 0;
      outline:none;
      border-bottom: 1px solid #5757577e;
      font-family: 'Courier New', Courier, monospace;
    }
      
    &__btn{
      background: rgb(238, 90, 90);
      border: none;
      font-weight: 300;
      font-size: 1.4rem;
      padding: .2em 0;
      margin:2em;

            
    }
    
&__line{
position: absolute;
bottom: 0;
left: 0;
width: 100%;
height: 1px;
transform: scale(0);
transform: left bottom;

}
} 

}
    

 
     
     
       
        
      
      
            
            
    
            
            
            
                
              
          
      
      
           
          
   
  
  


     

     
  
</style>




   









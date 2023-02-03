<script setup></script>
<template>
  <main>
    
    
    <form class="__forms">
      <div class="__forms__wrapper">
        <!-- <div class="__forms__side">
           <img src="../assets/img/PhotoForm.jpg"  class="__side-img" alt="Photo-form">
          </div> -->
          <div class="__forms-container">
            <h1 class="__forms-container__title">FORM NEW ANIMAL</h1>
            <div class="__forms-container__group">
              <input type="text" class="__forms-container__inputbox" name="name"/>
              <label for="name" class="__forms-container__label" placeholder="">Name</label>
              <span class="__forms-container__line"></span>
            </div>
    
            <div class="__forms-container__group">
              <label for="type" class="__forms-container__label" placeholder=" ">Type</label>
              <input type="text" class="__forms-container__inputbox" name="type"/>
              <span class="__forms-container__line"></span>
            </div>
            
            <div class="__forms-container__group">
              <label for="family" class="__forms-container__label" placeholder="">Family</label>
              <input type="text" class="__forms-container__inputbox" name="family"/>
              <span class="__forms-container__line"></span>
            </div>
            <div class="__forms-container__group">
              <label for="gender" class="__forms-container__label" placeholder="">Gender</label>
                <input type="text" class="__forms-container__inputbox"  name="gender"/>
                <span class="__forms-container__line"></span>
            </div>
            <div  class="__forms-container__group">
              <label for="date" class="__forms-container__label" placeholder="">Date</label>
              <input type="text" class="__forms-container__inputbox" name="date" />
              <span class="__forms-container__line"></span>
            </div>
            
            <button type="submit" class="__forms-container__btn" value="send">SEND</button>
          </div> 
       </div>
    </form>




          
  
  
           
  
        
  

    </main>
</template>
<style lang="scss" scoped>
@use "@/sass/mixins" as m;

main{
  @include m.flex(flex,row,auto,center,center);
  // height:100%;
  //   width: 100%;

  .__forms{
    height:50%;
    width: 50%;
    //  background-color: blue;
    margin: auto;
    max-width: 400px;
    padding: 13em 9em;
    text-align: right;

    &__wrapper{
  display: flex;

    .__forms-container{
      margin-top: 3em;
      display: grid;
      gap: 1.2em;
      // border: 2px solid black;
      // background-color: pink;
  
      &__title{
        // background-color: white;
        font-size:25px;
        margin-bottom: .5em;
        
      }

      &__group{
        // background-color: orange;
        position: relative;
      }

      &__inputbox{
  
        background: none;
        width:100%;
        color: #5757577e;
        font-size: 1rem;
        padding: .6em .3em;
        // border: ;
        margin-right: 15px;
        outline:none;
        border-bottom: 1px solid #5757577e;
        font-family: 'Courier New', Courier, monospace;
        
        &:focus {
          //transform: translateY(-12px) scale(.7);//mirar esto
          // transform-origin: left top;
          padding-left: 10px;
          color:green
        }

       /*  &:focus + .__forms-container__label{
          transform: translateY(-12px) scale(.7);//mirar esto
          transform-origin: left top;
          color:green
        } */
      }


      &__label{
        
        cursor: pointer;
        position: absolute;
        top: 0;
        left: 5px;
        transform: translateY(10px);
        transition: transform .5s #5757577e .3s;
        color: red;

        
      }

      &__btn{
        background: white;
        border: none;
        font-weight: 300;
        font-size: 1.4rem;
        padding: .2em 0;
        


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
}
  
}
</style>




   









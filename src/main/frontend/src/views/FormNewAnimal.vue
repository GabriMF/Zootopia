<script setup></script>
<template>
 
    
  

      <form class="form">
        <div class="__form-side">
           <img src="../assets/img/PhotoForm.jpg" alt="Photo-form">
        </div>
        <div class="__form-container">

        
        <h1 class="title">FORM NEW ANIMAL</h1>

        <div class="__form-group">
          <label for="name" class="__container-forms__label" placeholder="">Name</label>
          <input type="text" class="__container-forms__label__inputbox" name="name"/>
          <span class="form__line"></span>
        </div>

        <div class="__form-group">
          <label for="type" class="__container-forms__label" placeholder=" ">Type</label>
          <input type="text" class="__container-forms__label_inputbox" name="type"/>
          <span class="form__line"></span>
        </div>

        <div class="__form-group">
          <label for="family" class="__container-forms__label" placeholder="">Family</label>
          <input type="text" class="__container-forms__label_inputbox" name="family"/>
          <span class="form__line"></span>
        </div>

        <div class="__form-group">
          <label for="gender" class="__container-forms__label" placeholder="">Gender</label>
            <input type="text" class="__container-forms__label_inputbox"  name="gender"/>
            <span class="form__line"></span>
        </div>
         

        <div  class="__form-group">
          <label for="date" class="__container-forms__label" placeholder="">Date</label>
          <input type="text" class="__container-forms__label_inputbox" name="date" />
          <span class="form__line"></span>
        </div>
      
        <button type="submit" class="btn__form" value="SEND">SEND</button>

        
    </div>
    </form>

</template>
<style lang="scss" scoped></style>

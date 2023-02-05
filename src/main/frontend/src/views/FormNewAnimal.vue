<script setup>
import {Field , Form,ErrorMessage} from 'vee-validate';
// export default{
//   components:{
//     Form,
//     Field,
//   },
  // methods:{
   function onSubmit(values){
      console.log(values,null,2);
        }
   function validateForm(value){
    //si el campo esta vacio 
    if(!value){
      return ' This field is required';
    }
    return true;
   }


</script>



<template>
  <div class="main">
    <Form @submit="onSubmit" class="form__wrapper">
      <div class="form__img">
        <img src="../assets/img/img-form.jpg" alt="photo-form" />
      </div>
      <div class="form__container">
        <div class="form__title">
          <h1>NEW FORM ANIMAL</h1>
        </div>
        <div class="form__fields">
          <div class="form__group">
            <Field type="text" class="form__input" placeholder="Name" name="name" :rules="validateForm"/>
            <ErrorMessage name="name" />
            <span class="form__line"></span>
          </div>
          <div class="form__group">
            <Field type="text" class="form__input" placeholder="Type" name="type"/>
            <span class="form__line"></span>
          </div>
          <div class="form__group">
            <Field type="text" class="form__input" placeholder="Family" name="family"/>
            <span class="form__line"></span>
          </div>
          <div class="form__group">
            <Field type="text" class="form__input" placeholder="Gender" name="gender"/>
            <span class="form__line"></span>
          </div>
          <div class="form__group">
            <Field type="text" class="form__input" placeholder="Date" name="Date"/>
            <span class="form__line"></span>
          </div>
        </div>
        <button type="submit" class="form_btn" value="send">SEND</button>
      </div>
    </Form>
  </div>
</template>

<style lang="scss" scoped>
@use "@/sass/mixins" as m;

.main{
  @include m.flex(grid,auto,auto,center,center);
  width: 100%;
  height: 100%;
  // grid-template-columns: 1fr 1fr;
  background-color: blue;

  .form__wrapper{
    display: flex;
    background-color: red;
    justify-content: center;
    align-items: flex-start;
    border-style: solid;
    .form__img{
      background-color: bisque;

    
    }


    .form__container{
      background-color: aqua;
      display: flex;
      flex-direction: column;
      gap: 4px;
     
      
      .form__title{
        font-size: 12px;
        display: flex;
        justify-content: flex-end;

      }

    }


  }
  


  





}






</style>

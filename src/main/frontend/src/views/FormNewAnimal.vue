<script setup>
import HeadPage from '../components/HeadPage.vue';
import Nav from '../components/Nav.vue';
import FootPage from '../components/FootPage.vue';
import {Field , Form,ErrorMessage} from 'vee-validate';
import {ref} from 'vue'

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

   // method Post

   let nameM = ref("");
   let typeM = ref("");
   let familyM = ref("");
   let genderM = ref("");
   let dateM = ref ("");
   let countryM = ref("");

   const postData = async () =>{
    const res = await axios.post("http://localhost:8080/api/animals/",
    
      {
        name: nameM.value,
        type: typeM.value,
        family: familyM.value,
        gender: genderM.value,
        country: countryM.value

      })

      .then(res =>console.log(res));
    
   };


</script>



<template>
  <HeadPage/>
  <Nav/>
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
            <Field type="text" class="form__input" placeholder="Name" name="name"  v-model="nameM" :rules="validateForm"/>
            <ErrorMessage id="error" name="name" />
            <span class="form__line"></span>
          </div>
          <div class="form__group">
            <Field type="text" class="form__input" placeholder="Type" v-model="typeM" name="type"/>
            <span class="form__line"></span>
          </div>
          <div class="form__group">
            <Field type="text" class="form__input" placeholder="Family" v-model="familyM" name="family"/>
            <span class="form__line"></span>
          </div>
          <div class="form__group">
            <Field type="text" class="form__input" placeholder="Gender" v-model="genderM" name="gender"/>
            <span class="form__line"></span>
          </div>
          <div class="form__group">
            <Field type="text" class="form__input" placeholder="Date" v-model="dateM" name="Date"/>
            <span class="form__line"></span>
          </div>

          <div class="form__group">
            <Field type="text" class="form__input" placeholder="Country" v-model="countryM" name="country"/>
            <span class="form__line"></span>
          </div>
        </div>
        <button type="submit" class="form_btn" value="send">SEND</button>
      </div>
    </Form>
  </div>
  <FootPage/>
</template>

<style lang="scss" scoped>
@use "@/sass/mixins" as m;

.main{
  @include m.flex(grid,auto,auto,center,center);
  width: 80vw;
  height: 90vh;
  float: right;
  // margin-right: 10vw;
  // grid-template-columns: 1fr 1fr;
  // background-color: blue;

  .form__wrapper{
    display: flex;
    //  background-color: red;
     justify-content: center;
     align-items: flex-start;
     border-style: solid;
     width: auto;
     height: 0 auto;
     overflow: hidden;
    //  height: auto;
     .form__img{
      //  background-color: bisque;
      display: flex;
      align-items: center;
      height: 80vh;
      margin-top: 20vh;
       img{
         height:auto;
       }
       
      }
      .form__container{
        // background-color: aqua;
        display: flex;
        flex-direction: column;
        gap: 4px;
        width: 50%;
        height: 70%;
 
 
        
        
        .form__title{
          font-size: 12px;
          display: flex;
          justify-content: center;
          margin-top: 4rem;
  
          h1{
            color:black;
            display: flex;
          }
        }

        .form__fields{
          display: flex;
          flex-direction: column;
          justify-content: center;
          align-items: center;
          // background-color: yellow;
           

          #error{
            color:red;
            font-size: 1em;
          }

          .form__group{
            position: relative;
            
          }

          .form__input{
            background: transparent;
            font-size: 1.3em;
            border: none;
            margin: 0.5em 2rem;
            outline: none;
            padding: 0.9em 3em;
            border-bottom: 1px solid #5757577e;
            color: black;
            font-family: "Courier New", Courier, monospace;
          }

        }

        .form_btn{
          display: flex;
          justify-content: center;
          background: rgb(238, 90, 90);
          border: none;
          font-weight: 300;
          font-size: 1.4rem;
          margin:1.3em 2em;
          padding: 0.9em;

          
        }
    }
  }
}
</style>

    
  
  
  
  
  
      
       

      



  


  






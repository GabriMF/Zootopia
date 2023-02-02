<script setup></script>
<template>
  <div class="wrapper">
    <div class="wrapper-side">
      <img src="" alt="" />
    </div>
    <div>
      <form class="form">
        <h1 class="title">FORM NEW ANIMAL</h1>

        <div class="__form-group">
          <label for="name" class="__container-forms__label">Name</label>
          <input type="text" class="__container-forms__label__inputbox" name="name"/>
        </div>

        <div class="__form-group">
          <label for="type" class="__container-forms__label">Type</label>
          <input type="text" class="__container-forms__label_inputbox" name="type"/>
        </div>

        <div class="__form-group">
          <label for="family" class="__container-forms__label">Family</label>
          <input type="text" class="__container-forms__label_inputbox" name="family"/>
        </div>

        <div class="__form-group">
          <label for="gender" class="__container-forms__label">Gender</label>
            <input type="text" class="__container-forms__label_inputbox"  name="gender"/>
        </div>
         

        <div>
          <label for="date" class="__container-forms__label">Date</label>
          <input type="text"   class="__container-forms__label_inputbox" name="date" />
        </div>
      
    </form>
    </div>
  </div>
</template>
<style lang="scss" scoped></style>

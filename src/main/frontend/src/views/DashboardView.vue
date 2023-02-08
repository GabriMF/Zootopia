<script setup>
import FootPage from '../components/FootPage.vue';
import HeadPage from '../components/HeadPage.vue';
import Nav from '../components/Nav.vue';
import AnimalCard from '../components/AnimalCard.vue';
// public void renderCard(){
//   i=AnimalCard;
//   for(i=0, i<=9, i++);
// }
</script>

<template>
  <HeadPage />
  <Nav/>
  <div id="animalCardSection">
    <AnimalCard/>
    <AnimalCard/>
    <AnimalCard/>
    <AnimalCard/>
    <AnimalCard/>
    <AnimalCard/>
    <AnimalCard/>
  </div>
  <FootPage />
</template>

<style>
  #animalCardSection{
    display: flex;
    justify-content: space-between;
    max-width: 80vw;
  }
</style>

<script setup>
import FootPage from '../components/FootPage.vue';
import HeadPage from '../components/HeadPage.vue';
import Nav from '../components/Nav.vue';
import AnimalCard from '../components/AnimalCard.vue';
import FormNewAnimal from './FormNewAnimal.vue';
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
  </div>
  <FootPage />
</template>

<style>
  #animalCardSection{
    display: grid;
    grid-template-columns: 1fr 1fr 1fr;
    max-width: 80vw;
    height: 90vh;
  }
</style>

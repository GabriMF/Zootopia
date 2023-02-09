<script setup>
import { onMounted, ref } from 'vue';
import FootPage from '../components/FootPage.vue';
import HeadPage from '../components/HeadPage.vue';
import Nav from '../components/Nav.vue';
import AnimalCard from '../components/AnimalCard.vue';
import FormNewAnimal from './FormNewAnimal.vue';
import axios from "axios";

let animals = ref([]);
onMounted(() => {
  axios
    .get("http://localhost:8080/api/animals")
    .then((response) => (animals.value = response.data));
});
console.log(animals)


const losiento =()=>{
  alert("No funciono")
}
</script>

<template>
  <HeadPage />
  <Nav/>
  <div id="animalCardSection">
    <AnimalCard v-for="animal in animals" :animal="animal" />
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

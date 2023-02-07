<script setup>
// import { RouterLink, RouterView } from 'vue-router'
import LandingView from './views/LandingView.vue';
import DashBoardView from './views/DashBoardView.vue';
import AnimalCard from '../src/components/AnimalCard.vue';
</script>

<template>
<!-- <RouterView /> -->
<DashBoardView />
<LandingView/>
<AnimalCard/>
</template>

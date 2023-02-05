<template>
  <v-app>
    <v-main>
        <LandingView/>
        <HomeView/>
    </v-main>
  </v-app>
</template>

<script>
export default {
    name: "App",
    data: () => ({
    //
    }),
    components: { HomeView }
}
import HomeView from './views/HomeView.vue';
import HomeView from './views/HomeView.vue';
import LandingView from './views/LandingView.vue'
</script>

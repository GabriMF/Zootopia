<script setup>

</script>

<template>
    <header class="header">
        <img class="header__logo" src="@/assets/images/logo.png" alt="logo">
    </header>
</template>

<style lang="scss" scoped>
    @use "@/sass/colors" as c;
    @use "@/sass/mixins" as m;

    .header{
        @include m.flex(flex, auto, nowrap, center, center);
	    background: map-get(c.$colors, "light-pink");
        height: 5em;

        &__logo{
            width: 15%;
            height: 100%;
        }
    }
</style>
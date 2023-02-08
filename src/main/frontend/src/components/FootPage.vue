<script setup>

</script>
<template>
<footer class="footer">
    <img class="footer__logo" src="@/assets/images/logo.png" alt="logo">
    <div class="footer__container-social-media">
        <a href="https://www.linkedin.com/in/enol-igareta/" target="_blank"><i class="fa-brands fa-linkedin icon-media"></i></a> 
        <a href="https://github.com/EnolCode" target="_blank"><i class="fa-brands fa-github icon-media"></i></a> 
        <a href="https://github.com/EnolCode" target="_blank"><i class="fa-brands fa-twitter icon-media"></i></a> 
    </div>
</footer>
</template>

<style lang="scss" scoped>
@use "@/sass/colors" as c;
@use "@/sass/mixins" as m;

.footer{
    @include m.flex(flex, auto, nowrap, space-between, center);
    background: map-get(c.$colors, "light-pink");
    height: 5em;
    width: 100%;
    // position: absolute;
    margin-top: 3vh;
    bottom:0;
    padding: 0 2em;

    &__logo{
        width: 10%;
        height: 50%;
    }
    &__container-social-media {
	    @include m.flex(flex, auto, nowrap, space-around, center);
        width: 10%;
        @include m.mv(1000px){
           width: 30%;
        }
        @include m.mv(650px){
            width: 40%;
         }
         @include m.mv(590px){
            width: 80%;
         }
		.icon-media {
			font-size: 1.7rem;
			cursor: pointer;
			&:hover {
				opacity: 0.5;
			}
		}
	}
}
</style>
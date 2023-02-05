<script>

</script>

<template>
    <section id="landingPicSection">
        <img id="landingPic" src="../assets/images/Zootopia_pic_adapted.jpg" alt="zootopiaLandingPic">
    </section>
    <section id="logIn">
        <v-form ref="form">
            <v-text-field
                v-model="name"
                label="Name"
                required
            ></v-text-field>
        </v-form>
    </section>
</template>

<style>
    #landingPicSection{
        float: left;
        width: 54vw;
    }
    #landingPic{
        height: 100vh;
        width: 50vw;
    }

    #logIn{
        float: right;
        width: 44vw;
    }
</style>

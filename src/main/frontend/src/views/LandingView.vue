<script setup>
import DashBoardView from './DashBoardView.vue';
// function startUp(){
//     document.getElementById("submitButton") = false;
// }
// const submitButton = document.getElementById('submitButton');
// submitButton.disabled=true;
// function checkInput(){
//     if(document.getElementById("userNameInput") && document.getElementById("passwordInput")!= null){
//         submitButton.disabled=false
//     }
// }
</script>

<template>
    <section id="logIn">
        <img id="landingPic" src="../assets/images/Zootopia_pic_adapted.jpg" alt="zootopiaLandingPic">
        <div id="form">
            <h1 id="logInHeader">Log In</h1>
            <FormKit
            id="userNameInput"
            type="text"
            name="your_name"
            placeholder="Name"
            validation="required|length:3"
            />
            <FormKit
                id="passwordInput"
                type="password"
                name="your_password"
                placeholder="Password"
                validation="required"
            />
            <router-link to="/home">
                <FormKit
                    id="submitButton"
                    type="form"
                    label="submit"
                />
            </router-link>
        </div>
    </section>
</template>

<style>
    #landingPic{
        float: left;
        height: 100vh;
        width: 50vw;
    }

    #logIn{
        display: flex;
    }

    #form{
        display: flex;
        flex-direction: column;
        font-size: xx-large;
        font-family: Cambria, Cochin, Georgia, Times, 'Times New Roman', serif;
        align-items: center;
        margin: auto;
    }

    #logInHeader{
        font-size: xxx-large;
        font-weight: bolder;
        margin-bottom: 10vh;
        margin-right: 23vw;
    }

    #userNameInput{
        margin-top: 2vh;
        margin-bottom: 2vh;
    }

    .validation{
        font-size: medium;
    }

    #passwordInput{
        margin-top: 2vh;
        margin-bottom: 2vh;
    }

    #submitButton{
        display: flex;
        text-align: center;
        justify-content: center;
        background-color: black;
        color: white;
        border-radius: 1vw;
        margin-top: 2vh;
        width: 15vw;
        height: 6vh;
    }

    #userNameInput-rule_length{
        color: red;
        font-size: medium;
    }
    #userNameInput-rule_required{
        color: red;
        font-size: medium;
    }

    #passwordInput-rule_required{
        color: red;
        font-size: medium;
    }
</style>
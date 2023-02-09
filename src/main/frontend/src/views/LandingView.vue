<script setup>
import DashBoardView from './DashBoardView.vue';

</script>

<template>
    <section id="logIn">
        <div id="landingPicLittle"></div>
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

<style lang="css">
    @media (max-width: 767px) {
        #logIn{
            display: flex;
            flex-direction: column;
        }

        #landingPicLittle{
            background-image: url('../assets/images/Logo_Zootopia 2.png');
            background-repeat: no-repeat;
            height: 10vh;
            width: 50vw;
            margin: auto;
            margin-top: 5vh;
        }

        #landingPic{
            height: 0vh;
            width: 0vw;
        }

        #form{
            display: flex;
            flex-direction: column;
            height: 80vh;
            width: 100vw;
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
            height: 10vh;
            width: 80vw;
            margin-top: 2vh;
            margin-bottom: 2vh;
        }

        .validation{
            font-size: medium;
        }

        #passwordInput{
            height: 10vh;
            width: 80vw;
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
            width: 80vw;
            height: 8vh;
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
    }

    @media (min-width: 768px) {
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
    }
    
</style>
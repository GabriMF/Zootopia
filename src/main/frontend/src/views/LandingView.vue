<script>

</script>

<template>
    <section id="logIn">
        <img id="landingPic" src="../assets/images/Zootopia_pic_adapted.jpg" alt="zootopiaLandingPic">
        <div id="form">
            <h1>Log In</h1>
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
            <FormKit
                id="submitButton"
                type="form"
                label="submit"
            />
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
        font-family: Arial, Helvetica, sans-serif;
        align-items: center;
        margin: auto;
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
        margin-top: 2vh;
        background-color: black;
        width: 15vw;
        height: 6vh;
    }
</style>
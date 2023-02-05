<script setup>

</script>

<template>
    <div id="row">
        <div>
            <div id="cardTemplate">
                <div id="cardImage">
                    <img id="picCard" src="../assets/images/Zootopia_pic.jpg">
                </div>
                <div id="animalBreedBox">
                    <span id="animalBreed">Felinos</span>
                </div>
                <div id="cardContent">
                    <p>Miau miau miau miau miau, miau miau miau miau miau, miau miau, miau miau miau. Miau miau miau miau miau, miau miau miau miau miau, miau miau, miau miau miau. Miau miau miau miau miau, miau miau miau miau miau, miau miau, miau miau miau. Miau miau miau miau miau, miau miau miau miau miau, miau miau, miau miau miau. Miau miau miau miau miau, miau miau miau miau miau, miau miau, miau miau miau, MF.</p>
                </div>
                <div id="cardActions">
                    <div id="openButton">
                        <a href="#">Open</a>
                    </div>
                    <!-- <div id="actionButtons">
                        <div id="editButton">
                            <a href=""><img src="../assets/images/Edit_Icon.PNG" alt="Edit"></a>
                        </div>
                        <div id="deleteButton">
                            <a href=""><img src="../assets/images/Delete_Icon.PNG" alt="Delete"></a>
                        </div>
                    </div> -->
                </div>
            </div>
        </div>
    </div>
</template>

<style>
#row{
    /* border-color: black;
    border-width: 10vw; */
    background-color: rgb(176, 212, 200);
    display: flex;
    align-items: center;
    justify-content: center;
    text-align: center;
    margin: auto;
    max-width: 40vw;
    margin-top: 5vh;
}

#cardImage{
    display: flex;
    justify-content: center;
}

#picCard{
    border-radius: 100%;
    max-height: 40vh;
    max-width: 20vw;
    margin-top: 2vh;
}

#animalBreed{
    font-size: xx-large;
}

#cardActions{
    display: flex;
    justify-content: center;
    margin-bottom: 2vh;
}

#cardContent{
    margin-right: 2vw;
    margin-left: 2vw;
    margin-bottom: 2vh;
}

#openButton{
    display: flex;
    justify-content: center;
    align-items: center;
    font-size: larger;
    width: 30vw;
    height: 6vh;
    background-color: rgb(241, 146, 146);
}

#actionButtons{
    display: flex;
    flex-direction: row;
    justify-content: space-around;
    width: 30vw;
}

#editButton{
    height: 8vh;
    width: 8vh;
}

#deleteButton{
    height: 8vh;
    width: 8vh;
}
</style>


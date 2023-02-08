<script setup>

</script>

<template>
    <section id="sectionCard">
        <div id="row">
            <div>
                <div id="cardImage">
                    <img id="picCard" src="../assets/images/Zootopia_pic.jpg">
                </div>
                <div id="cardTemplate">
                    <div id="animalBreedBox">
                        <span id="animalBreed">Felinos</span>
                    </div>
                    <div id="cardContent">
                        <div id="nameBox">
                            <h2 class="BoxLabel">
                                Name
                            </h2>
                            <div id="animalName">
                                vdfv
                            </div>
                        </div>
                        <div id="typeBox">
                            <h2 class="BoxLabel">
                                Type
                            </h2>
                            <div id="animalName">
                                fvdvf
                            </div>
                        </div>
                        <div id="genderBox">
                            <h2 class="BoxLabel">
                                Gender
                            </h2>
                            <div id="animalName">
                                vfdfd
                            </div>
                        </div>
                        <div id="countryBox">
                            <h2 class="BoxLabel">
                                Country
                            </h2>
                            <div id="animalName">
                                fdvfvdfvf
                            </div>
                        </div>
                        <div id="dateBox">
                            <h2 class="BoxLabel">
                                Date
                            </h2>
                            <div id="animalName">
                                fvdfvfdv
                            </div>
                        </div>
                    </div>
                    <div id="cardActions">
                        <!-- <div id="openButton">
                            <a href="#">Open</a>
                        </div> -->
                        <div id="actionButtons">
                            <div id="editButton">
                                <a href=""><img src="../assets/images/Edit_Icon.PNG" alt="Edit"></a>
                            </div>
                            <div id="deleteButton">
                                <a href=""><img src="../assets/images/Delete_Icon.PNG" alt="Delete"></a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
</template>

<style>
#sectionCard{
    display: flex;
    height: 50vh;
}

/* #animalCardSection{ */
    /* display: grid;
    grid-template-columns: 1fr 1fr 1fr;
    width: 80vw; */
    /* flex-direction: row; */
    /* justify-content: flex-start; */
    /* height: 100vh; */
    /* width: 80vw; */
    /* margin-left: 10vw; */
/* } */

#row{
    /* border-color: black;
    border-width: 10vw; */
    background-color: rgb(176, 212, 200);
    display: flex;
    align-items: center;
    justify-content: center;
    text-align: center;
    margin: auto;
    max-width: 25vw;
    max-height: 50vh;
    margin-top: 5vh;
}

#cardTemplate{
    max-width: 40vw;
    max-height: 40vh;
}

#cardImage{
    display: flex;
    justify-content: center;
}

#picCard{
    border-radius: 100%;
    max-height: 15vh;
    max-width: 8vw;
    margin-top: 2vh;
}

.BoxLabel{
    font-weight: bolder;
}

#animalBreed{
    font-size: 2.5vw;
    max-width: 10vw;
}

#cardActions{
    display: flex;
    justify-content: center;
    margin-bottom: 2vh;
}

#cardContent{
    display: flex;
    flex-direction: row;
    justify-content: space-between;
    max-width: 22vw;
    margin: auto;
    margin-bottom: 2vh;
}

/* #openButton{
    display: flex;
    justify-content: center;
    align-items: center;
    font-size: larger;
    width: 30vw;
    height: 6vh;
    background-color: rgb(241, 146, 146);
} */

#actionButtons{
    display: flex;
    flex-direction: row;
    justify-content: space-around;
    width: 30vw;
}

#editButton{
    height: 5vh;
    width: 5vh;
}

#deleteButton{
    height: 5vh;
    width: 5vh;
}
</style>


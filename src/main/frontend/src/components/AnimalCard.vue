<script setup>

const props = defineProps({
		animal: {
			type: Object,
			default: null,
		}
	});

    const losiento =()=>{
  alert("No funciono")
}
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
                                {{ animal.name }}
                            </div>
                        </div>
                        <div id="typeBox">
                            <h2 class="BoxLabel">
                                Type
                            </h2>
                            <div id="animalName">
                                PowerRanger
                            </div>
                        </div>
                        <div id="genderBox">
                            <h2 class="BoxLabel">
                                Gender
                            </h2>
                            <div id="animalName">
                                ?
                            </div>
                        </div>
                        <div id="countryBox">
                            <h2 class="BoxLabel">
                                Country
                            </h2>
                            <div id="animalName">
                                Cataluña
                            </div>
                        </div>
                        <div id="dateBox">
                            <h2 class="BoxLabel">
                                Date
                            </h2>
                            <div id="animalName">
                                {{ animal.date  }}
                            </div>
                        </div>
                    </div>
                    <div id="cardActions">
                        <div id="actionButtons">
                            <div id="editButton" @click="losiento">
                                <i class="fa-solid fa-trash"></i>
                            </div>
                            <div id="deleteButton">
                                <i class="fa-solid fa-pencil"></i>
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
    height: 30vh;
}

#row{
    background-color: rgb(176, 212, 200);
    display: flex;
    align-items: center;
    justify-content: center;
    text-align: center;
    margin: auto;
    max-width: 25vw;
    max-height: 50vh;
    margin-top: 5vh;
    border: 2px solid black;
    border-radius: 10px;
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
    border-radius: 5px;
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

.fa-solid{
    font-size: 1.5em;
}
</style>
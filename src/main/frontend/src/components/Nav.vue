<script >

</script>

<template>
    <div id="nav">
        <select class="filterFamily" name="FILTER FAMILY" required>
            <option value="" disabled selected hidden>FILTER FAMILY</option>
            <option value="felidos">Felidos</option>
            <option value="leporidae">Leporidae</option>
            <option value="reptiles">Reptiles</option>
            <option value="mustelids">Mustelids</option>
            <option value="canidos">Canidos</option>
        </select>
    
        <select class="filterCountry" name="FILTER COUNTRY" required>
            <option value="" disabled selected hidden>FILTER COUNTRY</option>
            <option value="angola">Angola</option>
            <option value="españa">España</option>
            <option value="australia">Australia</option>
            <option value="kenia">Kenia</option>
            <option value="ghana">Ghana</option>
        </select>

        <!-- <div class="conteinerButton"> -->
            <button id="homeButton"><i class="fa-solid fa-house homeButtonImg"></i><router-link to="/home">HOME</router-link></button>
            <button id="addButton"><i class="fa-solid fa-user-plus addButtonImg"></i> <router-link to="/addanimal">ADD +</router-link></button>
        <!-- </div> -->
    </div>
</template>
 
<style lang = "scss" scoped>
@media(max-width: 767px){
    #nav {
        display: grid;
        // flex-direction: row;
        grid-template-columns: 1fr 1fr;
        height: 30vh;
        width: 100vw;
        background-color: #FDBBAC;
    }

    .filterFamily {
        height: 10vh;
        width: 50vw;
        border-bottom: 1px solid black;
        margin-left: 2vw;
    }

    .filterCountry {
        height: 10vh;
        width: 50vw;
        border-bottom: 1px solid black;
    }

    button {
        display: flex; 
        justify-content: space-between; 
        margin-right: 20vw; 
    }
    .conteinerButton {
        display: flex;
        flex-direction: row;
        justify-content: space-between;
        width: 100vw;
        margin-top: 3vh;
        margin-left: 1em;
    }

    // .homeButtonImg {
    //     margin-right: 1em;
    // }

    // .addButtonImg {
    //     margin-right: 1em; 
    // }
}

@media(min-width: 768px){
    #nav {
        float: left;
        height: 100vh;
        width: 15%;
        background-color: #FDBBAC;
    }

    .filterFamily {
        padding: 15px;
        border-bottom: 1px solid black;
    }

    .filterCountry {
        padding: 15px;
        border-bottom: 1px solid black;
    }

    button {
        border-radius: 10px;
        margin: 20px;
        display: flex;   
    }
    .conteinerButton {
    margin-top: 12em;
    margin-left: 1em;
    }

    .homeButtonImg {
        margin-right: 1em;
    }

    .addButtonImg {
        margin-right: 1em; 
    }
}

</style>
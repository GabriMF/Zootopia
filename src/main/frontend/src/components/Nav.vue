<script>
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

        <div class="conteinerButton">
            <button><i class="fa-solid fa-house homeButtonImg"></i>HOME</button>
            <button><i class="fa-solid fa-user-plus addButtonImg"></i>ADD +</button>
        </div>
    </div>
</template>
 
<style lang = "scss" scoped>

#nav {
    height: 81vh;
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
    
}
.conteinerButton {
margin-top: 15em;

}

.homeButtonImg {
    margin-right: 1em;
  
}

.addButtonImg {
    margin-right: 1em;
    
}
</style>
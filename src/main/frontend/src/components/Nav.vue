<script>
</script>

<template>
    <div id="nav">
        <div>
            <p>FILTER FAMILY<input type="text"></p>
            <p>FILTER COUNTRY<input type="text"></p>
        </div>
        <div>
            <button>HOME</button>
            <button>ADD +</button>
        </div>
    </div>
</template>
 
<style lang = "scss" scoped>

#nav {
    height: 100vh;
    width: 25%;
    background-color: #FDBBAC;
}

p {
    padding: 25px;
    font-family: 'Franklin Gothic Medium', 'Arial Narrow', Arial, sans-serif;
}

input {
    width: 80%;
    background-color: white;
    border-radius: 10px;
    margin: 40px;

}

button {
    border-radius: 10px;
    margin: 20px;
    // border: red 2px solid;
}
</style>
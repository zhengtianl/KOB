<template>
  <div>
    <div>bot name:{{bot_name}}</div>
    <div> bot number:{{bot_rating}}</div>
  </div>
  <router-view/>
</template>

<script>
import { ref } from "vue";
import axios from "axios";

export default {
  name: "App",
  setup: () => {
    let bot_name = ref("");
    let bot_rating = ref("");
    
    axios.get("http://localhost:3000/pk/getbotinfo/")
      .then((response) => {
        console.log(response.data);
        bot_name.value = response.data.name;
        bot_rating.value = response.data.rating;
      })
      .catch((error) => {
        console.error(error);
      });


    return {
      bot_name,
      bot_rating,
    };
  },
};




</script>

<style>

</style>

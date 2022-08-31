<template>

<v-data-table
    :headers="headers"
    :items="주문"
    :items-per-page="5"
    class="elevation-1"
  ></v-data-table>

</template>

<script>
  const axios = require('axios').default;

  export default {
    name: '주문',
    props: {
      value: Object,
      editMode: Boolean,
      isNew: Boolean
    },
    data: () => ({
        headers: [
            { text: "id", value: "id" },
        ],
        주문 : [],
    }),
    async created() {
      var temp = await axios.get(axios.backend + '/주문s')

      this.주문 = temp.data._embedded.주문s;

    },
    methods: {
    }
  }
</script>


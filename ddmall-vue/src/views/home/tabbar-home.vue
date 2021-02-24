<template>
  <div>
    <div ref="one" @click="handleClick" @change="handleChange">
      {{ number }}
    </div>
    <div ref="tow" @click="handleClick" @change="handleChange">
      {{ number }}
    </div>
    <div>{{ total }}</div>
  </div>
</template>

<script>
export default {
  name: "TabbarHome",
  data: function () {
    return {
      number: 0,
      total: 0,
    };
  },
  methods: {
    handleClick: function () {
      this.number++;
      this.$emit("change");
    },
    handleChange: function () {
      this.total = this.$refs.one.number + thisj.$refs.tow.number;
    },
  },
};
</script>
<style>
</style>

<template>
    <van-nav-bar
      :title="title"
      left-text="返回"
      left-arrow
      @click-left="goBack"
      v-show="showHeader"
    />
</template>

<script>
import { NavBar } from "vant";

export default {
  name: "v-header",
  data() {
    return {
      title: "",
    };
  },
  components: {
    [NavBar.name]: NavBar,
  },
  computed: {
    showHeader: function () {
      let header = this.$store.getters.showHeader;
      this.title = this.$store.getters.titleHeader;
      return header
    },
  },
  methods: {
    goBack() {
      this.$router.back(-1);
    },
  },
};
</script>

<style>
</style>
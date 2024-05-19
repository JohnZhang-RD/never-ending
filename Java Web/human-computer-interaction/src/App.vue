<script lang="ts" setup>
import { ref } from 'vue'

const activeIndex = ref('1')
const handleSelect = (key: string, keyPath: string[]) => {
  console.log(key, keyPath)
}
</script>

<template>
  <el-container>
    <el-header>
      <el-menu
          :default-active="activeIndex"
          class="el-menu-demo"
          mode="horizontal"
          :ellipsis="false"
          background-color="#545c64"
          text-color="#fff"
          active-text-color="#ffd04b"
          @select="handleSelect"
          menu-trigger="click"
          :unique-opened="true"
          :close-on-click-outside="true"
      >
        <el-sub-menu index="1">
          <template #title>File</template>
        </el-sub-menu>
        <el-sub-menu index="2">
          <template #title>Edit</template>
          <el-menu-item index="2-1">item one</el-menu-item>
          <el-menu-item index="2-2">item two</el-menu-item>
          <el-menu-item index="2-3">item three</el-menu-item>
          <el-sub-menu index="2-4">
            <template #title>item four</template>
            <el-menu-item index="2-4-1">item one</el-menu-item>
            <el-menu-item index="2-4-2">item two</el-menu-item>
            <el-menu-item index="2-4-3">item three</el-menu-item>
          </el-sub-menu>
        </el-sub-menu>
        <el-sub-menu index="3">
          <template #title>View</template>
        </el-sub-menu>
        <el-sub-menu index="4">
          <template #title>Format</template>
        </el-sub-menu>
        <el-sub-menu index="5">
          <template #title>Insert</template>
        </el-sub-menu>
        <el-sub-menu index="6">
          <template #title>Tools</template>
        </el-sub-menu>
        <el-sub-menu index="7">
          <template #title>Mail</template>
        </el-sub-menu>
        <el-sub-menu index="8">
          <template #title>Help</template>
        </el-sub-menu>
        <el-sub-menu index="9">
          <template #title>Options</template>
        </el-sub-menu>
      </el-menu>
    </el-header>
    <el-main>

    </el-main>
    <el-footer>

    </el-footer>
  </el-container>
</template>


<style scoped>
  .el-container {
    margin: 10px;
    height: 100vh;
    background: azure;
    width: 1000px;
  }
  .el-header {
    width: 1000px;
    padding: 0;
    height: 30px;
    .el-menu-demo {
      height: 30px;
      font-family: "Arial Narrow";
    }
  }
  .el-main {
    align-items: stretch;
  }
  .el-footer {
    height: 20px;
    width: 1000px;
    background: #181818;
  }
</style>

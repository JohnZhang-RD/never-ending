<script lang="ts" setup>
import { ref } from 'vue'

const activeIndex = ref('1')
const handleSelect = (key: string, keyPath: string[]) => {
  console.log(key, keyPath)
}
const textarea = ref('')
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
          <el-menu-item index="1-1">New</el-menu-item>
          <el-sub-menu index="1-2">
            <template #title>Open</template>
            <el-menu-item index="1-2-1">Open Copy</el-menu-item>
            <el-menu-item index="1-2-2">Open Mail</el-menu-item>
          </el-sub-menu>
          <el-sub-menu index="1-3">
            <template #title>Save</template>
            <el-menu-item index="1-3-1">Save As</el-menu-item>
          </el-sub-menu>
          <el-menu-item index="1-4">Close</el-menu-item>
          <el-menu-item index="1-5">Delete</el-menu-item>
          <el-sub-menu index="1-6">
            <template #title>Print</template>
            <el-menu-item index="1-6-1">Print Preview</el-menu-item>
            <el-menu-item index="1-6-2">Page Setup</el-menu-item>
          </el-sub-menu>
          <el-menu-item index="1-7">Quit</el-menu-item>
        </el-sub-menu>

        <el-sub-menu index="2">
          <template #title>Edit</template>
          <el-menu-item index="2-1">Undo</el-menu-item>
          <el-menu-item index="2-2">Repeat Edit</el-menu-item>
          <el-menu-item index="2-3">Cut</el-menu-item>
          <el-menu-item index="2-4">Copy</el-menu-item>
          <el-menu-item index="2-5">Paste</el-menu-item>
          <el-menu-item index="2-6">Clear</el-menu-item>
          <el-menu-item index="2-7">Find</el-menu-item>
          <el-menu-item index="2-8">Replace</el-menu-item>
          <el-menu-item index="2-9">Go To</el-menu-item>
          <el-menu-item index="2-10">Go Back</el-menu-item>
        </el-sub-menu>

        <el-sub-menu index="3">
          <template #title>View</template>
          <el-menu-item index="3-1">View Page</el-menu-item>
          <el-menu-item index="3-2">View Index</el-menu-item>
          <el-menu-item index="3-3">See Table of Contents</el-menu-item>
          <el-menu-item index="3-4">Show Alternative Document</el-menu-item>
        </el-sub-menu>

        <el-sub-menu index="4">
          <template #title>Format</template>
          <el-sub-menu index="4-1">
            <template #title>Character Style</template>
            <el-menu-item index="4-1-1">Plain Text</el-menu-item>
            <el-menu-item index="4-1-2">Bold</el-menu-item>
            <el-menu-item index="4-1-3">Italic</el-menu-item>
            <el-menu-item index="4-1-4">Underline</el-menu-item>
          </el-sub-menu>
          <el-menu-item index="4-2">Format Paragraph</el-menu-item>
          <el-sub-menu index="4-3">
            <template #title>Lay Out Document</template>
            <el-menu-item index="4-3-1">Position on Page</el-menu-item>
          </el-sub-menu>
          <el-menu-item index="4-4">Change Font</el-menu-item>
          <el-menu-item index="4-5">Increase Point Size</el-menu-item>
          <el-menu-item index="4-6">Decrease Point Size</el-menu-item>
        </el-sub-menu>

        <el-sub-menu index="5">
          <template #title>Insert</template>
          <el-menu-item index="5-1">Insert Graphic</el-menu-item>
          <el-menu-item index="5-2">Insert Index Entry</el-menu-item>
          <el-menu-item index="5-3">Renumber Pages</el-menu-item>
          <el-menu-item index="5-4">Add Footnote</el-menu-item>
          <el-menu-item index="5-5">Add Page Break</el-menu-item>
          <el-menu-item index="5-6">Table</el-menu-item>
          <el-menu-item index="5-7">Glossary</el-menu-item>
        </el-sub-menu>

        <el-sub-menu index="6">
          <template #title>Tools</template>
          <el-menu-item index="6-1">Check Spelling</el-menu-item>
          <el-menu-item index="6-2">Count Words</el-menu-item>
          <el-menu-item index="6-3">Repaginate</el-menu-item>
        </el-sub-menu>

        <el-sub-menu index="7">
          <template #title>Mail</template>
          <el-menu-item index="7-1">Send Mail</el-menu-item>
        </el-sub-menu>

        <el-sub-menu index="8">
          <template #title>Help</template>
          <el-menu-item index="8-1">Help</el-menu-item>
        </el-sub-menu>

        <el-sub-menu index="9">
          <template #title>Options</template>
          <el-menu-item index="9-1">Preferences</el-menu-item>
        </el-sub-menu>

      </el-menu>
    </el-header>
    <el-main>
      <el-input
          v-model="textarea"
          :rows="22"
          type="textarea"
          placeholder="Please input"
      />
    </el-main>
    <el-footer>

    </el-footer>
  </el-container>
</template>


<style lang="scss" scoped>
  .el-container {
    left: 0;
    top: 0;
    position: absolute;
    margin: 0;
    padding: 10px;
    height: 100%;
    width: 100%;
  }
  .el-header {
    width: 100%;
    padding: 0;
    height: 30px;
    .el-menu-demo {
      height: 40px;
    }
  }
  .el-main {
    align-items: stretch;
    padding:20px;
    .le-input {
      min-height: 100%;
      width: 100%;
    }
  }
  .el-footer {
    height: 30px;
    width: 100%;
    background: #545c64;
  }

</style>



1.右键项目点击add frameworks support选择maven项目
依赖下载完成后
2.点击file选择project structure 选择jdk版本
  点击module若无则添加，有者点击该项目，打开src选择java选择为source，选择resources选择为resource
  点击facets点击+添加web，添加deployment descriptors选择为路径的web.xml不要默认
  添加web source directories选择webapp文件夹
  apply，
  点击create artifact（若无则apply后关闭再进入）
  点击artifact 右键available element项目右键put into Output root

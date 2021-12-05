const tree = {
    val: 1,
    children: [
      {
        val: 1,
        children: [
          {val: 7}
        ]
      },
      {
        val: 3,
        children: [
          {val: 55}
        ]
      },
      {
        val: 2,
        children: [
          {val: 15}
        ]
      },
      {
        val: 7,
        children: [
          {val: 2}
        ]
      }
    ]
  };

  const tree1 = {
    val: 1,
    children: [
      {
        val: 2,
        children: [
          {
            val: 7,
            children: [
              {val: 2},
              {val: 18},
              {val: 12}
            ]
          }
        ]
      },
      {
        val: 4,
        children: [
          {val: 5},
          {
            val: 6,
            children: [
              {val: 12},
              {val: 11},
              {val: 10},
              {val: 9},
            ]
          },
          {val: 13}
        ]
      },
      {
        val: 3,
        children: [
          {val: 15}
        ]
      },
      {
        val: 17,
        children: [
          {val: 16},
          {
            val: 2,
            children: [
              {val: 14},
              {val: 11},
              {
                val: 18,
                children: [
                  {val: 4},
                  {val: 11},
                  {val: 7}
                ]
              },
              {val: 27},
              {val: 18},
              {val: 29},
            ]
          }
        ]
      }
    ]
  };

const prioritizeNodes = (tree, targetVal) => { 
    const DFS = (tree) => {
        const children = tree.children;
        if(!children){
            return tree.val === targetVal;
        }
        let pri = tree.val === targetVal;
        for(let i = children.length - 1, j = -1; i > j; i--){
            const node = children[i];
            const result = DFS(node, targetVal);
            if(result || node.val === targetVal){
                children.splice(i, 1);
                children.unshift(node);
                i++;
                j++;
                pri = true;
            } 
        }
        return pri;
    }
    DFS(tree);
    return tree;
};

console.log(prioritizeNodes(tree1, 18));